package com.stackroute.movieboot.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.*;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovieNotFoundException extends RuntimeException {

  

public MovieNotFoundException(String exception) {
    super(exception);
  }
}
