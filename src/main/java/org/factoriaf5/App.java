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
        int inputNumber = sc.nextInt();

        String stringyfiedInputNumber = Integer.toString(inputNumber);
        
        if (inputNumber%3==0 && inputNumber%5==0){
            System.out.println("FizzBuzz");

        }
        else if (inputNumber%3==0 || stringyfiedInputNumber.contains("3")){
            System.out.println("Fizz");

        }
        else if (inputNumber%5==0|| stringyfiedInputNumber.contains("5")){
            System.out.println("Buzz");
            
        }
        else{
            System.out.println(inputNumber);
            
        }
        sc.close();
        }
}
