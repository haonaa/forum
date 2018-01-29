package forum.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.DetachedCriteria;

import forum.dao.IusersDao;
import forum.entity.Users;

@Resource
public class UsersDaoImpl extends BaseDao implements IusersDao {

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
