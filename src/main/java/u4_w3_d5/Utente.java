package u4_w3_d5;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "Utente")
public class Utente {

	private String nome;
	private String cognome;
	private Date dataDiNascita;
	@Id
	@GeneratedValue
	private UUID numeroTessera;

	public Utente(String nome, String cognome, Date dataDiNascita, UUID numeroTessera) {

		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.numeroTessera = numeroTessera;
	}

}
