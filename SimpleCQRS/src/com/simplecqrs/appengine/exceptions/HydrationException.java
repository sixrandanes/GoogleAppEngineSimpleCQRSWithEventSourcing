package com.simplecqrs.appengine.exceptions;

import java.util.UUID;

/**
 * Exception that is thrown when the hydration of an aggregate fails.
 * This can occur during the loading from a repository as well as
 * during the "apply" methods when there is a reflection based exception.
 */
public class HydrationException extends Exception {

    private static final String ERROR_TEXT = "Loading the data failed";

    private static final long serialVersionUID = 1L;

    private UUID aggregateId;

    /**
     * Default constructor
     * 
     * @param aggregateId
     */
    public HydrationException(UUID aggregateId){
        super(ERROR_TEXT);
        this.aggregateId = aggregateId;
    }

    /**
     * Constructor to provide specific error reason for the hydration exception
     * 
     * @param aggregateId
     * @param error
     */
    public HydrationException(UUID aggregateId, String error){
        super(error);
        this.aggregateId = aggregateId;
    }

    /**
     * Get the aggregate Id
     * 
     * @return
     */
    public UUID getAggregateId(){
        return aggregateId;
    }
}
