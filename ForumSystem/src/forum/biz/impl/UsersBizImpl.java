package forum.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import forum.biz.IUsersBiz;
import forum.dao.IUsersDao;
import forum.entity.Users;

@Service
public class UsersBizImpl implements IUsersBiz{
	@Resource
	private IUsersDao usersDao;
	
	public List<Users> findAll() throws Exception {
		return usersDao.selectAll();
	}

	public void add(Users users) throws Exception {
		usersDao.insert(users);
	}

	public void remove(Users users) throws Exception {
		usersDao.delete(users);
	}

	public void update(Users users) throws Exception {
		usersDao.update(users);
	}

	public Users findById(int id) throws Exception {
		return usersDao.selectById(id);
	}

}
