package forum.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.HibernateTemplate;

import forum.dao.IBaseDao;
import forum.entity.PageInfo;


public class BaseDao<T> implements IBaseDao<T> {
	@Resource
	protected HibernateTemplate hibernateTemplate;
	@Override
	public List<T> selectAll(Class clz) throws Exception {
		DetachedCriteria criteria = DetachedCriteria.forClass(clz);
		return (List<T>) this.hibernateTemplate.findByCriteria(criteria);
	}

	@Override
	public void select(PageInfo<T> pageInfo, DetachedCriteria dc)
			throws Exception {
		// 查询符合条件的总记录数
		dc.setProjection(Projections.rowCount());
		Integer totalRecord = (Integer) this.hibernateTemplate.findByCriteria(
				dc).get(0);
		pageInfo.setTotal(totalRecord);

		// 查询符合条件的当前页的记录集合
		dc.setProjection(null);
		dc.setResultTransformer(CriteriaSpecification.ROOT_ENTITY);
		int firstResult = (pageInfo.getCurrentPage() - 1)
				* pageInfo.getPageSize();
		List<T> list = (List<T>) this.hibernateTemplate.findByCriteria(dc, firstResult,
				pageInfo.getPageSize());

		pageInfo.setRows(list);
	}

	@Override
	public void insert(T t) throws Exception {
		this.hibernateTemplate.save(t);
	}

	@Override
	public T select(Serializable id, Class clz) throws Exception {
		return (T) this.hibernateTemplate.get(clz, id);
	}

	@Override
	public void update(T t) throws Exception {
		this.hibernateTemplate.update(t);
	}

	@Override
	public void delete(T t) throws Exception {
		this.hibernateTemplate.delete(t);
	}

	@Override
	public List<T> select(DetachedCriteria dc) throws Exception {
		// TODO Auto-generated method stub
		return (List<T>) this.hibernateTemplate.findByCriteria(dc);
	}


	
}
