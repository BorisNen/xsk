package com.sap.xsk.xsjob.ds.api;

/**
 * The Data Structures Exception.
 */
public class XSJobDataStructuresException extends Exception {

    private static final long serialVersionUID = 5800180600419241248L;

    /**
     * Instantiates a new data structures exception.
     */
    public XSJobDataStructuresException() {
        super();
    }

    /**
     * Instantiates a new data structures exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     * @param enableSuppression
     *            the enable suppression
     * @param writableStackTrace
     *            the writable stack trace
     */
    public XSJobDataStructuresException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Instantiates a new data structures exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public XSJobDataStructuresException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new data structures exception.
     *
     * @param message
     *            the message
     */
    public XSJobDataStructuresException(String message) {
        super(message);
    }

    /**
     * Instantiates a new data structures exception.
     *
     * @param cause
     *            the cause
     */
    public XSJobDataStructuresException(Throwable cause) {
        super(cause);
    }
}
