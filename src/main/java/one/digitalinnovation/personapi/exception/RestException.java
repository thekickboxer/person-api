package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class RestException {

    public static void lancar(HttpStatus statusCode, String mensagem) {
        throw new ResponseStatusException(statusCode, mensagem);
    }

}
