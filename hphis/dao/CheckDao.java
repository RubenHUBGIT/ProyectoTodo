package com.hphis.dao;

import com.hphis.pojo.CheckPojo;

public interface CheckDao {

    public String getPhrase(Integer id);

    public CheckPojo getPojo (Integer id);

    public void save(CheckPojo pojo);

}
