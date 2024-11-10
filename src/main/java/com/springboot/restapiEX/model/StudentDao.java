package com.springboot.restapiEX.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	
	// 데이터 저장용 리스트
	List<StudentDto> students = new ArrayList<>();
	
	// 생성자 - 리스트에 데이터 저장
	public StudentDao() {
		students.add(new StudentDto(101, "Park", 22, "Music"));
		students.add(new StudentDto(102, "Kim", 20, "Computer"));
		students.add(new StudentDto(103, "Lee", 25, "Dance"));
		students.add(new StudentDto(104, "Kwon", 23, "Baseball"));
	}
	
	// 전체 데이터 반환 함수
	public List<StudentDto> getStudentList(){
		return students;
	}
	
	// 데이터 추가 함수
	public void insertStudent(StudentDto student) {
		students.add(student);
	}
	
	// 데이터 수정 함수
	public void updateStudent(StudentDto student) {
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getSid() == student.getSid()) {
				students.set(i, student);
				break;
			}
		}
	}
	
	// 데이터 삭제 함수
	public void deleteStudent(int sid) {
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getSid() == sid) {
				students.remove(i);
				break;
			}
		}
	}

}
