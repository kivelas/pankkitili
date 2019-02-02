
// Saila Kivela
// Olio-ohjelmointi -kurssin harjoitustehtava 1.
// Pankkitili


import java.util.Scanner;

public class PankkitiliMain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

		System.out.println("Anna omistajan nimi: ");
		String omistaja = lukija.nextLine();
		
		System.out.println("Anna tilinumero: ");
		String tilinumero = lukija.nextLine();
		
		System.out.println("Anna tilin saldo: ");
		double saldo = Double.parseDouble(lukija.nextLine());
		
		Pankkitili tili = new Pankkitili (tilinumero, omistaja, saldo);
		
		System.out.println("");
		tili.tulostaTili(); //vaihtoehtoinen tapa tulostukselle toStringin avulla: System.out.println(tili);
		System.out.println("");
		
		System.out.println("Anna ottosumma: ");
		double ottoSumma = Double.parseDouble(lukija.nextLine());
		
		tili.otto(ottoSumma);
		
		System.out.println("");
		tili.tulostaTili();
	}
}
