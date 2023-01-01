
package pkg18stitakssemestralproject;

import java.util.Scanner;

public final class SemestralProjectTools {
    private SemestralProjectTools(){
        
    }
    /**
     * Načítá matici zadanou uživatelem.
     * @param matice
     * @return vrací matici načtenou od uživatele
     */
    public static double [][] load (double [][] matice){
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i <matice.length; i++){
            for (int j = 0; j <matice[0].length; j++){
                matice[i][j] = sc.nextDouble();
            }
        }
        return matice;
    }
    /**
     * Rovná matici podle prvního prvku každého řádku od nejmenší po největší.
     * @param matice
     * @return - vrací srovnanou matici
     */
    public static double [][] sort (double [][] matice){
        for (int i=0; i<(matice.length)-1; i++){
            for (int j=0; j<(matice.length)-i-1; j++){
                    if (matice[j][0]>matice[j+1][0]){
                    double [] arrMatice = matice[j];
                    matice[j]=matice[j+1];
                    matice[j+1]=arrMatice;
                }
            }
        }
        return matice;
    }
    /**
     * Vypisuje matici. 
     * @param matice 
     */
    public static void display (double [][] matice){
        for (int i=0; i<matice.length; i++)
            for (int j=0; j<matice[i].length; j++){
                System.out.print(matice[i][j] + " ");
                if (j==(matice[i].length)-1){
                    System.out.println();
                }
            }
    }
}
