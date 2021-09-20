package ProizvodKupuvac;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proizvod {

	@Id
	@GeneratedValue
	private int proizvodId;
	
	private String Ime;
	private Double Cena;
	private String produktStatus;
	private int zaliha;
	
	
	@OneToMany(mappedBy = "proizvod", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Stavka> listaStavki;

	
	@OneToMany(mappedBy = "proizvod", cascade = CascadeType.ALL)
	private List<PotvrdiStavkaNaracka> listaStavkaNaracka;


	public int getProizvodId() {
		return proizvodId;
	}


	public void setProizvodId(int proizvodId) {
		this.proizvodId = proizvodId;
	}


	public String getIme() {
		return Ime;
	}


	public void setIme(String ime) {
		Ime = ime;
	}


	public Double getCena() {
		return Cena;
	}


	public void setCena(Double cena) {
		Cena = cena;
	}


	public String getProduktStatus() {
		return produktStatus;
	}


	public void setProduktStatus(String produktStatus) {
		this.produktStatus = produktStatus;
	}


	public int getZaliha() {
		return zaliha;
	}


	public void setZaliha(int zaliha) {
		this.zaliha = zaliha;
	}


	public List<Stavka> getListaStavki() {
		return listaStavki;
	}


	public void setListaStavki(List<Stavka> listaStavki) {
		this.listaStavki = listaStavki;
	}


	public List<PotvrdiStavkaNaracka> getListaStavkaNaracka() {
		return listaStavkaNaracka;
	}


	public void setListaStavkaNaracka(List<PotvrdiStavkaNaracka> listaStavkaNaracka) {
		this.listaStavkaNaracka = listaStavkaNaracka;
	}
	
	
	

	
}
