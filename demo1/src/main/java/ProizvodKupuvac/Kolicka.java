package ProizvodKupuvac;

import java.util.List;

import javax.persistence.*;

@Entity
public class Kolicka {

	@Id
	@GeneratedValue
	private int kolickaId;
	
	private double vkupno;
	
	@OneToMany(mappedBy = "kolicka", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Stavka> stavka;
	
	@OneToOne
	@JoinColumn(name = "kupuvacId")
	private Kupuvac kupuvac;

	public int getKolickaId() {
		return kolickaId;
	}

	public void setKolickaId(int kolickaId) {
		this.kolickaId = kolickaId;
	}

	public double getVkupno() {
		return vkupno;
	}

	public void setVkupno(double vkupno) {
		this.vkupno = vkupno;
	}

	public List<Stavka> getStavka() {
		return stavka;
	}

	public void setStavka(List<Stavka> stavka) {
		this.stavka = stavka;
	}

	public Kupuvac getKupuvac() {
		return kupuvac;
	}

	public void setKupuvac(Kupuvac kupuvac) {
		this.kupuvac = kupuvac;
	}
	
	
	
	
	
}
