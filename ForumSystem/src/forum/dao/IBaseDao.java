package forum.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import forum.entity.PageInfo;



public interface IBaseDao<T> {

	List<T> selectAll(Class clz) throws Exception;
	/**
	 * 按条件查询,无分页
	 */
	public abstract List<T> select(DetachedCriteria dc) throws Exception;
	
	/**
	 * 按条件查询
	 */
	public abstract void select(PageInfo<T> pageInfo,DetachedCriteria dc) throws Exception;

	public abstract void insert(T t) throws Exception;

	public abstract T select(Serializable id,Class clz)throws Exception;

	public abstract void update(T t)throws Exception;

	public abstract void delete(T t)throws Exception;
}
