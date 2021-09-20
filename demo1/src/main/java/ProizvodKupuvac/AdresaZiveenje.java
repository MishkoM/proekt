package ProizvodKupuvac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AdresaZiveenje {

	@Id
	@GeneratedValue
	private int adresaziveenjeID;
	
	private String ulica;
	private int broj;
	private String grad ;
	private String drzava;
	private String postenskibroj;

	@OneToOne
	private Kupuvac kupuvac;
	
	@OneToOne
	private PotvrdiNaracka potvrdinaracka;

	public int getAdresaziveenjeID() {
		return adresaziveenjeID;
	}

	public void setAdresaziveenjeID(int adresaziveenjeID) {
		this.adresaziveenjeID = adresaziveenjeID;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String getPostenskibroj() {
		return postenskibroj;
	}

	public void setPostenskibroj(String postenskibroj) {
		this.postenskibroj = postenskibroj;
	}

	public Kupuvac getKupuvac() {
		return kupuvac;
	}

	public void setKupuvac(Kupuvac kupuvac) {
		this.kupuvac = kupuvac;
	}

	public PotvrdiNaracka getPotvrdinaracka() {
		return potvrdinaracka;
	}

	public void setPotvrdinaracka(PotvrdiNaracka potvrdinaracka) {
		this.potvrdinaracka = potvrdinaracka;
	}

	@Override
	public String toString() {
		return "AdresaZiveenje [ulica=" + ulica + ", broj=" + broj + ", grad=" + grad + ", drzava=" + drzava
				+ ", postenskibroj=" + postenskibroj + "]";
	}
	
	
	
	
}
