package HibStudent;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table
public class Student {
	@Id
	private int rno;
	private String sname;
	private String email;
	private int phone;
	
	public Student() {
		super();
	}
	
	public Student(int rno, String sname, String email, int phone) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	
	public int getRno() {
		return rno;
	}
	
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String toString() {
		return "Student [rno="+rno+",sname="+sname+",email="+email+",phone="+phone+"]\n";
	}
	
}
