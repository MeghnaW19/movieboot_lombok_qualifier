package com.stackroute.movieboot.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.stackroute.movieboot.domain.Movie;
@Service
@Qualifier("MovieServiceImpl2")
public class MovieServiceImpl2 implements MovieService{

	@Override
	public Movie saveMovie(Movie movie) {
		System.out.println("movie is saved");
		return null;
	}

	@Override
	public List<Movie> getallMovie() {
		System.out.println("all movies");
		return null;
	}

	@Override
	public boolean deleteMovie(int movieId) {
		System.out.println("movie is deleted");
		return false;
	}

	@Override
	public boolean updateMovie(Movie movie) {
		System.out.println("movie is updated");
		return false;
	}

	@Override
	public Movie getbyId(int movieId) {
		System.out.println("movie by id");
		return null;
	}

	@Override
	public Movie getbyTitle(String movieTitle) {
		System.out.println("movie by title");
		return null;
	}

	@Override
	public Movie getbyRating(int movieRating) {
		System.out.println("movie by rating");
		return null;
	}

	@Override
	public Movie getbyYear(int releaseYear) {
		System.out.println("movie by year");
		return null;
	}

	@Override
	public List<Movie> getByMovieAlpha(String searchTerm) {
		System.out.println("movie by alpha");
		return null;
	}

}
