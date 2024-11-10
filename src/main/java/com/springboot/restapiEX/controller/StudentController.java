package com.springboot.restapiEX.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapiEX.model.StudentDao;
import com.springboot.restapiEX.model.StudentDto;

@RestController
public class StudentController {
	
	// 객체 주입
	@Autowired
	StudentDao sService;
	
	@RequestMapping(value="/welcomeStudent")
	public String welcomeStudent() {
		return "Welcome";
	}
	
	// get 방식으로 데이터 요청 (데이터 조회)
	@GetMapping("/students")
	public List<StudentDto> getStudentList(){
		return sService.getStudentList();
	}
	
	// post 방식으로 데이터 요청 (데이터 저장)
	// @RequestBody : json 형식 데이터를 객체 형식으로 변환
	@PostMapping("/students")
	public void insertStudent(@RequestBody StudentDto student) {
		sService.insertStudent(student);
	}
	
	// put 방식으로 데이터 요청 (데이터 수정)
	@PutMapping("/students")
	public void updateStudent(@RequestBody StudentDto student) {
		sService.updateStudent(student);
	}
	
	// delete 방식으로 데이터 요청 (데이터 삭제)
	// @PathVariable : 파라미터 데이터 사용
	@DeleteMapping("/students/{sid}")
	public void deleteStudent(@PathVariable int sid) {
		sService.deleteStudent(sid);
	}

}
