package com.commons.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public final class MyBatisUtils {
    
    private static InputStream config = null;
    private static SqlSessionFactory factory = null;
    private static SqlSession ss = null;
    
    static{
        try {
            //1.读取核心配置文件
            config = Resources.getResourceAsStream("config/mybatis-config.xml");
            
            //2.获取SqlSessionFactory 相当与Connection
            factory = new SqlSessionFactoryBuilder().build(config);
                       
        } catch (IOException e) {
            throw new RuntimeException("加载核心配置文件失败，原因是:"+e.getMessage());
        }finally {
            if(ss!=null){
                ss.close();
            }
        }
    }
    
    // 3.获取SQLSession 相当于执行SQL语句对象
    public static SqlSession getSqlSession() {
        
        return factory.openSession();
    }
    
    // 0.关闭session
    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
    

}



