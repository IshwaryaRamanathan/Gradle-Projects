package DAO;
import java.sql.*;
import java.util.*;
import Model.Student;

public class StudentDAO {
	
	Connection c;
	
	public Connection getConnection() {
		
		JDBC j=new JDBC();
		c=j.getConnection();
		return c;
		
	}
		
	public List<Student> getAll(){
		
		List<Student> list=new ArrayList<Student>();
		String SQL_SELECT = "Select * from student1";
		
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery(SQL_SELECT);
			
			while(rs.next()) {
				int rno=rs.getInt("RNO");
				String sname=rs.getString("SNAME");
				String email=rs.getString("EMAIL");
				int phone=rs.getInt("PHONE");
				
				Student s1=new Student();
				s1.setRno(rno);
				s1.setSname(sname);
				s1.setEmail(email);
				s1.setPhone(phone);
				
				list.add(s1);
			}
			
			list.forEach(x -> System.out.println(x));
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return list;
		
	}
	
	public Student getByRno(int n) {
		
		Student s1=new Student();		
		
		try {
			
			PreparedStatement pst=c.prepareStatement(
	"select rno,sname,email,phone from student1 where rno=?");
			pst.setInt(1, n);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				int rno=rs.getInt(1);
				String sname=rs.getString(2);
				String email=rs.getString(3);
				int phone=rs.getInt(4);
				
				s1.setRno(rno);
				s1.setSname(sname);
				s1.setEmail(email);
				s1.setPhone(phone);
			}
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return s1;
	}
	
	public void insertStudent(int rno,String name,String email,int phone) {
		
		String SQL_INSERT=
				"insert into student1 values(?,?,?,?)";
		
		try {
			
			PreparedStatement pst=
					c.prepareStatement(SQL_INSERT);
			pst.setInt(1, rno);
			pst.setString(2,name);
			pst.setString(3, email);
			pst.setInt(4,phone);
			pst.execute();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	public void updateStudent(int rno,String name) {
		
		String SQL_UPDATE=
				"update student1 set sname= ? where rno=?";
		
		try {
			PreparedStatement pst=
					c.prepareStatement(SQL_UPDATE);
			pst.setString(1,name);			
			pst.setInt(2,rno);
			pst.execute();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
