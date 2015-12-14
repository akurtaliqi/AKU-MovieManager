/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.services.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ajtene.kurtaliq
 */
@Named(value="personsBean")
@RequestScoped
public class PersonsBean implements Serializable {
    
    @Inject Services services;
    
    /**
     * Get a list of people
     * @return list of people
     */
    public List<Person> getPersons(){
        return services.getPeopleList();
    }
    
}
