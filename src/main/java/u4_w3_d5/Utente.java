package u4_w3_d5;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Utente {

	private String nome;
	private String cognome;
	private int dataDiNascita;
	@Id
	@GeneratedValue
	private UUID numeroTessera;

	public Utente(String nome, String cognome, int dataDiNascita, UUID numeroTessera) {

		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.numeroTessera = numeroTessera;
	}

}
