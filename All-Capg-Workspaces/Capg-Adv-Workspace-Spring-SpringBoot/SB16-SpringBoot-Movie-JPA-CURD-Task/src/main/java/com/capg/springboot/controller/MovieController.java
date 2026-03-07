package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Movie;
import com.capg.springboot.exception.MovieNotFoundException;
import com.capg.springboot.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/add")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
		
		movieService.addMovie(movie);
		ResponseEntity<Movie> responseEntity= new ResponseEntity(movie,HttpStatus.OK);
		return responseEntity;
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Movie> updateMovieById(@RequestBody Movie movie,@PathVariable int id) {
		movieService.updateMovieById(id,movie);
		ResponseEntity<Movie> responseEntity= new ResponseEntity(movie,HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Movie>> getAllMovies() {
		List<Movie> mList = movieService.getAllMovies();
		ResponseEntity<List<Movie>> responseEntity= new ResponseEntity(mList,HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/{id}")
	public String deleteMovieById(@PathVariable int id) {
		movieService.deleteMovieById(id);
		return "Deleted";
	}

	@GetMapping("/{id}")
	public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
		Movie movie = movieService.getMovieById(id);
		if(movie == null) {
			throw new MovieNotFoundException("Movie Not Found");
		}
		ResponseEntity<Movie> responseEntity= new ResponseEntity<Movie>(movie,HttpStatus.OK);
		return responseEntity;
	}
}
