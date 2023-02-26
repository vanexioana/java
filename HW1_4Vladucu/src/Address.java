
public class Address {
    
	private String strada;
	private String oras;
	private String judet;
	private String tara;
	
	public Address() {
		
	}
	public Address(String strada, String oras, String judet, String tara) {
		this.judet = judet;
		this.oras = oras;
		this.strada = strada;
		this.tara = tara;
	}
	
	public String getStrada() {
		return strada;
	}
	public void setStrada(String strada) {
		this.strada = strada;
	}
	public String getOras() {
		return oras;
	}
	public void setOras(String oras) {
		this.oras = oras;
	}
	public String getJudet() {
		return judet;
	}
	public void setJudet(String judet) {
		this.judet = judet;
	}
	public String getTara() {
		return tara;
	}
	public void setTara(String tara) {
		this.tara = tara;
	}
	
	
}
