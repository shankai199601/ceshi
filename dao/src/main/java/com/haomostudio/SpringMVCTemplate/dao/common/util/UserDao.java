package com.haomostudio.SpringMVCTemplate.dao.common.util;

/**
 * @Author: ShanKai
 * @Description:
 * @Date:Created in 9:03 2018/8/3
 */

import ch.qos.logback.core.db.dialect.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class UserDao {

    //根据用户名查找用户
    public User findUserByName(String userName){
        //编写sql语句
        String sql="select * from USER_INFO where name=?";
        //获得连接
        Connection conn= DBUtil.getConnection();
        //有返回的结果
        ResultSet rs= null;
        //实例化一个User对象
        User user = new User();
        try {
            //用来发送sql语句的
            PreparedStatement ps = conn.prepareStatement(sql);
            //设置要传入的参数，这里是userN
            ps.setString(1, userName);
            //执行sql语句
            rs=ps.executeQuery();
            //如果能找到结果
            if(rs.next()){
                //则把找到的结果一一set进User对象中
                user.setUid(rs.getInt(1));
                user.setUserName(rs.getString(2));
                user.setUserPass(rs.getString(3));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {//关闭连接
            DBUtil.closeConn(conn, null, rs);
        }
        //最后要把这个user返回出去
        return user;

    }

    //添加用户
    //在这里把整个用户对象传进来
    public int addUser(User user){
        //编写sql语句
        String sql = "insert into USER_INFO values(?,?,?)";
        Connection conn= DBUtil.getConnection();
        //有返回的结果
        ResultSet rs= null;
        int i=0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //这些参数是要保存到数据的
            ps.setInt(1, user.getUid());
            ps.setString(2, user.getUserName());
            ps.setString(3, user.getUserPass());
            //执行sql语句
            i=ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            DBUtil.closeConn(conn, null, rs);
        }
        return i;
    }
    public static void main(String[] args) {
        UserDao dao = new UserDao();
        User i = dao.findUserByName("zhang");
        System.out.println(i.getUserPass());

    }
}
