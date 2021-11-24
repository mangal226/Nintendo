package test;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c1=new Console("PS4");
		Console c2=new Console("PS3");
		Console c3=new Console("PS2");
		Console c4=new Console("N64");
		Console c5=new Console("NDS");
		Jeu jeu1=new Jeu("MarioKart",c1);
		Jeu jeu2=new Jeu("MarioKart",c2);
		Jeu jeu3=new Jeu("MarioKart",c3);
		Jeu jeu4=new Jeu("MarioKart",c4);
		Jeu jeu5=new Jeu("MarioKart",c5);

	}

}
