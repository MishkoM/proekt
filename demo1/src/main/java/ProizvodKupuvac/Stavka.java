package ProizvodKupuvac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Stavka {

	@Id
	@GeneratedValue
	private int stavkaId;
	
	private int kolicina;
	private double vkupnaSuma;
	
	@ManyToOne
	@JoinColumn(name = "kolickaId")
	private Kolicka kolicka;
	
	@ManyToOne
	@JoinColumn(name = "proizvodId")
	private Proizvod proizvod;

	public int getStavkaId() {
		return stavkaId;
	}

	public void setStavkaId(int stavkaId) {
		this.stavkaId = stavkaId;
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

	public Kolicka getKolicka() {
		return kolicka;
	}

	public void setKolicka(Kolicka kolicka) {
		this.kolicka = kolicka;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	
	
}
