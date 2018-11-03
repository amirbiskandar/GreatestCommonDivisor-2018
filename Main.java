
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
        
   
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a : ");
        int a = reader.nextInt();
        System.out.print("Input b : ");
        int b = reader.nextInt();
        int c;

        
        
        
        
        do{
            if(a<b){
            c=a;
            a=b;
            b=c;
            }
            c=a%b;
            System.out.print("GCD(" + a+ ", " +b + ") ");
            a=b;
            b=c;
            if(b!=0)
            System.out.println("= GCD(" + a+ ", " +b + ")");
        }while(c!=0);
        System.out.println("= "+a);
        /*
        int age, x=1, y;
        String name;
        y=(x++);
        Scanner s = new Scanner(System.in);
        System.out.println(x +" "+ y);
        System.out.print("Enter your age : ");
        age = s.nextInt();
        s.nextLine(); //getchar() from C
        System.out.print("Enter your name : ");
        name = s.nextLine();

        
        System.out.println(name + " is "+age+" years old.");
        
        
        
        int w, max, min,range,c;
        char m=2989;
        max = 3000;
        min = 2000;
        range = max-min;
        Random g = new Random();
        w = g.nextInt(range+1)+ min;
        m = (char) w;
        System.out.println("Random is : "+w);
        System.out.println(m);
        
        double x;
        x=123.456;
        System.out.printf("%-9.1f\n",x);
        
        */
    }
}
