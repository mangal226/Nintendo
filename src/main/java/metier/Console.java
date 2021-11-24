package metier;

import java.time.LocalDate;

public abstract class Console {

	private String nom;
	private int prix;
	private LocalDate dateSortie;

	

	public Console(String nom, int prix, LocalDate dateSortie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getPrix() {
		return prix;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	public LocalDate getDateSortie() {
		return dateSortie;
	}



	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}



	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}



	
	
}
