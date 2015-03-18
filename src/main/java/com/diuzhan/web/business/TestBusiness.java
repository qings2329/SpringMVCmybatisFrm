package com.diuzhan.web.business;

import java.util.Date;

import com.diuzhan.web.bean.TestTable;
import com.diuzhan.web.dao.ITestTableDAO;

public class TestBusiness {
	private ITestTableDAO testDAO=null; 
    public ITestTableDAO getTestDAO() { 
        return testDAO; 
    } 
    public void setTestDAO(ITestTableDAO testDAO) { 
        this.testDAO = testDAO; 
    } 
    public void add() throws Exception{ 
        TestTable test=new TestTable(); 
        test.setName("diuzhanTest"); 
        test.setBirthday(new Date()); 
        try { 
            testDAO.add(test); 
        } catch (Exception e) { 
            // TODO Auto-generated catch block 
            throw e; 
        } 
    } 
}
