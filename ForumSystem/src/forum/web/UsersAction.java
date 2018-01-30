package forum.web;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import forum.biz.IUsersBiz;
import forum.entity.Users;

public class UsersAction extends ActionSupport{
	@Resource
	private IUsersBiz usersBiz;
	
	private Users users;
	private List<Users> userList;
	

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<Users> getUserList() {
		return userList;
	}

	public void setUserList(List<Users> userList) {
		this.userList = userList;
	}

	public String findall() throws Exception {
		userList = usersBiz.findAll();
		return SUCCESS;
	}
	
	public String add() throws Exception {
		usersBiz.add(users);
		return SUCCESS;
	}
	
	public String delete() throws Exception {
		usersBiz.remove(users);
		return SUCCESS;
	}
	
	public String update() throws Exception {
		usersBiz.update(users);
		return SUCCESS;
	}
	
	public String findById() throws Exception{
		users = usersBiz.findById(users.getUid());
		return SUCCESS;
	}

}
