package com.ajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajax.dto.AjaxDTO;

@Controller
public class AjaxController {

	@GetMapping("/ex01")
	public String ex01() {
		
		System.out.println("ajaxController ex01 요청 성공");
		
		return "index";	//index.html 소스코드에 작성된 내용이 그대로 출력됨.  <index.html>의 소스코드가 전송
	}
	
	@PostMapping("/ex02")
	@ResponseBody
	public String ex02() {
		
		System.out.println("ajaxController ex02 요청 성공");
		
		return "안녕하세요";	//리턴에 문자열을 그대로 전송하기 위해서는 @ResponseBody 어노테이션 적용
	}
	
	@GetMapping("/ex03")		// ajax에서 param1 , param2 를 넘겨준다.
	@ResponseBody
	public String ex03(@RequestParam("param1") String param1,@RequestParam("param2") String param2) {
		
		System.out.println("ajaxController ex03 요청 성공");
		System.out.println("param1 : "+param1 + ", param2 : "+param2);
		
		return "ex03 처리완료 "+ param1 + param2;	
	}
	
	@PostMapping("/ex04")		// ajax에서 param1 , param2 를 넘겨준다.
	public @ResponseBody String ex04(@RequestParam("param1") String param1,
					@RequestParam("param2") String param2) {
		
		System.out.println("ajaxController ex04 요청 성공");
		System.out.println("param1 : "+param1 + ", param2 : "+param2);
		
		return "ex04 처리완료"+ param1 + param2;	
		
	}	
	
		@GetMapping("/ex05")		// ajax에서 param1 , param2 를 넘겨준다.
														// @ModelAttribute : client가 넘긴 parameter를 DTO에 저장(생략 가능)
														// DTO 객체로 return
		public @ResponseBody AjaxDTO ex05(@ModelAttribute AjaxDTO ajaxDTO ) {
			System.out.println("ajaxController ex05 요청 성공");
			System.out.println("ajaxDTO : "+ ajaxDTO);
			
			//BackEnd DB의 로직을 처리 후 DB의 레코드 하나를 DTO객체에 저장 후 리턴
			
			return ajaxDTO;	
	}
		
		@PostMapping("/ex06")		// ajax에서 param1 , param2 를 넘겨준다.
														// @ModelAttribute : client가 넘긴 parameter를 DTO에 저장(생략 가능)
														// DTO 객체로 return
		public @ResponseBody AjaxDTO ex06(@ModelAttribute AjaxDTO ajaxDTO ) {
			System.out.println("ajaxController ex06 요청 성공");
			System.out.println("ajaxDTO : "+ ajaxDTO);
			
			//BackEnd DB의 로직을 처리 후 DB의 레코드 하나를 DTO객체에 저장 후 리턴
			
			return ajaxDTO;	
		}
		
		@PostMapping("/ex07")		// ajax에서 param1 , param2 를 넘겨준다.
		// @RequestBody로 client가 넘긴 parameter가 JSON형식이라고 선언했을 때 DTO에 저장(생략 가능)
		// DTO 객체로 return
		public @ResponseBody AjaxDTO ex07(@RequestBody AjaxDTO ajaxDTO ) {
			System.out.println("ajaxController ex07 요청 성공");
			System.out.println("ajaxDTO : "+ ajaxDTO);
			
			//BackEnd DB의 로직을 처리 후 DB의 레코드 하나를 DTO객체에 저장 후 리턴
			
			return ajaxDTO;	
		}
		
		@PostMapping("/ex08")		// ajax에서 param1 , param2 를 넘겨준다.
		// @RequestBody로 client가 넘긴 parameter가 JSON형식이라고 선언했을 때 DTO에 저장(생략 가능)
		// List<DTO> 객체로 return
		public @ResponseBody List<AjaxDTO> ex08(@RequestBody AjaxDTO ajaxDTO ) {
			System.out.println("ajaxController ex08 요청 성공");
			System.out.println("ajaxDTO : "+ ajaxDTO);
			
			//BackEnd DB의 로직을 처리 후 DB의 레코드 하나를 List<DTO>객체에 저장 후 리턴
			List<AjaxDTO> dtoList = new ArrayList<>();
			dtoList.add(ajaxDTO);					//index 0
			dtoList.add(new AjaxDTO("data1","data2"));		//index1
			dtoList.add(new AjaxDTO("data11","data22")); //index2
			
			return dtoList;	
		}
		
		@PostMapping("/ex09")		// ajax에서 param1 , param2 를 넘겨준다.
		// @RequestBody로 client가 넘긴 parameter가 JSON형식이라고 선언했을 때 DTO에 저장(생략 가능)
		// ResponseEntity 객체를 return : DATA + Http 상태 코드까지 리턴
			// client에서 더 세밀한 컨트롤을 처리할 때 사용. 두개를 같이 넘겨서 
		//@ResponseBody : 리턴되는 값이 String ,Data(DTO) 적은값,List<dto> 많은값 <-- Data만 전송 
		
		public ResponseEntity ex09(@RequestBody AjaxDTO ajaxDTO ) {
			System.out.println("ajaxController ex09 요청 성공");
			System.out.println("ajaxDTO : "+ ajaxDTO);
			
			//BackEnd DB의 로직을 처리 후 DB의 레코드 하나를 DTO객체에 저장 후 리턴
			
		return new ResponseEntity<>(ajaxDTO, HttpStatus.OK);	
//				return new ResponseEntity<>(ajaxDTO, HttpStatus.NOT_FOUND);	
		}
		
		@PostMapping("/ex10")		// ajax에서 param1 , param2 를 넘겨준다.
		// @RequestBody로 client가 넘긴 parameter가 JSON형식이라고 선언했을 때 DTO에 저장(생략 가능)
		// ResponseEntity 객체를 return : DATA + Http 상태 코드까지 리턴
		// client에서 더 세밀한 컨트롤을 처리할 때 사용. 두개를 같이 넘겨서 
		//@ResponseBody : 리턴되는 값이 String ,Data(DTO) 적은값,List<dto> 많은값 <-- Data만 전송 
		
		public ResponseEntity ex10(@RequestBody AjaxDTO ajaxDTO ) {
			System.out.println("ajaxController ex10 요청 성공");
			System.out.println("ajaxDTO : "+ ajaxDTO);
			
			//BackEnd DB의 로직을 처리 후 DB의 레코드 하나를 DTO객체에 저장 후 리턴
			List<AjaxDTO> dtoList = new ArrayList<>();
			dtoList.add(ajaxDTO);					//index 0
			dtoList.add(new AjaxDTO("data1","data2"));		//index1
			dtoList.add(new AjaxDTO("data11","data22")); //index2
			
			return new ResponseEntity<>(dtoList, HttpStatus.OK);	
//			return new ResponseEntity<>(ajaxDTO, HttpStatus.NOT_FOUND);	
		}
		
		@PostMapping("/Ajax_lab")		
		public @ResponseBody Integer Ajax_lab(@RequestBody AjaxDTO ajaxDTO ) {
				
			//BackEnd DB의 로직을 처리 후 DB의 레코드 하나를 DTO객체에 저장 후 리턴
			Integer sum = Integer.parseInt(ajaxDTO.getParam1())+Integer.parseInt(ajaxDTO.getParam2());
			return sum;
		}
		

		
}
