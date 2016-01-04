/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.beans;

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
@Named(value = "personDetailsBean")
@SessionScoped
public class PersonDetailsBean implements Serializable {
    @Inject
    Services services;
    private Person person;

    public PersonDetailsBean() {
    }
    
    /**
     * Recieve in parameter the person to print on the page.
     * @param pers The person to print
     * @return "show" if the person is valid or "error" if the paramter is null
     */
    public String showPerson(Person pers){
        if(pers != null){
            person = pers;
            return "show";
        }else{
            person = null;
            return "error";
        }
    }
    
    /**
     * @return ArrayList The list to print
     * return the movies seen by the person or null if no movies has been seen
     */
    
    public List<Person> getMovies(){
        if(person == null){
            return new ArrayList();
        }
        
        return new ArrayList(person.getMovies().values());
    }

    /**
     * 
     * @return Person
     */
    public Person getPerson() {
        return person;
    }
    
    /**
     * 
     * @param person 
     * set a Person with the parameter person
     */

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
    
    
}
