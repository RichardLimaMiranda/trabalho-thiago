package com.ibeus.Comanda.Digital.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ComandaException extends RuntimeException {

  private static final String TITLE_MESSAGE = "Erro no sistema de comanda";

  private final String title;

  private final String description;

  private final HttpStatus status;

  public ComandaException(String description, HttpStatus httpStatus) {
    this.title = TITLE_MESSAGE;
    this.description = description;
    this.status = httpStatus;
  }
}
