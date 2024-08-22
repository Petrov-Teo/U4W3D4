package io.Petrov_Todor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Concerto extends Evento {
    @Enumerated(EnumType.STRING)
    protected GenereMusicale genereMusicale;
    protected Boolean inStreaming;

    public Concerto(GenereMusicale genereMusicale, Boolean inStreaming) {
        this.genereMusicale = genereMusicale;
        this.inStreaming = inStreaming;
    }

    public GenereMusicale getGenereMusicale() {
        return genereMusicale;
    }

    public void setGenereMusicale(GenereMusicale genereMusicale) {
        this.genereMusicale = genereMusicale;
    }

    public Boolean getInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(Boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genereMusicale=" + genereMusicale +
                ", inStreaming=" + inStreaming +
                '}';
    }
}
