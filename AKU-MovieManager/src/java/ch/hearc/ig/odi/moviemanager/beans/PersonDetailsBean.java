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
     * Méthode qui reçoit la personne à afficher sur la page.
     * @param pers La personne à afficher
     * @return "show" si le client est valide, "error" si le paramètre est null
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
    
    public List<Person> getMovies(){
        if(person == null){
            return new ArrayList();
        }
        
        return new ArrayList(person.getMovies().values());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
    
    
}
