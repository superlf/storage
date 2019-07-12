package com.login.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bean.schema.LoginLog;
import com.bean.schema.User;
import com.commons.exception.DataException;
import com.commons.utils.MyBatisUtils;
import com.login.dao.LoginDao;

@Repository
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
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw new RuntimeException("123123123");
        }finally{
            MyBatisUtils.closeSqlSession(this.sqlSession);
        }
    }

   @Override
   public boolean addLoginLog(LoginLog loginLog) {
       try{
           this.sqlSession = MyBatisUtils.getSqlSession();
           log.info("登陆日志的ID为："+loginLog.getLogin_id());
           
           Map<String,Object> map = new HashMap<String,Object>();
           map.put("LoginID", loginLog.getLogin_id());
           map.put("Account", loginLog.getAccount());
           
           this.sqlSession.insert(this.MAPPER+"I_loginLog",loginLog);
           this.sqlSession.update(this.MAPPER+"U_user_loginID",map);
           
           this.sqlSession.commit();
           return true;
       }catch(Exception e){
           e.printStackTrace();
           throw new DataException("插入登陆日志异常！原因：" +e.getMessage());
       }finally{
           MyBatisUtils.closeSqlSession(this.sqlSession);
       }
   } 
    
   @Override
    public boolean loginOut(Map<String,Object> map){
       try{
           this.sqlSession = MyBatisUtils.getSqlSession();
           
           this.sqlSession.update(this.MAPPER+"U_loginLog_DateTime",map);
           
           this.sqlSession.commit();
           return true;
       }catch(Exception e){
           e.printStackTrace();
           throw new DataException("更新登陆日志失败！原因：" +e.getMessage());
       }finally{
           MyBatisUtils.closeSqlSession(this.sqlSession);
       }
    }
   
   
   
    public static void main(String[] args) {
        
    }

}
