
public class Kid {
	
private String nume;
private String prenume;
private Address adresa;

public Kid() {
	
}

public Kid(String nume, String prenume, Address adresa) {
	this.nume = nume;
	this.prenume = prenume;
	this.adresa = new Address();
}

public String getNume() {
	return nume;
}

public void setNume(String nume) {
	this.nume = nume;
}

public String getPrenume() {
	return prenume;
}

public void setPrenume(String prenume) {
	this.prenume = prenume;
}

public Address getAdresa() {
	return adresa;
}

public void setAdresa(Address adresa) {
	this.adresa = adresa;
}

}
