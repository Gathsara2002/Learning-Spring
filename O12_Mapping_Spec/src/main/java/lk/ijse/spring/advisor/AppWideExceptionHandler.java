package lk.ijse.spring.advisor;

/**
 * @author : Gathsara
 * created : 10/13/2023 -- 9:37 PM
 **/

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AppWideExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseUtil handleExceptions(RuntimeException e) {
        return new ResponseUtil("Error", e.getMessage(), null);
    }
}
