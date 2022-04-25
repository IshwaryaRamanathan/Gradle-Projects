package DAO;
import Model.*;
import java.sql.*;
import java.util.*;

public class CourseDAO {
	Connection c;
	public Connection getConnection() {
		JDBC j=new JDBC();
		c=j.getConnection();
		return c;
	}
	
	public List<Course> getAll(){
		List<Course> courselist=new ArrayList<Course>();
		
		try {
			PreparedStatement pst=c.prepareStatement("select * from course");
			ResultSet r=pst.executeQuery();
			while(r.next()) {
				int id=r.getInt(1);
				String code=r.getString(2);
				String name=r.getString(3);
				
				Course c1=new Course();
				c1.setCourseid(id);
				c1.setCoursecode(code);
				c1.setCoursename(name);
				
				courselist.add(c1);
			}
			//courselist.forEach(c-> System.out.println(c));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return courselist;
	}
	
	public Course getById(int id) {
		Course c1=new Course();
		
		try {
			PreparedStatement pst=c.prepareStatement("select coursecode,coursename from course where courseid=?");
			pst.setInt(1, id);
			ResultSet r=pst.executeQuery();
			while(r.next()) {
				String code=r.getString(1);
				String name=r.getString(2);
								
				c1.setCourseid(id);
				c1.setCoursecode(code);
				c1.setCoursename(name);
				System.out.println(c1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return c1;
	}
	
	public void insert(int id,String code,String name) {
		
		try {
			PreparedStatement pst=c.prepareStatement("insert into course values (?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, code);
			pst.setString(3, name);
			pst.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void update(String code,String name) {
		
		try {
			PreparedStatement pst=c.prepareStatement("update course set coursename=? where coursecode=?");
			pst.setString(1, name);
			pst.setString(2, code);
			pst.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		try {
			PreparedStatement pst=c.prepareStatement("delete from course where courseid=?");
			pst.setInt(1, id);			
			pst.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
