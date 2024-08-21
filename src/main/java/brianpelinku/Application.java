package brianpelinku;

import brianpelinku.dao.EventoDAO;
import brianpelinku.dao.LocationDAO;
import brianpelinku.dao.PartecipazioneDAO;
import brianpelinku.dao.PersonaDAO;
import brianpelinku.entities.Evento;
import brianpelinku.enums.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.Month;
import java.util.UUID;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4_w3_d3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        EventoDAO ed = new EventoDAO(em);
        PersonaDAO pd = new PersonaDAO(em);
        PartecipazioneDAO ptd = new PartecipazioneDAO(em);
        LocationDAO ld = new LocationDAO(em);

        // ------------ creazione e salvataggio eventi, persone, locations

        Evento evento1 = new Evento("ferragosto", LocalDate.of(2024, Month.AUGUST, 15), "evento estivo", TipoEvento.PUBBLICO, 100);
        Evento evento2 = new Evento("notte rosa", LocalDate.of(2024, Month.JULY, 4), "evento estivo", TipoEvento.PUBBLICO, 150);
        Evento evento3 = new Evento("settimana bianca", LocalDate.of(2024, Month.JANUARY, 4), "evento invernale", TipoEvento.PUBBLICO, 150);

        // ed.save(evento1);
        // ed.save(evento2);
        // ed.save(evento3);

        ed.getById(UUID.fromString("cd29c17e-5bbe-4ff9-be1c-f35a790faf62"));

        System.out.println("Hello World!");


        em.close();
        emf.close();
    }


}
