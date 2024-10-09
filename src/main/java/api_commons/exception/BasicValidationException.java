package api_commons.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BasicValidationException extends RuntimeException {

  private final String errorCode;
  private final Integer statusCode;

  protected BasicValidationException(String message, String errorCode) {
    super(message);
    this.errorCode = errorCode;
    this.statusCode = HttpStatus.BAD_REQUEST.value();
  }

}
