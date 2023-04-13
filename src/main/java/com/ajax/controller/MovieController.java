package com.ajax.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajax.MovieService;
import com.ajax.Movieinform;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MovieController {
	
	private final MovieService movieService; 
	
	@PostMapping("/movie/put") 
	public @ResponseBody String lab2(@RequestBody Movieinform movieinform) {
		System.out.println("AjaxController ex07 요청 성공");
		System.out.println("ajaxDTO : " + movieinform);

//BackEnd DB의 로직을 처리후 DB의 레코드 하나를 DTO 객체에 저장후 리턴 

		
		String str = movieService.movieInsert(movieinform); 
		
		return str;
	}
		
		
	
}
