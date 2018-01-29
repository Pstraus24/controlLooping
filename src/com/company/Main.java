// You will create a text menu allowing the user to interact with a business of your choice
// Have a minimum of five different options in the menu, and if the option is selected print the choice on the screen.
// Use a do-while loop to validate user input, and re-display the screen if the input is not valid.

package com.company;
import java.util.Scanner;// import package for user input
public class Main {

    public static void main(String[] args) {
// ----------------declare variable number for user input
        int number;
// ------------------initialize color string variable
// ------------------initialize Scanner variable input for user input
        String colour = "";
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1. Red");
            System.out.println("2. Blue ");
            System.out.println("3. Green");
            System.out.println("4. Yellow");
            System.out.println("5. Black");
            System.out.println("6. White");
            System.out.println("Enter 1-6 for your favorite color");
            number = input.nextInt();
        }while(number !=1 && number != 2 && number != 3 && number !=4 && number != 5 && number != 6);
        switch (number){
            case 1:
                colour = "RED";
                break;
            case 2:
                colour = "BLUE";
                break;
            case 3:
                colour = "GREEN";
                break;
            case 4:
                colour = "YELLOW";
                break;
            case 5:
                colour = "BLACK";
                break;
            case 6:
                colour = "WHITE";

        }


        System.out.println("The color you have chosen is: " + colour);



    }
}
