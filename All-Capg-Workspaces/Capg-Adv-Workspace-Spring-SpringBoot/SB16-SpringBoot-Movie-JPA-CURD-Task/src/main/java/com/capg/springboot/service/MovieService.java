package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.entity.Movie;

public interface MovieService {
	
int addMovie(Movie movie);
	
	Movie updateMovieById(int id, Movie movie);
	
	List<Movie> getAllMovies();
	
	void deleteMovieById(int id);
	
	Movie getMovieById(int id);
	
	
}
