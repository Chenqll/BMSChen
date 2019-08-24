package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
private String dbUrl="jdbc:mysql://localhost:3306/dbbook";//�������ݿ�ĵ�ַ
private String dbUserName="root";
private String dbPassword="root";
private String jdbcName="com.mysql.jdbc.Driver";//��������
/**
 * �������õĻ�ȡ���ݿ����ӵķ���
 */
 public Connection getCon() throws Exception{
	 Class.forName(jdbcName);
	 Connection con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
	 return con;
	 
 }
 /**
  * �ر����ݿ�����
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
		System.out.println("���ݿ����ӳɹ�");
		
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("���ݿ�����ʧ��");
	}
}
 
 
}
