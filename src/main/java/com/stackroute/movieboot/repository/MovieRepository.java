package com.stackroute.movieboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.movieboot.domain.Movie;


@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {
public Movie getByMovieTitle(String movieTitle);
public Movie getByMovieId(int movieId);
public Movie getByMovieRating(int movieRating);
public Movie getByreleaseYear(int releaseYear);
@Query("SELECT movie FROM Movie movie WHERE movie.movieTitle LIKE CONCAT(:searchTerm,'%')")
public List<Movie> getByMovieAlpha(String searchTerm);
}
