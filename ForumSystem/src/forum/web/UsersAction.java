package forum.web;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import forum.biz.IusersBiz;
import forum.entity.Users;

public class UsersAction extends ActionSupport{
	@Resource
	private IusersBiz iusersBiz;
	private Users users;
	private List<Users> uList;
	
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<Users> getuList() {
		return uList;
	}

	public void setuList(List<Users> uList) {
		this.uList = uList;
	}

	public String findAll() throws Exception {
		uList = iusersBiz.findAll();
		return SUCCESS;
	}
	
	public String add() throws Exception {
		iusersBiz.add(users);
		return SUCCESS;
	}
	
	public String delete() throws Exception {
		iusersBiz.remove(users);
		return SUCCESS;
	}
	
	public String update() throws Exception {
		iusersBiz.update(users);
		return SUCCESS;
	}
	
	public String findById() throws Exception{
		users = iusersBiz.findById(users.getUid());
		return SUCCESS;
	}

}