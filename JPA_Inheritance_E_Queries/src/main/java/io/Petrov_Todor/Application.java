package io.Petrov_Todor;

import io.Petrov_Todor.dao.GestioneEventiDAO;
import io.Petrov_Todor.dao.LocationEventsDAO;
import io.Petrov_Todor.dao.ParticipationDAO;
import io.Petrov_Todor.dao.PersonDAO;
import io.Petrov_Todor.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;

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

        Concerto concertoMadonna = new Concerto(GenereMusicale.CLASSICO, false);
        gestioneEventiDAO.save(concertoMadonna);

        Person person1 = new Person("Teo", "Petrov", "petrov@pigrecoservizi.com", LocalDate.of(1986, 9, 7), GenderType.MALE);
        Person person2 = new Person("Francesca", "Mia", "psdasd@gmail.com", LocalDate.of(1998, 8, 8), GenderType.FEMALE);

        GaraDiAtletica gara1 = new GaraDiAtletica(null, null);
        gara1.setAtleti(List.of(person1, person2));
        gara1.setVincitore(person2);
        System.out.println(gara1);
    }

}
