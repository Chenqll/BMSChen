package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
private String dbUrl="jdbc:mysql://localhost:3306/dbbook";//连接数据库的地址
private String dbUserName="root";
private String dbPassword="root";
private String jdbcName="com.mysql.jdbc.Driver";//驱动名称
/**
 * 让外界调用的获取数据库连接的方法
 */
 public Connection getCon() throws Exception{
	 Class.forName(jdbcName);
	 Connection con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
	 return con;
	 
 }
 /**
  * 关闭数据库连接
  */
 public void closeCon(Connection con)throws Exception{
	 if(con!=null){
		 con.close();
	 }
 }
 public static void main(String[] args) {
	DbUtil dbUtil=new DbUtil();
	try{
		dbUtil.getCon();
		System.out.println("数据库连接成功");
		
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("数据库连接失败");
	}
}
 
 
}
