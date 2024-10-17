package org.factoriaf5;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numIntroducido = sc.nextInt();
        
        if (numIntroducido%3==0 && numIntroducido%5==0){
            System.out.println("FizzBuzz");

        }
        else if (numIntroducido%3==0){
            System.out.println("Fizz");

        }
        else if (numIntroducido%5==0){
            System.out.println("Buzz");
            
        }
        else{
            System.out.println(numIntroducido);
            
        }
        sc.close();
        }
}
