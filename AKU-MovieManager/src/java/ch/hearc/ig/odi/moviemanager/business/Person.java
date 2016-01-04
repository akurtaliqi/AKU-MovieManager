/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.business;

import ch.hearc.ig.odi.moviemanager.exception.MovieException;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author ajtene.kurtaliq
 */
public class Person implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private HashMap<Long, Movie> movies;

    public Person() {
    }

    /**
     * Parametred constructor of the class Person.
     * All the values are obligatory
     *
     * @param id Person's id
     * @param firstName Person's first name
     * @param lastName Person's last name
     */
    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new HashMap();
    }

    /**
     * Add movie to the person
     * @param movie The movie to add to the llist
     * @throws ch.hearc.ig.odi.moviemanager.exception.MovieException Exception raised if the movies has already been added
     */
    public void addMovie(Movie movie) throws MovieException {
        if(movies.containsKey(movie.getId())) {
            throw new MovieException("Film deja vu !");
        } else {
            movie.getPersonnes().put(this.id, this);
            this.movies.put(movie.getId(), movie);
        }
    }
    
    /**
     * 
     * @return Person's id
     */

    public Long getId() {
        return id;
    }
    
    /**
     * 
     * @param id 
     * Set the person's ID with the parameter id
     */

    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * 
     * @return Person's FirstName
     */

    public String getFirstName() {
        return firstName;
    }
    
    /**
     * 
     * @param firstName 
     * Set the person's firstName with the parameter firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * 
     * @return Person's LastName
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * 
     * @param lastName 
     * Set the person's lastName with the parameter lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * 
     * @return Person's movies list
     */
    public HashMap<Long, Movie> getMovies() {
        return movies;
    }
    
    /**
     * 
     * @param movies 
     * Set the person's movies list with the parameter movies
     */

    public void setMovies(HashMap<Long, Movie> movies) {
        this.movies = movies;
    }

}
