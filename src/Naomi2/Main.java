package Naomi2;

import com.sun.corba.se.spi.orb.Operation;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  ArithmeticException  {
	// write your code here
      int a,b;
         int option;

        System.out.println("Input two integers");
        Scanner input= new Scanner(System.in);
        a= input.nextInt();
        b= input.nextInt();
        Operations ref1= new Operations( a,b);
  System.out.println(" type 1 for  addition, 2 for subtraction,  3 for division, and 4 for mutiplication, press 5 to" +
          "turn off calcultor");
        option=input.nextInt();


         //switch statment here
         switch ( option){

             case 1:
                 ref1.Addition(a,b);
                 System.out.println(Operations.result);
                 break;
             case 2 :
                 ref1.subtraction(a,b);
                 System.out.println(Operations.result);
                 break;
             case 3:

                 try{

                     ref1.Division(a,b);
                     System.out.println(Operations.result);

                 }
                 catch (ArithmeticException e){
                     System.out.println(" exception caught, produces undefined results");
                 }
                 break;
             case 4:
                 ref1.mutiplication(a,b);
                 System.out.println(Operations.result);
                 break;
             default:
                 System.out.println(" shutting down");
                 break;

         }










    }
}
