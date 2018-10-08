package com.stackroute.movieboot.exceptions;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovieAlreadyExistsException extends Exception{
	
	public MovieAlreadyExistsException(String exception) {
	    super(exception);
	  }
}
