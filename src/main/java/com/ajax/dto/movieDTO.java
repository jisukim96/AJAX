//package com.ajax.dto;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@AllArgsConstructor	//모든 필드의 값을 인풋받는 생성자
//@ToString		//개발 시 필드의 내용을 확인하기 위해 사용 배포할 때는 지워야함.
//@NoArgsConstructor
//public class movieDTO {
//
//	 @Id
//	    @Column(name="movie_id")
//	    @GeneratedValue(strategy = GenerationType.AUTO)
//		private Long id ; 
//	    
//	    @Column(nullable = false, length = 500)
//		private String backdrop_path; 
//	    
//	    @Column(nullable = false)
//		private Long id_num ; 
//		
//	    @Column(nullable = false, length = 500)
//		private String original_language; 
//		
//	    @Column(nullable = false, length = 500)
//		private String original_title;
//		
//	    @Column(nullable = false, length = 500)
//		private String overview ; 
//		
//	    @Column(nullable = false, length = 500)
//		private String poster_path; 
//		
//	    @Column(nullable = false, length = 500)
//		private String release_date; 
//		
//	    @Column(nullable = false, length = 500)
//		private String title; 
//		
//	    @Column(nullable = false)
//		private Long vote_count; 
//	    
//}
