package com.login.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.bean.schema.LoginLog;
import com.bean.schema.User;
import com.commons.exception.DataException;
import com.commons.utils.MyBatisUtils;
import com.login.dao.LoginDao;

public class LoginDaoImpl implements LoginDao {
    static Logger log = Logger.getLogger(LoginDaoImpl.class.getName()); 
    private final String MAPPER = "com.login.dao.LoginMapper.";
    SqlSession sqlSession = null;
    
   @Override
    public User login(User user) {
        try{
            this.sqlSession = MyBatisUtils.getSqlSession();
            user = this.sqlSession.selectOne(this.MAPPER+"S_login",user);
            if(user == null){
                throw new DataException("用户名或者密码错误，请重新输入！！");
            }else{
                log.info("获得该用户的信息："+user.toString());
                return user;
            }
        }finally{
            MyBatisUtils.closeSqlSession(this.sqlSession);
        }
    }

   @Override
   public boolean addLoginLog(LoginLog loginLog) {
       try{
           this.sqlSession = MyBatisUtils.getSqlSession();
           this.sqlSession.insert(this.MAPPER+"I_loginLog",loginLog);
           log.info("登陆日志的ID为："+loginLog.getLogin_id());
           this.sqlSession.commit();
           return true;
       }catch(Exception e){
           e.printStackTrace();
           throw new DataException("插入登陆日志异常！原因：" +e.getMessage());
       }finally{
           MyBatisUtils.closeSqlSession(this.sqlSession);
       }
   } 
    
   
   
   
   
   public static void main(String[] args) {
        
    }

}
