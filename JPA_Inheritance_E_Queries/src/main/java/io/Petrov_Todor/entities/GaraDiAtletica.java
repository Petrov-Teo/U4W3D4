package io.Petrov_Todor.entities;

import java.util.List;

public class GaraDiAtletica extends Evento {
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
