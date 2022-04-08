package com.hphis.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.hphis.corp.hibernate.util.HibernateUtil;
import com.hphis.dao.PacienteDao;
import com.hphis.pojo.Paciente;

public class PacienteDaoImpl implements PacienteDao {

  
    @Override
    public List<Paciente> getPacientes() {
        Session session = HibernateUtil.currentSession();
        Criteria criteria = session.createCriteria(Paciente.class);
        return criteria.list();
    }

}
