package ProizvodKupuvac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Korisnici {

	@Id
	@GeneratedValue
	private int korisnikId;
	
	private String username;
	private String password;
	private boolean enabled;
	private int kupuvacId;
	
	
	public int getKorisnikId() {
		return korisnikId;
	}
	public void setKorisnikId(int korisnikId) {
		this.korisnikId = korisnikId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public int getKupuvacId() {
		return kupuvacId;
	}
	public void setKupuvacId(int kupuvacId) {
		this.kupuvacId = kupuvacId;
	}

	
	
	
}
