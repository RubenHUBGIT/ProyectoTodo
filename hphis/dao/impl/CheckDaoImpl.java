package com.hphis.dao.impl;

import com.hphis.corp.hibernate.util.HibernateUtil;
import com.hphis.dao.CheckDao;
import com.hphis.pojo.CheckPojo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class CheckDaoImpl implements CheckDao {

    @Override
    public String getPhrase(Integer id) {
        Session session = HibernateUtil.currentSession();

        CheckPojo pojo = session.get(CheckPojo.class, id);
        return pojo.getPhrase();
    }

    @Override
    public CheckPojo getPojo(Integer id) {
        Session session = HibernateUtil.currentSession();
        Criteria criteria = session.createCriteria(CheckPojo.class);
        criteria.add(Restrictions.eq("id", id));
        return (CheckPojo)criteria.list().get(0);
    }

    @Override
    public void save(CheckPojo pojo) {
        Session session = HibernateUtil.currentSession();
        session.save(pojo);
    }
    
}
