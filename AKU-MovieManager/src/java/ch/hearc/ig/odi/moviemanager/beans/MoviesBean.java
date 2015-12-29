/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.services.Services;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ajtene.kurtaliq
 */
@Named(value = "moviesBean")
@RequestScoped
public class MoviesBean {

    @Inject
    Services services;
    
    private DataModel<Movie> movies;

    /**
     * Get a list of people
     *
     * @return list of people
     
    public List<Movie> getMovies() {
        return services.getMoviesList();
    }
    * */
    
    public DataModel<Movie> getMovies() {
        movies = new ListDataModel<>();
        movies.setWrappedData(services.getMoviesList());
        
        return movies;
    }

}
