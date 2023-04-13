package com.ajax;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {

	private final MovieRepository movieRepository;
	
	public String movieInsert(Movieinform movieinform) {
		Movie movie = movieinform.createMovie();
		
		movieRepository.save(movie);
		
		return "DB Insert 성공";
	}
}
