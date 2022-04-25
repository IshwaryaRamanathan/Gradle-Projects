package Service;
import DAO.*;

public class CourseService {
	public static void main(String []args) {
		CourseDAO c=new CourseDAO();
		c.getConnection();
		System.out.println("\nBEFORE"+c.getAll());
		System.out.println("\n");
		c.getById(120);
		c.insert(171,"CIV473","Basic Mechatronics");
		System.out.println("\nAFTER INSERT\n"+c.getAll());
		c.update("CIV473", "Basic Civil");
		System.out.println("\nAFTER UPDATE\n"+c.getAll());
		c.delete(171);
		System.out.println("\nAFTER DELETE\n"+c.getAll());
	}
}
