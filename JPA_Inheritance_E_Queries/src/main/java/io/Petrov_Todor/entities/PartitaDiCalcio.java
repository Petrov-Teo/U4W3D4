package io.Petrov_Todor.entities;

import jakarta.persistence.Entity;

@Entity
public class PartitaDiCalcio extends Evento {
    protected String squadraDiCasa;
    protected String squadraOspite;
    protected String vincente;
    protected int golSquadraDiCasa;
    protected int golSquadraOspite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, String vincente, int golSquadraDiCasa, int golSquadraOspite) {
        super();
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.vincente = vincente;
        this.golSquadraDiCasa = golSquadraDiCasa;
        this.golSquadraOspite = golSquadraOspite;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getVincente() {
        return vincente;
    }

    public void setVincente() {
        if (golSquadraDiCasa == golSquadraOspite) {
            this.vincente = null; // È un pareggio
        } else if (golSquadraDiCasa > golSquadraOspite) {
            this.vincente = squadraDiCasa; // Vince la squadra di casa
        } else {
            this.vincente = squadraOspite; // Vince la squadra ospite
        }
    }

    public int getGolSquadraDiCasa() {
        return golSquadraDiCasa;
    }

    public void setGolSquadraDiCasa(int golSquadraDiCasa) {
        this.golSquadraDiCasa = golSquadraDiCasa;
    }

    public int getGolSquadraOspite() {
        return golSquadraOspite;
    }

    public void setGolSquadraOspite(int golSquadraOspite) {
        this.golSquadraOspite = golSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", vincente='" + vincente + '\'' +
                ", golSquadraDiCasa=" + golSquadraDiCasa +
                ", golSquadraOspite=" + golSquadraOspite +
                '}';
    }
}
