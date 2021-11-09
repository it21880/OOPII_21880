import java.util.ArrayList;
import java.lang.*;
import java.util.Scanner;

public abstract class Main implements PerceptronTraveller{

    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("what's your age?" + "\n" + "Age:");
        int age = input.nextInt();
        System.out.println();
        if (age < 16){
            System.out.println("Sorry but you need to be at least 16 to travel alone...");
            return;
        }else if (age > 115){
            System.out.println("How are you this old? Nice!");
        }else{System.out.println("Eligible to travel!");}
    }
    @Override
    public ArrayList recommend(boolean upper) {
        return null;
    }
}
