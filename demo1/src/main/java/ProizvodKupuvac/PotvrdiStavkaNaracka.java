package ProizvodKupuvac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PotvrdiStavkaNaracka {

	@Id
	@GeneratedValue
	private int potvrdistavkanarackaId;
	
	private int kolicina;
	private double vkupnaSuma;
	
	@ManyToOne
	@JoinColumn(name = "potvrdinarackaId")
	private PotvrdiNaracka potvrdinaracka;
	
	@ManyToOne
	@JoinColumn(name = "proizvodId")
	private Proizvod proizvod;

	public int getPotvrdistavkanarackaId() {
		return potvrdistavkanarackaId;
	}

	public void setPotvrdistavkanarackaId(int potvrdistavkanarackaId) {
		this.potvrdistavkanarackaId = potvrdistavkanarackaId;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public double getVkupnaSuma() {
		return vkupnaSuma;
	}

	public void setVkupnaSuma(double vkupnaSuma) {
		this.vkupnaSuma = vkupnaSuma;
	}

	public PotvrdiNaracka getPotvrdinaracka() {
		return potvrdinaracka;
	}

	public void setPotvrdinaracka(PotvrdiNaracka potvrdinaracka) {
		this.potvrdinaracka = potvrdinaracka;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	
	
}
