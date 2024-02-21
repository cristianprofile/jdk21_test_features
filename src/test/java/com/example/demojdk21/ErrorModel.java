package com.example.demojdk21;

import java.time.Instant;

/**
 * Domain model for errors in an application layer
 */
sealed interface ErrorModel {
  /**
   * Common property
   */
  String message = "";
}

/**
 * Represents a bad request error.
 *
 * @param message Details of the error
 */
record BadRequest(String message) implements ErrorModel {
}

/**
 * Represents an unauthorized access error.
 *
 * @param message Details of the error
 * @param instant Instant of the unauthorized access, specific property
 */
record Unauthorized(String message, Instant instant) implements ErrorModel {
}

/**
 * Represents a forbidden access error.
 *
 * @param message Details of the error
 * @param instant Instant of the forbidden access, specific property
 */
record Forbidden(String message, Instant instant) implements ErrorModel {
}

/**
 * Represents a not found error.
 *
 * @param message Details of the error
 */
record NotFound(String message) implements ErrorModel {
}

/**
 * Represents a conflict error.
 *
 * @param message Details of the error
 */
record Conflict(String message) implements ErrorModel {
}


