package forum.web;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import forum.biz.IPostBiz;
import forum.entity.Post;

public class TestAction extends ActionSupport {
	@Resource
	private IPostBiz postBiz;
	private Post post;
	
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String test() throws Exception {
		
		Post postCondition=new Post();
		postCondition.setPid(1);
		
		this.post=postBiz.find(postCondition);
		
		return ActionSupport.SUCCESS;
	}
	
	
	
	

}
