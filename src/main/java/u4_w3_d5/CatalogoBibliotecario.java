package u4_w3_d5;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Entity
@NoArgsConstructor
public abstract class CatalogoBibliotecario {
	@Id
	@GeneratedValue
	private String codiceISBN;
	private String titolo;
	private int annoPubblicazione;
	private int numeroPagine;

	public CatalogoBibliotecario() {
	}

	public CatalogoBibliotecario(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine) {
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}

}
