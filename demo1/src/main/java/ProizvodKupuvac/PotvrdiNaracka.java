package ProizvodKupuvac;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PotvrdiNaracka {

	@Id
	@GeneratedValue
	private int potvrdinarackaId;
	
	private double vkupno;
	
	@OneToOne
	@JoinColumn(name = "kupuvacId")
	private Kupuvac kupuvac;
	
	@OneToOne
	@JoinColumn(name = "adresaziveenjeId")
	private AdresaZiveenje adresaziveenje;
	
	@OneToOne
	@JoinColumn(name = "adresaisporakaId")
	private AdresaIsporaka adresaisporaka;
	
	@OneToMany(mappedBy = "potvrdiNaracka", cascade = CascadeType.ALL)
	private List<PotvrdiStavkaNaracka> stavkaNaracka;

	public int getPotvrdinarackaId() {
		return potvrdinarackaId;
	}

	public void setPotvrdinarackaId(int potvrdinarackaId) {
		this.potvrdinarackaId = potvrdinarackaId;
	}

	public double getVkupno() {
		return vkupno;
	}

	public void setVkupno(double vkupno) {
		this.vkupno = vkupno;
	}

	public Kupuvac getKupuvac() {
		return kupuvac;
	}

	public void setKupuvac(Kupuvac kupuvac) {
		this.kupuvac = kupuvac;
	}

	public AdresaZiveenje getAdresaziveenje() {
		return adresaziveenje;
	}

	public void setAdresaziveenje(AdresaZiveenje adresaziveenje) {
		this.adresaziveenje = adresaziveenje;
	}

	public AdresaIsporaka getAdresaisporaka() {
		return adresaisporaka;
	}

	public void setAdresaisporaka(AdresaIsporaka adresaisporaka) {
		this.adresaisporaka = adresaisporaka;
	}

	public List<PotvrdiStavkaNaracka> getStavkaNaracka() {
		return stavkaNaracka;
	}

	public void setStavkaNaracka(List<PotvrdiStavkaNaracka> stavkaNaracka) {
		this.stavkaNaracka = stavkaNaracka;
	}
	
	
	
	
	
}
