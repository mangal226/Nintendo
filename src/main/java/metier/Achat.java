package metier;
import java.time.LocalDate;
import metier.*;

public class Achat {
	private Jeu jeu;
	private LocalDate date;
	private double prix;
	public Achat(Jeu jeu, LocalDate date, double prix) {
		super();
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}
	public Jeu getJeu() {
		return jeu;
	}
	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

}
