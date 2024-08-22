package io.Petrov_Todor;

import io.Petrov_Todor.dao.GestioneEventiDAO;
import io.Petrov_Todor.dao.LocationEventsDAO;
import io.Petrov_Todor.dao.ParticipationDAO;
import io.Petrov_Todor.dao.PersonDAO;
import io.Petrov_Todor.entities.PartitaDiCalcio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Gestione EVenti Queries");


    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        GestioneEventiDAO gestioneEventiDAO = new GestioneEventiDAO(em);
        LocationEventsDAO locationEventsDAO = new LocationEventsDAO(em);
        ParticipationDAO participationDAO = new ParticipationDAO(em);
        PersonDAO personDAO = new PersonDAO(em);

        PartitaDiCalcio part1 = new PartitaDiCalcio("Ver", "nap", null, 1, 4);
        part1.setVincente();
        System.out.println(part1);
//        gestioneEventiDAO.save(part1);


        PartitaDiCalcio part2 = new PartitaDiCalcio("Roma", "Torino", null, 1, 1);
        part2.setVincente();
//        gestioneEventiDAO.save(part2);
        
    }

}
