/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.business;

import java.util.ArrayList;

/**
 *
 * @author ajtene.kurtaliq
 */
public class Movie {
    private Long id;
    private String name;
    private String producer;
    private ArrayList<Person> personnes;

    public Movie() {
    }

    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.personnes = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public ArrayList<Person> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(ArrayList<Person> personnes) {
        this.personnes = personnes;
    }

    
    
    
    
}
