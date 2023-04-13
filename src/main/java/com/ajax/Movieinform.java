package com.ajax;


import org.modelmapper.ModelMapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Movieinform {
	
		private String adult;
		
		private String backdrop_path;
		
		private Integer genre_ids;
		
		private Integer id;
		
		private String original_language;
		
		private String original_title;
		
		private String overview;
		
		private double popularity;
		
		private String poster_path;
		
		private String release_date;
		
		private String title;
		
		private String video;
		
		private double vote_average;
		
		private Integer vote_count;
		
		private static ModelMapper modelMapper = new ModelMapper();
		
		//Client form 에서 넘어오는 값을 DTO에 담아서 Movie Entity 클래스에 적용 후 DB에 저장
		public Movie createMovie() {
			return modelMapper.map(this, Movie.class);
		}
			//DB에서 가져온 Movie Entity 클래스를 DTO에 주입해서 Client로 전송하기 위한 매핑
			public static Movieinform of(Movie movie) {
		        return modelMapper.map(movie,Movieinform.class);
		    }
	
}
