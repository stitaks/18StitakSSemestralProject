
package pkg18stitakssemestralproject;

import java.util.Scanner;
/**
 * 
 * Číslo semestrální práce 18
 * @author Šárka Štiťák
 * Datum vypracování: 22.12.2022
 * Semestrální úloha po zadání parametrů a matice, srovná řádky matice podle
 * prvního prvku řádku do neklesající posloupnosti. 
 * test1:
 * 7
 * 3
 * 10,1 3 5 -150 3 5 -150,5 10 5 10 0 0 0 1 2 -5 10 0 15,87 0 0 
 * test2:
 * 10
 * 1
 * 10 15 -10 -15 -18 0 1,5 1,6 1,4 1 
 */
public class SemestralProject {
    public static void run(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Program opakovaně načítá matice a řadí je vzestupně podle prvního sloupce.");
            System.out.println("Pro ukončení programu zadejte místo počtu řádků 0 nebo záporné číslo.");
            System.out.println("Zadejte počet řádků matice:");
            int pocetRadku = sc.nextInt();
            if(pocetRadku<=0){
                break;
            }
            System.out.println("Zadejte počet sloupců matice:");
            int pocetSloupcu = sc.nextInt();
            System.out.println("Zadejte jednotlivé prvky matice (" + pocetSloupcu*pocetRadku + "čísel):");
            double [][] matice = new double [pocetRadku][pocetSloupcu];
            //in
            SemestralProjectTools.load(matice);
            //cal
            SemestralProjectTools.sort(matice);
            //out
            System.out.println("Uspořádaná matice: ");
            SemestralProjectTools.display(matice);
        }
    }
    
}
