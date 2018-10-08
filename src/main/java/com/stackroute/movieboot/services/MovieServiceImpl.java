package com.stackroute.movieboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.stackroute.movieboot.domain.Movie;
import com.stackroute.movieboot.exceptions.MovieNotFoundException;
import com.stackroute.movieboot.repository.MovieRepository;
@Service
@Qualifier("MovieServiceImpl")
public class MovieServiceImpl implements MovieService{

	private MovieRepository movieRepository;

	
	@Autowired
	public MovieServiceImpl(MovieRepository movieRepository) {
		//super();
		this.movieRepository = movieRepository;
	}

	@Override
	public Movie saveMovie(Movie movie) {
		
		Movie savedMovie=movieRepository.save(movie);
		return savedMovie;
	}

	@Override
	public List<Movie> getallMovie() {
	List<Movie>	list=(List<Movie>) movieRepository.findAll();
	return list;
	}

	@Override
	public boolean deleteMovie(int movieId) {
		
		if(movieRepository.existsById(movieId)) {
			movieRepository.deleteById(movieId);
		return true;
		}
		else 
			return false;
	}

	@Override
	public boolean updateMovie(Movie movie) {
		
		movieRepository.save(movie);
		return true;
	}

	@Override
	public Movie getbyId(int movieId) {
		Movie movie=movieRepository.getByMovieId(movieId);
		return movie;
	}

	@Override
	public Movie getbyTitle(String movieTitle) {
		
		Movie movie=movieRepository.getByMovieTitle(movieTitle);
		return movie;
	}

	@Override
	public Movie getbyRating(int movieRating) {
		Movie movie=movieRepository.getByMovieRating(movieRating);
		return movie;
	}

	@Override
	public Movie getbyYear(int releaseYear) {
		Movie movie=movieRepository.getByreleaseYear(releaseYear);
		return movie;
	}

	@Override
	public List<Movie> getByMovieAlpha(String searchTerm) {
		List<Movie> list=movieRepository.getByMovieAlpha(searchTerm);
		return list;
	}

}
