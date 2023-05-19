package u4_w3_d5;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

//@Table(name = "Riviste")
public class Riviste extends CatalogoBibliotecario {

	private Periodicita periodicita;

	public Riviste(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);

		this.periodicita = periodicita;
	}

	public Riviste() {
		super();

	}

}
