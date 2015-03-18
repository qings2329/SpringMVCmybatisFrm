package com.diuzhan.web.utils;
import org.apache.ibatis.session.SqlSession;

public class BasicSqlSupport {
	 	protected SqlSession session;

	    public SqlSession getSession() { 
	        return session; 
	    } 
	    public void setSession(SqlSession session) { 
	        this.session = session; 
	    } 
}
