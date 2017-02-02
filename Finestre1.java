/*
 * Properzi Mirea
 * 4INB
 * 02/02/17
 */
package finestre1;

import java.util.Scanner;

public class Finestre1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, x, pos1 = 0, pos2 = 0;
        Finestra f;
        do {
            System.out.println("Inserisci il numero di finestre...");
            n = input.nextInt();
        } while ((n < 0) || (n > 20));
        for (x = 0; x < n; x++) {
            f = new Finestra();
            f.setVisible(true);
            f.testo.setText("Sono la finestra " + (x + 1));
            pos1 = pos1 + 30;
            pos2 = pos2 + 30;
            f.setLocation(pos1, pos2);
            f.setTitle("Finestra " +(x+1));
        }
    }

}
