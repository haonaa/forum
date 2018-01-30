package forum.biz;

import java.util.List;

import forum.entity.PageInfo;
import forum.entity.Post;


public interface IPostBiz {
	/**
	 * 根据pageinfo对象的条件查询post并以列表的形式存进pageinfo
	 * @param pageInfo 
	 * @throws Exception
	 */
	void find(PageInfo<Post> pageInfo)throws Exception;
	/**
	 * 根据post对象创建一条post记录
	 * @param post 
	 * @throws Exception
	 */
	void add(Post post)throws Exception;
	/**
	 * 根据post对象删除一条post记录
	 * @param post 
	 * @throws Exception
	 */
	void remove(Post post)throws Exception;
	/**
	 * 根据post对象修改一条post记录
	 * @param post 
	 * @throws Exception
	 */
	void modify(Post post)throws Exception;
	/**
	 * 根据post对象的值查询该post记录
	 * @param post
	 * @return post记录
	 * @throws Exception
	 */
	Post find(Post post)throws Exception;
	/**
	 * 查询所有post记录并返回
	 * @return post列表
	 * @throws Exception
	 */
	List<Post> findAll()throws Exception;
}
