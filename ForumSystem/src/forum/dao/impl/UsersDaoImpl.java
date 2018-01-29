package forum.dao.impl;

import java.util.List;


import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import forum.dao.IUsersDao;
import forum.entity.Users;

@Repository
<<<<<<< HEAD
public class UsersDaoImpl extends BaseDao implements IusersDao {
=======
public class UsersDaoImpl extends BaseDao implements IUsersDao {
>>>>>>> 362a4d2036cc52a4fe620dae3156800df523944b

	public List<Users> selectAll() throws Exception {
		DetachedCriteria criteria=DetachedCriteria.forClass(Users.class);
		List<Users> uList = (List<Users>) hibernateTemplate.findByCriteria(criteria);
		return uList;
	}

	public void insert(Users users) throws Exception {
		hibernateTemplate.save(users);

	}
	
	public void delete(Users users) throws Exception {
		hibernateTemplate.delete(users);
		
	}

	public void update(Users users) throws Exception {
		hibernateTemplate.update(users);
		
	}

	public Users selectById(int id) throws Exception {
		Users users = hibernateTemplate.load(Users.class, id);
		return users;
	}

}
