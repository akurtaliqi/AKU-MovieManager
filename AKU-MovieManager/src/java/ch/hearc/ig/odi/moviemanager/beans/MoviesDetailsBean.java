/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.services.Services;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ajtene.kurtaliq
 */
@Named(value = "moviesDetailsBean")
@RequestScoped
public class MoviesDetailsBean {

    @Inject
    Services services;
    private Movie movie;

    /**
     * Get the movie to display
     *
     * @param p_movie The movie to display
     * @return "display" if correct parameter, "error" if null parameter
     */
    public String showMovie(Movie p_movie) {
        if (p_movie != null) {
            movie = p_movie;
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

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}
