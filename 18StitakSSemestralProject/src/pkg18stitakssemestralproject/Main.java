
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
     */
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        spouštěníProgram : while (true){
            System.out.println("Pokud chcete spustit Vánoční úlohu napište 1.");
            System.out.println("Pokud chcete spustit Semestrální úlohu napište 2.");
            System.out.println("Při napsání čehokoliv jiného než 1 a 2 se program ukončí.");
            int menu = sc.nextInt();
            switch (menu){
                case 1 : ChristmasStitakSarka1.main(args); break;
                case 2 : SemestralProject.main(args);break;
                default : break spouštěníProgram;
            }
        }
    }
    
}
