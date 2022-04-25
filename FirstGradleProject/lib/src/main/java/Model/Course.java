package Model;

public class Course {
	int courseid;
	String coursecode;
	String coursename;
	
	public Course() {
		super();
	}
	
	public Course(int courseid, String coursecode, String coursename) {
		super();
		this.courseid = courseid;
		this.coursecode = coursecode;
		this.coursename = coursename;
	}
	
	public int getCourseid() {
		return courseid;
	}
	
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	
	public String getCoursecode() {
		return coursecode;
	}
	
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	
	public String getCoursename() {
		return coursename;
	}
	
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	public String toString() {
		return "Course [ Id = "+courseid+", Code = "+coursecode+", Name = "+coursename+"]\n";
	}
}
