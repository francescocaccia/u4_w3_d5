package u4_w3_d5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Libro extends CatalogoBibliotecario {

	private String autore;
	private String genere;

	public Libro(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore,
			String genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

}