package edu.mum.cs.cs425.studentmgmt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

@Entity
public class Classroom {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classroomId; 
	
	@NotNull
	private String buildingName; 
	
	@NotNull
	private String roomNumber;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "classroom")
	List<Student> students = new ArrayList<>();

	public Classroom() {}

	public Classroom(String buildingName, String roomNumber) {
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}

	public Classroom(String buildingName, String roomNumber, List<Student> students) {
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		this.students = students;
	}

	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void removeStudent(Student student) {
		this.students.remove(student);
	}

	@Override
	public String toString() {
		return String.format("Classroom [classroomId=%s, buildingName=%s, roomNumber=%s, students=%s]", classroomId,
				buildingName, roomNumber, students);
	}
	
}
