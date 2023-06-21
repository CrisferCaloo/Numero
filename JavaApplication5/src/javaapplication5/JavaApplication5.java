
package javaapplication5;
import java.util.*;


/**
 * @author Cris
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecla=new Scanner(System.in);
        
        int intento=0;
        int num=0;
        int aleatorio=(int)(Math.random()*100);
        
        while(aleatorio!=num){
            System.out.println("\nIngrese un numero ");
            num=tecla.nextInt();
            if(aleatorio>num){
                System.out.println(" mas alto");
            }
            else if(aleatorio<num){
                System.out.println(" mas bajo");
            }
            intento+=1;
        }
        
        System.out.println("\n Adivinaste");
        System.out.println("Intentos: "+intento);
    }

}
