//package com.stackroute.movieboot.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//import com.stackroute.movieboot.domain.Movie;
//import com.stackroute.movieboot.repository.MovieRepository;
//@Component
//public class BootstrapCmd implements CommandLineRunner {
//	private MovieRepository movieRepository;
//    private Movie movie;
//
//	 public BootstrapCmd(MovieRepository movieRepository) {
//		super();
//		this.movieRepository = movieRepository;
//	}
//
//
//
//
//
//
//	
//	  
//
//
//
//
//		@Override
//		public void run(String... args) throws Exception {
//			 Movie movie = new Movie();
//		        movie.setMovieTitle("solo");
//		        movieRepository.save(movie);
//		        Movie testMovie = Movie.builder()
//		                .movieTitle("foo")
//		                .build();
//		        movieRepository.save(testMovie);// TODO Auto-generated method stub
//			
//		}
//
//}
