package forum.dao;

import java.util.List;

import forum.entity.Users;

public interface IusersDao {
	List<Users> select() throws Exception;
	void insert() throws Exception;

}
