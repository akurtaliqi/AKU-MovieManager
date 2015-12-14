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
     * Constructeur paramétré de la classe Person. Toutes les valeurs sont
     * obligatoires.
     *
     * @param id Le numéro identifiant de la personne
     * @param firstName Le prénom du client
     * @param lastName Le nom du client
     */
    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new HashMap();
    }

    /**
     * Méthode qui ajoute un film à la personne
     *
     * @param movie Le film à ajouter à la liste.
     * @throws ch.hearc.ig.odi.moviemanager.exception.MovieException Exception levée si le film a déjà été ajouté à la liste
     */
    public void addMovie(Movie movie) throws MovieException {
        if(movies.containsKey(movie.getId())) {
            throw new MovieException("Film deja vu !");
        } else {
            movie.getPersonnes().put(this.id, this);
            this.movies.put(movie.getId(), movie);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<Long, Movie> getMovies() {
        return movies;
    }

    public void setMovies(HashMap<Long, Movie> movies) {
        this.movies = movies;
    }

}
