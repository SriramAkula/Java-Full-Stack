package com.capg.springboot.repository;

import java.util.List;

import com.capg.springboot.entity.Movie;

public interface MovieRepository {
	
	int addMovie(Movie movie);
	
	Movie updateMovieById(int id, Movie movie);
	
	List<Movie> getAllMovies();
	
	void deleteMovieById(int id);
	
	Movie getMovieById(int id);
	
}
