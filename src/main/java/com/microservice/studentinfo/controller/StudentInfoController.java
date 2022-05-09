package com.microservice.studentinfo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.studentinfo.model.StudentInfo;

@RestController
@RequestMapping("/student-info")
public class StudentInfoController {

	private static List<StudentInfo> studentInfos = Arrays.asList(new StudentInfo(1,"1123", "Ive Andrića 12", "email@email.com", "065065065", "1","Računarstvo i informatika"),
			new StudentInfo(2,"1124", "Branka Ćopića 14", "email@email.com", "065065065", "2","Energetika"),
			new StudentInfo(3,"1125", "Jove Zmaja 13", "email@email.com", "065065065", "3","Automatika i elektronika"),
			new StudentInfo(4,"1126", "Nikole Tesle 15", "email@email.com", "065065065", "4","Računarstvo i informatika"));

	@GetMapping("/all")
	public List<StudentInfo> findAll(){
		return studentInfos;
	}
	
	@GetMapping
	public StudentInfo findByIndex(@RequestParam("index") String index) throws Exception{
		return studentInfos.stream().filter(e -> e.getIndex().equals(index)).findFirst()
				.orElseThrow(() -> new Exception("Nije pronađen student sa indexom: "+index+"!"));
	}
	
}
