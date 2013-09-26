package com.phonedeck.gcm4j;


/**
 * Exception that is thrown when the GCM server responds with an error.
 */
public class GcmNetworkException extends GcmException {

    private static final long serialVersionUID = -8755599343380178261L;

    private final int code;

    private final String response;

    private final Long retryAfter;

    public GcmNetworkException(int code, String response, Throwable cause) {
        this(code, response, null, cause);
    }

    public GcmNetworkException(int code, String response, Long retryAfter, Throwable cause) {
        super("HTTP " + code + ": " + response, cause);
        this.code = code;
        this.response = response;
        this.retryAfter = retryAfter;
    }

    public int getCode() {
        return code;
    }

    public String getResponse() {
        return response;
    }

    public Long getRetryAfter() {
        return retryAfter;
    }

}
