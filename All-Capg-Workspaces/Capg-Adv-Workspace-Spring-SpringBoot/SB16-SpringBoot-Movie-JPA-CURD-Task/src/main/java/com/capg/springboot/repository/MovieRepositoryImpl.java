package com.capg.springboot.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.springboot.entity.Movie;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public int addMovie(Movie movie) {
		
		em.persist(movie);		
		return movie.getMid();
	}

	@Override
	public Movie updateMovieById(int id,Movie movie) {
		
		Movie mov= em.find(Movie.class, id);
		mov.setMname(movie.getMname());
		mov.setGenre(movie.getGenre());
		
		return mov;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> getAllMovies() {
		
		Query q = em.createQuery("select m from Movie m");
		List<Movie> movieList = q.getResultList();
		
		return movieList;
	}

	@Override
	public void deleteMovieById(int id) {
		Movie movie = getMovieById(id);
		em.remove(movie);
	}

	@Override
	public Movie getMovieById(int id) {
		
		Movie movie= em.find(Movie.class, id);
		
		if(movie==null) {
			
		}
		return movie;
	}

}
