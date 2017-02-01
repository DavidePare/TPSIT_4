
package finestra1;
import java.util.Scanner;

public class Finestra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=0,cont=0;
        int x=10;
        int y=10;
        finestra f;
        Scanner input = new Scanner(System.in);
        while(n < 1){
            System.out.println("Inserire numero finestre:");
            n = input.nextInt();
        }
        
        while(cont<n){
            f=new finestra();
            f.setVisible(true);
            cont++;
            f.setLocation(x,y);
            x=x+30;
            y=y+30;
    }
    
}
}
