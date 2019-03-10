package com.zhj.test;

import com.zhj.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class testMybatis {

    public static void main(String[] args) throws Exception {
        InputStream fis = Resources.getResourceAsStream("conf.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(fis);
        SqlSession sqlSession = build.openSession();
        //User user = sqlSession.selectOne("getUser", 1);查
        //sqlSession.delete("deleteByid",1); 删
        User user =  new User();
        user.setId(2);
        user.setAge(20);
        user.setName("阿爸");
        sqlSession.update("modifyUser",user);
        sqlSession.commit();
        sqlSession.close();
    }
}
