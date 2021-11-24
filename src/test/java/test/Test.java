package test;
import metier.Console;
import metier.Jeu;
import metier.Portable;
import metier.Salon;

import java.util.List;

import metier.Achat;
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
		Adresse adr1=new Adresse(5,"rue de Gordon","Lille");
		Boutique b1=new Boutique("",adr1);
		
		
		Jeu jeu1=new Jeu("MarioKart", c1,b1);
		Jeu jeu2=new Jeu("Naruto", c2,b1);
		Jeu jeu3=new Jeu("PES4", c3,b1);
		Jeu jeu4=new Jeu("Fifa", c4,b1);
		Jeu jeu5=new Jeu("Assassin Creeds", c5,b1);
		
		Achat ac1 = new Achat(jeu1,2021-11-3,25.3);
		Achat ac2 = new Achat(jeu2,2021-11-6,50);
		List<Achat> achats = {ac1,ac2};
		
		Client c1 = new Client("Dupont","Martin",achats);
		Client c2 = new Client("Dupond","Alice",achats);

	}

}
