package u4_w3_d5;

import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "Libro")
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