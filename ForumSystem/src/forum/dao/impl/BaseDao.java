package forum.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDao {
	@Resource
	protected HibernateTemplate hibernateTemplate;
	

}
