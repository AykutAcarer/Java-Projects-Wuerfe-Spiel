package code.Wuerfel;

import java.util.Random;
import java.util.Scanner;

public class WuerfelProgramm {

	public static void main(String[] args) {
		
		/* Das Programm für Wuerfel */
		
		int eingabe=0;
		int gewinnZahlSpieler=0, gewinnZahlComputer=0, unentschiedenZahl=0, zahl=0;
		
		do {
			int zufallSpieler = new Random().nextInt(6)+1;
			int zufallComputer = new Random().nextInt(6)+1;
			System.out.println("Spieler: "+zufallSpieler);
			System.out.println("Computer: "+zufallComputer);
			zahl++;
			if (zufallSpieler>zufallComputer) {
				System.out.println("Spieler gewinnt");
				gewinnZahlSpieler++;
			}
			else if(zufallSpieler<zufallComputer) {
				System.out.println("Computer gewinnt");
				gewinnZahlComputer++;
			}
			else {
				System.out.println("unentschieden");
				unentschiedenZahl++;
			}
			System.out.println("Möchten Sie nochmal wuerfeln?.....1-Ja/2-Nein");
			eingabe = new Scanner(System.in).nextInt();
		}
		while(eingabe==1);
		
		System.out.println("Programm beendet");
		System.out.println(zahl+ " mal wurde gespielt ");
		System.out.println("Spieler gewinnt "+gewinnZahlSpieler+" mal.");
		System.out.println("Computer gewinnt "+gewinnZahlComputer+" mal.");
		System.out.println("Der Spiel ist "+unentschiedenZahl+" mal unentschieden");
	}		

}
