package io.Petrov_Todor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class GaraDiAtletica extends Evento {
    @ManyToMany
    protected List<Person> atleti;

    protected Person vincitore;

    public GaraDiAtletica(List<Person> atleti, Person vincitore) {
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public List<Person> getAtleti() {
        return atleti;
    }

    public void setAtleti(List<Person> atleti) {
        this.atleti = atleti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
