package com.capg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Movie;
import com.capg.springboot.repository.MovieRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public int addMovie(Movie movie) {
		return movieRepository.addMovie(movie);
	}

	@Override
	public Movie updateMovieById(int id, Movie movie) {
		return movieRepository.updateMovieById(id,movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.getAllMovies();
	}

	@Override
	public void deleteMovieById(int id) {
		movieRepository.deleteMovieById(id);
	}

	@Override
	public Movie getMovieById(int id) {
		return movieRepository.getMovieById(id);
	}

}
