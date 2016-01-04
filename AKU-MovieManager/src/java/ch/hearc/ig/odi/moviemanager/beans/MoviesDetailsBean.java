/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.services.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ajtene.kurtaliq
 */
@Named(value = "moviesDetailsBean")
@SessionScoped
public class MoviesDetailsBean implements Serializable {

    @Inject
    Services services;
    private Movie movie;

    /**
     * Get the movie to display
     *
     * @param m The movie to display
     * @return "display" if correct parameter, "error" if null parameter
     */
    public String showMovie(Movie m) {
        if (m != null) {
            movie = m;
            return "showmovie";   
        } else {
            return "error";
        }
    }

    /**
     * Get a map of people and convert it to a list of people.
     *
     * @return the list of people who saw the movie
     */
    public List<Person> getPersonMovies() {
        return new ArrayList(movie.getPersonnes().values());
    }
    
    /**
     * 
     * @return movie
     * 
     */

    public Movie getMovie() {
        return movie;
    }
    
    /**
     * 
     * @param movie 
     * set a movie with the parameter movie
     */
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}
