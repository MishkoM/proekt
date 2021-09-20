package ProizvodKupuvac;

import javax.persistence.*;

@Entity
public class NarackaKupuvac {
	
	@Id
	@GeneratedValue
	private int narackakupuvacID;
	
	@OneToOne
	@JoinColumn(name = "kolickaId")
	private Kolicka kolicka;
	
	@OneToOne
	@JoinColumn(name = "kupuvacId")
	private Kupuvac kupuvac;
	
	@OneToOne
	@JoinColumn(name = "adresaziveenjeId")
	private AdresaZiveenje adresaziveenje;
	
	@OneToOne
	@JoinColumn(name = "adresaisporakaId")
	private AdresaIsporaka adresaisporaka;

	public int getNarackakupuvacID() {
		return narackakupuvacID;
	}

	public void setNarackakupuvacID(int narackakupuvacID) {
		this.narackakupuvacID = narackakupuvacID;
	}

	public Kolicka getKolicka() {
		return kolicka;
	}

	public void setKolicka(Kolicka kolicka) {
		this.kolicka = kolicka;
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
	
	

}
