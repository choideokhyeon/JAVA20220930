package Ch36ClassDiagram;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
	private long lectureId;
	private String lectureName;
	private List<Student> studentList;

	public Lecture(long lectureId, String lectureName) {
		super();
		this.lectureId = lectureId;
		this.lectureName = lectureName;
		this.studentList = new ArrayList();
	}

	public void addStudent(Student std)
	{
		studentList.add(std);	//학생을 studentList에 추가
	}
	
	
	
	public long getLectureId() {
		return lectureId;
	}

	public void setLectureId(long lectureId) {
		this.lectureId = lectureId;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		for(Student std : studentList)
		{
			buff.append(std.toString());
		}
		return
			"[과목ID : " + lectureId + "\t|과목명 : " + lectureName + "\t|수강신청 학생 : " + buff + "]";
	}


}
