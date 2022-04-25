package Service;
import DAO.*;

public class StudentService {
	public static void main(String []args) {
		StudentDAO s=new StudentDAO();
		s.getConnection();
		s.getAll();
		System.out.println("\n");
		s.insertStudent(150,"Rithi","rithi30@gmail.com",8854);
		s.updateStudent(130,"Renshiyo Lynd");
		s.getAll();
		System.out.println("\n");
		System.out.println(s.getByRno(120));		
	}
}
