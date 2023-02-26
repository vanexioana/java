
public class Catalogue {
private String numar;
private Kid copil;
private Address adresa;

public Catalogue(){
	
}
public Catalogue(String numar, Kid copil, Address adresa) {
	this.numar = numar;
	this.copil = new Kid();
	this.adresa = new Address();
}
public String getNumar() {
	return numar;
}
public void setNumar(String numar) {
	this.numar = numar;
}
public Kid getCopil() {
	return copil;
}
public void setCopil(Kid copil) {
	this.copil = copil;
}
public Address getAdresa() {
	return adresa;
}
public void setAdresa(Address adresa) {
	this.adresa = adresa;
}

}
