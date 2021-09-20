package ProizvodKupuvac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Kupuvac {

	@Id
	@GeneratedValue
	private int KupuvacId;
	
	private String Ime;
	private String Prezime;
	private int godini;
	private String mail;
	private String telefon;
	private String password;
	private boolean dozvola;
	
	@OneToOne
	@JoinColumn(name = "adresaziveenjeId")
	private AdresaZiveenje adresaziveenje;
	
	@OneToOne
	@JoinColumn(name = "adresaisporakaId")
	private AdresaIsporaka adresaisporaka;
	
	@OneToOne
	@JoinColumn(name = "kolickaId")
	private Kolicka kolicka;
	
	@OneToOne
	@JoinColumn(name = "potvrdinarackaId")
	private PotvrdiNaracka potvrdinaracka;

	public int getKupuvacId() {
		return KupuvacId;
	}

	public void setKupuvacId(int kupuvacId) {
		KupuvacId = kupuvacId;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public int getGodini() {
		return godini;
	}

	public void setGodini(int godini) {
		this.godini = godini;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isDozvola() {
		return dozvola;
	}

	public void setDozvola(boolean dozvola) {
		this.dozvola = dozvola;
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

	public Kolicka getKolicka() {
		return kolicka;
	}

	public void setKolicka(Kolicka kolicka) {
		this.kolicka = kolicka;
	}

	public PotvrdiNaracka getPotvrdinaracka() {
		return potvrdinaracka;
	}

	public void setPotvrdinaracka(PotvrdiNaracka potvrdinaracka) {
		this.potvrdinaracka = potvrdinaracka;
	}
	
	
	
	
	
}
