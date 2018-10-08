package com.stackroute.movieboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import com.stackroute.movieboot.domain.Movie;
import com.stackroute.movieboot.repository.MovieRepository;



@Configuration
public class BootStrapData implements ApplicationListener<ContextRefreshedEvent> {
    private MovieRepository movieRepository;
    private Movie movie;

  
    @Autowired
    public BootStrapData(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Movie movie = new Movie();
        movie.setMovieTitle("lagan");
        movieRepository.save(movie);
        Movie testMovie = Movie.builder()
                .movieTitle("foo")
                .build();
        movieRepository.save(testMovie);
        Logger logger = LoggerFactory.getLogger("BootStrapData");
        logger.debug("debugging");
        logger.error("error!!");
        logger.info("Information");
        logger.warn("warning!");
        logger.trace("trace");
    }

}