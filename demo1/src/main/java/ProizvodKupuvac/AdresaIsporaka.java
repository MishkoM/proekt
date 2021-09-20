package ProizvodKupuvac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AdresaIsporaka {

	@Id
	@GeneratedValue
	private int adresaisporakaID;
	
	private String ulica;
	private int broj;
	private String grad ;
	private String drzava;
	private String postenskibroj;

	@OneToOne
	private Kupuvac kupuvac;
	
	@OneToOne
	private PotvrdiNaracka potvrdinaracka;

	public int getAdresaisporakaID() {
		return adresaisporakaID;
	}

	public void setAdresaisporakaID(int adresaisporakaID) {
		this.adresaisporakaID = adresaisporakaID;
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
		return "AdresaIsporaka [ulica=" + ulica + ", broj=" + broj + ", grad=" + grad + ", drzava=" + drzava
				+ ", postenskibroj=" + postenskibroj + "]";
	}
	
	
}
