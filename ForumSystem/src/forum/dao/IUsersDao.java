package forum.dao;

import java.util.List;

import forum.entity.Users;

public interface IUsersDao {
	
	List<Users> selectAll() throws Exception;
	
	void insert(Users users) throws Exception;
	
	void delete(Users users) throws Exception;
	
	void update(Users users) throws Exception;
	
	Users selectById(int id) throws Exception;

}
