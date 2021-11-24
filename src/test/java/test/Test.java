package test;
import metier.Console;
import metier.Jeu;
import metier.Portable;
import metier.Salon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Client;

public class Test {

	public static void main(String[] args) {
		Console c1=new Salon ("PS4", 20, null);
		Console c2=new Salon ("PS3", 20, null);
		Console c3=new Salon ("PS2", 20, null);
		Console c4=new Portable ("NDS", 20, null);
		Console c5=new Salon ("N64", 20, null);
		Adresse adr1=new Adresse(5,"rue de Gaulle","Lille");
		Adresse adr2=new Adresse(5,"rue de Gordon","Paris");
		Adresse adr3=new Adresse(5,"rue de S�vre","Marseille");
		Adresse adr4=new Adresse(5,"rue de Guillotine","Toulouse");
		Adresse adr5=new Adresse(5,"rue de Gordon","Nantes");
		Boutique b1=new Boutique("MarioStore",adr1);
		Boutique b2=new Boutique("FifaStore",adr2);
		Boutique b3=new Boutique("3D_Store",adr3);
		Boutique b4=new Boutique("PES_World",adr4);
		Boutique b5=new Boutique("EasyWorld",adr5);
		
		
		Jeu jeu1=new Jeu("MarioKart", c1,b1);
		Jeu jeu2=new Jeu("Naruto", c2,b1);
		Jeu jeu3=new Jeu("PES4", c3,b1);
		Jeu jeu4=new Jeu("Fifa", c4,b1);
		Jeu jeu5=new Jeu("Assassin Creeds", c5,b1);
		
		Achat ac1 = new Achat(jeu1,null,25.3);
		Achat ac2 = new Achat(jeu2,LocalDate.parse("2021-10-09"),50);
		List<Achat> achats = new ArrayList();
				achats.add(ac2);
				achats.add(ac1);
		
		Client cl1 = new Client("Dupont","Martin",achats);
		Client cl2 = new Client("Dupond","Alice",achats);

	}

}
