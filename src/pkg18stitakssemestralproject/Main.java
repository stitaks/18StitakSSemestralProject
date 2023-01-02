
package pkg18stitakssemestralproject;

import java.util.Scanner;

/** 
 * @author Šárka Štiťák
 * V menu je možné si vybrat zda chceme spustit Vánoční úlohu nebo Semestrální práci. 
 * Vánoční úloha vypíše po zádání parametrů krb.
 */
public class Main {

    /**
     * @param args the command line arguments
     * Menu pro výběr úlohy. 
     * test1 SemestralProjekt:
     * 7
     * 3
     * 10,1 3 5 -150 3 5 -150,5 10 5 10 0 0 0 1 2 -5 10 0 15,87 0 0 
     * test2 SemestralProjekt:
     * 10
     * 1
     * 10 15 -10 -15 -18 0 1,5 1,6 1,4 1 
     */
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        spouštěníProgram : while (true){
            System.out.println("Pokud chcete spustit Vánoční úlohu napište 1.");
            System.out.println("Pokud chcete spustit Semestrální úlohu napište 2.");
            System.out.println("Při napsání čehokoliv jiného než 1 a 2 se program ukončí.");
            int menu = sc.nextInt();
            switch (menu){
                case 1 : ChristmasStitakSarka1.run(); break;
                case 2 : SemestralProject.run();break;
                default : break spouštěníProgram;
            }
        }
    }
    
}
