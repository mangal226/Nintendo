package test;
import metier.Console;
import metier.Jeu;
import metier.Portable;
import metier.Salon;
import metier.Adresse;
import metier.Boutique;
import metier.Client;

public class Test {

	public static void main(String[] args) {
		Console c1=new Salon ("PS4");
		Console c2=new Salon ("PS3");
		Console c3=new Salon ("PS2");
		Console c4=new Portable ("NDS");
		Console c5=new Salon ("N64");
		Adresse adr1=new Adresse(5,"rue de Gaulle","Lille");
		Adresse adr2=new Adresse(5,"rue de Gordon","Paris");
		Adresse adr3=new Adresse(5,"rue de Sèvre","Marseille");
		Adresse adr4=new Adresse(5,"rue de Guillotine","Toulouse");
		Adresse adr5=new Adresse(5,"rue de Gordon","Nantes");
		Boutique b1=new Boutique("MarioStore",adr1);
		Boutique b2=new Boutique("FifaStore",adr2);
		Boutique b3=new Boutique("3D_Store",adr3);
		Boutique b4=new Boutique("PES_World",adr4);
		Boutique b5=new Boutique("EasyWorld",adr5);
		
		Jeu jeu1=new Jeu("MarioKart",c1, b1);
		Jeu jeu2=new Jeu("Naruto", c2, b2);
		Jeu jeu3=new Jeu("PES4", c3, b3);
		Jeu jeu4=new Jeu("Fifa", c4, b4);
		Jeu jeu5=new Jeu("Assassin Creeds", c5, b5);
		Client c1 = new Client("Dupont","Martin");
		Client c2 = new Client("Dupond","Alice");

	}

}
