/*
 Properzi Mirea
 4 INB
 12/01/17
 Calcolare area e perimetro di un triangolo
 */
package areaperimetrotriangolo;

import java.util.Scanner;

public class AreaPerimetroTriangolo {

    public static void main(String[] args) {
        int lato1;
        int lato2;
        int lato3;
        int altezza;
        int perimetro;
        float area;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Inserisci il lato1 (base)...");
            lato1 = input.nextInt();

            System.out.println("Inserisci il lato2...");
            lato2 = input.nextInt();

            System.out.println("Inserisci il lato3...");
            lato3 = input.nextInt();

            System.out.println("Inserisci l'altezza...");
            altezza = input.nextInt();
            
            if((lato1 > lato2 + lato3) || (lato2 > lato1 + lato3) || (lato3 > lato1 + lato2)){
            System.out.println("Non è un triangolo. Inserire di nuovo i lati...");    
            }
        } while ((lato1 <= 0) || (lato2 <= 0) || (lato3 <= 0) || (altezza <= 0) || (lato1 > lato2 + lato3) || (lato2 > lato1 + lato3) || (lato3 > lato1 + lato2));

        perimetro = lato1 + lato2 + lato3;
        area = lato1 * altezza / 2;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);

    }

}
