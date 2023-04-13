package com.ajax.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor	//모든 필드의 값을 인풋받는 생성자
@ToString		//개발 시 필드의 내용을 확인하기 위해 사용 배포할 때는 지워야함.
@NoArgsConstructor	//기본 생성자
public class AjaxDTO {
	
	private String param1;
	private String param2;
	
}
