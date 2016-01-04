/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ajtene.kurtaliq
 */
public class Movie implements Serializable {

    private Long id;
    private String name;
    private String producer;
    private HashMap<Long, Person> personnes;

    /** 
     * Parametred constructor of the class Movie.
     * All the values are obligatory.
     * @param id ID of the movie
     * @param name Movie's title
     * @param producer Producer's name
     */
    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.personnes = new HashMap();
    }
    
    /**
     * 
     * @return Movie's ID
     */

    public Long getId() {
        return id;
    }
    
    /**
     * 
     * @param id 
     * Set the movie's ID with the parameter ID
     */

    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * 
     * @return Movie's title
     * 
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param name 
     * Set the Movie's title with the parameter name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return Movie's producer
     * 
     */
    public String getProducer() {
        return producer;
    }
    
    /**
     * 
     * @param producer 
     * 
     * Set the Movie's producer with the parameter name
     */

    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    /**
     * 
     * @return HashMap<Long,Person> 
     * Person's List who have seen the movie
     */

    public HashMap<Long, Person> getPersonnes() {
        return personnes;
    }
    
    /**
     * 
     * @param personnes 
     * Set the person's who have seen the movie with the parameter personnes
     */
    public void setPersonnes(HashMap<Long, Person> personnes) {
        this.personnes = personnes;
    }
    
    /**
     * 
     * @return List<Person>
     */
    public List<Person> getPeople() {
        return new ArrayList<>(personnes.values());
    }

}
