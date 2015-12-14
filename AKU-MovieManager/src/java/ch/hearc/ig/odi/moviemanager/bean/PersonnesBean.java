/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.bean;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.services.Services;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ajtene.kurtaliq
 */
@Named(value = "personnesBean")
@RequestScoped
public class PersonnesBean {

    @Inject
    Services services;

    /**
     * Retourne une liste de clients
     *
     * @return Une liste de clients
     */
    public List<Person> getPeopleList() {
        return services.getPeopleList();
    }

}
