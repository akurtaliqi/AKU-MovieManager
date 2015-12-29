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
     * Constructeur paramétré de la classe Movie. 
     * Toutes les valeurs sont obligatoires.
     * @param id Le numéro identifiant du film
     * @param name Le titre du film
     * @param producer Le nom du réalisateur
     */
    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.personnes = new HashMap();
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

    public HashMap<Long, Person> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(HashMap<Long, Person> personnes) {
        this.personnes = personnes;
    }
    
    public List<Person> getPeople() {
        return new ArrayList<>(personnes.values());
    }

}
