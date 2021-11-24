package metier;

public class Boutique {
	private String nom;
	private String adresse;
	
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	
	public String getAdresse() {return adresse;}
	public void setAdresse(String adresse) {this.adresse = adresse;}
	
	public Boutique(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	
	
	

}
