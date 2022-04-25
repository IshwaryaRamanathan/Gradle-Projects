package HibStudent;
import java.io.File;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibDemo {
	public static void main(String[] args) {
		
	String confFile ="hibernate.cfg.xml";
	
	ClassLoader classLoader = HibDemo.class.getClassLoader();
	File f = new File(classLoader.getResource(confFile).getFile());
	
	SessionFactory sessionFactory = new Configuration().configure(f).buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	
	updateStudent(session);
	addStudent(session);
	getStudents(session);
	
	session.close();
	}
	
	private static void addStudent(Session session) {
		session.beginTransaction();
		Student1 s1=new Student1(167,"parks","parks24@gmail.com",9024);
		session.save(s1);
		session.getTransaction().commit();
	}
	
	private static void updateStudent(Session session) {
		session.beginTransaction();
		Student1 s1=new Student1();
		s1=(Student1)session.get(Student1.class, 120);
		s1.setSname("puvi");
		session.update(s1);
		session.getTransaction().commit();
	}
	
	
	
	private static void getStudents(Session session) {
		
	Query query = session.createQuery("FROM Student1");
	List<Student1> Students= query.list();
	Students.forEach(obj -> System.out.println(obj.getRno()));
	System.out.println("Reading student records...");
	for(Student1 studentObj : Students) {
		System.out.println("Roll no:"+studentObj.getRno());
		System.out.println("Name:"+studentObj.getSname());
		System.out.println("Email:"+studentObj.getEmail());
		System.out.println("Phone:"+studentObj.getPhone());
		System.out.println("----------------------------------------------");
		}
	}
}