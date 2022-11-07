package Ch36;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private long studentId;
	private String major;
	private List<Lecture> subjectList;
	
	public Student
	(
			String name,
			int age,
			String address,
			Long Id,
			String major
	)
	{
		super(name, age, address);
		this.studentId = Id;
		this.major = major;
		this.subjectList = new ArrayList();
	}

	
	public void study()
	{
		
	}
	
	public void addSubject(Lecture lec)
	{
		subjectList.add(lec);	//subjectList subject 추가
		lec.addStudent(this);	//Lecture에 student 추가
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public List<Lecture> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Lecture> subjectList) {
		this.subjectList = subjectList;
	}


	@Override
	public String toString() {
		return "[studentId=" + studentId + "]";
	}


	
}
