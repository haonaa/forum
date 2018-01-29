package forum.biz;

import java.util.List;

import forum.entity.Users;

public interface IUsersBiz {
	
	List<Users> findAll() throws Exception;
	
	void add(Users users) throws Exception;
	
	void remove(Users users) throws Exception;
	
	void update(Users users) throws Exception;
	
	Users findById(int id) throws Exception;
 
}
