package com.diuzhan.web.dao.impl;

import com.diuzhan.web.bean.TestTable;
import com.diuzhan.web.dao.ITestTableDAO;
import com.diuzhan.web.utils.BasicSqlSupport;

public class ITestTableDAOImpl extends BasicSqlSupport implements ITestTableDAO { 
    @Override 
    public boolean add(TestTable test) throws Exception { 
        boolean flag=false; 
        int count=this.session.insert("com.diuzhan.web.mapper.Test.add",test); 
        if(count>0){ 
            flag=true; 
        } 
        return flag; 
    } 
}
