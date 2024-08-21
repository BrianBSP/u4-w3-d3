package brianpelinku.entities;

import brianpelinku.enums.Stato;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue
    private UUID id;
    private Persona persona;
    private Evento evento;
    @Enumerated(EnumType.STRING)
    private Stato stato;
}
