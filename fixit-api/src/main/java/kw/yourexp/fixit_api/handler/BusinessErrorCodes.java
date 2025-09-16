package kw.yourexp.fixit_api.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public enum BusinessErrorCodes {
    NO_CODE(0, HttpStatus.NOT_IMPLEMENTED, "No code"),
    INCORRECT_CURRENT_PASSWORD(300, HttpStatus.BAD_REQUEST, "Current password is incorrect"),
    NEW_PASSWORD_DOES_NOT_MATCHED(301, HttpStatus.BAD_REQUEST, "New password does not matched"),
    ACCOUNT_LOCKED(302, HttpStatus.FORBIDDEN, "Your account is locked"),
    ACCOUNT_DISABLED(303, HttpStatus.FORBIDDEN, "Your account is disabled"),
    BAD_CREDENTIALS(304, HttpStatus.FORBIDDEN, "Login username and / or password is incorrect")
    ;
    @Getter
    private final int code;
    @Getter
    private final String description;
    @Getter
    private final HttpStatus httpStatus;

    BusinessErrorCodes(int code, HttpStatus httpStatus, String description) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.description = description;
    }
}
