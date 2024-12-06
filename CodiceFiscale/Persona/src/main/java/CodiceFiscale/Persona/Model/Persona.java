package CodiceFiscale.Persona.Model;

// Utilizzo la libreria Lombok perchè mi genera automaticamente getter, setter, costruttori,
// rendendo il codice più pulito e leggibile.
import lombok.Data;

import java.time.LocalDate;

@Data
public class Persona {
    private LocalDate dataNascita;
    private int eta;
}
