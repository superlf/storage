package com.commons.pubfun;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.commons.exception.DataException;
import com.commons.utils.MyBatisUtils;

public class PFSerialno {
    static Logger log = Logger.getLogger(PFSerialno.class.getName()); 
    private final String MAPPER = "com.commons.pubfun.PubFunMapper.";
    SqlSession sqlSession = null;
    
    
    
    /**
     * <p>生成对应位数的流水号<p>
     * 1.查询数据库中是否有该标识
     *      如果有取出值+1;如果没有则创建为0同时+1;
     * 2.拿到值后根据位数补位
     * 
     * @param code 流水号类型
     * @param len 流水号长度
     * @return 生成的流水号
     */
    public static String makeNo(String codetype, int len){
        
        if(len>20){
            throw new DataException("流水号长度不能超过20位！");
        }
        
        PFSerialno pfs = new PFSerialno();
        String max_no = pfs.getAndUpdMaxno(codetype);
        
        while(max_no.length()< len){
            max_no = "0" + max_no;
        }
        return max_no;
    }
    
    
    
    private String getAndUpdMaxno(String codetype){
        try{
            this.sqlSession = MyBatisUtils.getSqlSession();
            Integer serialno = this.sqlSession.selectOne(this.MAPPER+"S_maxno",codetype);
            
            Map<String,Object> map = new HashMap<String,Object>();
            if(serialno==null){
                serialno = 1;
                map.put("codetype", codetype);
                map.put("serialno", serialno);
                map.put("makedate", PFDate.getCurrentDate());
                map.put("resource", codetype);
                this.sqlSession.insert(this.MAPPER+"I_maxno",map);
            }else{
                serialno += 1;
                map.put("codetype", codetype);
                map.put("serialno", serialno);
                this.sqlSession.update(this.MAPPER+"U_maxno",map);
            }
            this.sqlSession.commit();
            return serialno+"";
        }catch(Exception e){
            e.printStackTrace();
            throw new DataException("获取或更新流水号异常!原因为："+e.getMessage());
        }finally {
            MyBatisUtils.closeSqlSession(this.sqlSession);
        }
            
        
        
    }
    
    
    public static void main(String[] args) {
        String aa = PFSerialno.makeNo("hah", 10);

        System.out.println(aa);
        
    }
    
    
    

    
    

}
