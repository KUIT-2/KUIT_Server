package kuit2.server.common.exception;

import kuit2.server.common.response.status.ResponseStatus;
import lombok.Getter;
import org.apache.catalina.Store;

@Getter
public class StoreException extends RuntimeException {

    private final ResponseStatus exceptionStatus;

    public StoreException(ResponseStatus exceptionStatus) {
        super(exceptionStatus.getMessage());
        this.exceptionStatus = exceptionStatus;

    }

    public StoreException(ResponseStatus exceptionStatus, String message) {
        super(message);
        this.exceptionStatus = exceptionStatus;
    }
}
