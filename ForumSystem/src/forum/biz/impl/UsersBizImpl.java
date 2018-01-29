package forum.biz.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import forum.biz.IusersBiz;
import forum.dao.IusersDao;
import forum.entity.Users;

@Repository
public class UsersBizImpl implements IusersBiz{
	
	IusersDao iusersDao;
	
	public List<Users> findAll() throws Exception {
		return iusersDao.selectAll();
	}

	public void add(Users users) throws Exception {
		iusersDao.insert(users);
	}

	public void remove(Users users) throws Exception {
		iusersDao.delete(users);
	}

	public void update(Users users) throws Exception {
		iusersDao.update(users);
	}

	public Users findById(int id) throws Exception {
		return iusersDao.selectById(id);
	}

}
