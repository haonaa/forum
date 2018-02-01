package forum.web;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import forum.biz.IPostBiz;
import forum.entity.Post;
import forum.entity.Users;

public class PostAction extends ActionSupport {
	@Resource
	private IPostBiz postBiz;
	private Post post;
	private HttpSession session;
	
	
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String createPost() {
		
		this.session=ServletActionContext.getRequest().getSession();
		Users user=(Users) session.getAttribute("user");

		Calendar calendar=Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		this.post.setPpubDate(calendar.getTime());
		System.out.println(calendar.getTime());
		
		
		this.post.setUsers(user);
		
		try {
			this.postBiz.add(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Action.SUCCESS;
		
	}

}
