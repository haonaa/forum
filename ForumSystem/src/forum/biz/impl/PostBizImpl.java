package forum.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import forum.biz.IPostBiz;
import forum.dao.IPostDao;
import forum.entity.PageInfo;
import forum.entity.Post;
@Service
public class PostBizImpl implements IPostBiz {
	@Resource
	private IPostDao postDao;
	
	@Override
	public void find(PageInfo<Post> pageInfo) throws Exception {
		DetachedCriteria dc=DetachedCriteria.forClass(Post.class,"p").createCriteria("p.puid", "u");
		Post post=pageInfo.getCondition();
		if (post != null) {
			if(post.getPid()!=null&&post.getPid()!=0) {
				dc.add(Restrictions.eq("p.pid", post.getPid()));
			}
		}
		
		this.postDao.select(pageInfo,dc);
	}

	@Override
	public void add(Post post) throws Exception {
		this.postDao.insert(post);

	}

	@Override
	public void remove(Post post) throws Exception {
		this.postDao.delete(post);
	}

	@Override
	public void modify(Post post) throws Exception {
		this.postDao.update(post);

	}

	@Override
	public Post find(Post post) throws Exception {
		
		return this.postDao.select(post.getPid(), Post.class);
	}

	@Override
	public List<Post> findAll() throws Exception {
		return this.postDao.selectAll(Post.class);
	}

}
