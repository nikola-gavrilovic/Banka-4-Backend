package rs.edu.raf.korisnik.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class NoviKorisnikDTO {

    @Pattern(regexp = "^[a-zA-Z]+$\n", message = "Samo jedno ili više slova su dozvoljena!")
    private String ime;

    @Pattern(regexp = "^[a-zA-Z]+$\n", message = "Samo jedno ili više slova su dozvoljena!")
    private String prezime;

    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])(0[1-9]|1[0-2])(\\\\d{2})(\\\\d{3})$\n", message = "Nepravilan JMBG!")
    private Long jmbg;

    private Long datumRodjenja;

    @Pattern(regexp = "^[M|F]$", message = "Pol može biti M ili F!")
    private String pol;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Email adresa mora biti validna!")
    private String email;

    @Pattern(regexp = "^(\\+381|0)6[0-6]\\d{6,7}$\n", message = "Broj telefona mora biti formata +381/0 6 0-6 praćen sa 6 ili 7 cifara!")
    private String brojTelefona;

    @NotNull
    private String adresa;

    private boolean aktivan;
}
