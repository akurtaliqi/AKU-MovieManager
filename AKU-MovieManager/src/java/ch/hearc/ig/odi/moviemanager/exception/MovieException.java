/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.exception;

/**
 *
 * @author ajtene.kurtaliq
 */
public class MovieException extends Exception {

    public MovieException() {
        super();
    }

    /**
     *
     * @param message
     */
    public MovieException(String message) {
        super(message);
    }
}
