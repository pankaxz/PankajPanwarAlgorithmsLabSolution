package ProblemTwo.GreatLearning.Services;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;


public class Denomination {
    Scanner sc = new Scanner(System.in);

    public void SetCurrencyDenominations(int[] denominationsArray, int denominationSize) {
        int i = 0;
        while(i < denominationSize) {
            denominationsArray[i] = sc.nextInt();
            if(denominationsArray[i] <= 1){
                System.out.println("Please enter a denomination amount greater than 1");
                denominationsArray[i] = 0;
            }
            else
            i++;
        }
    }

    public void MinimumDenomination(int[] denominationsArray, int denominationSize, int amount) {
        int count = 0;

        if (amount == 0){
            System.out.println("Amount entered should be greater than 0");
            System.exit(0);
        }

        HashMap<Integer, Integer> denominationDB = new HashMap<>();
        try {
            for(int element : denominationsArray){
                if(amount >= element){
                    count = amount / element;
                    denominationDB.put( element, count );
                    amount = amount % element;
                }
                if(amount == 0)
                break;
            }
        }
        catch (Exception e){
            System.out.println("Error : " + e.getMessage());
            System.exit( 0 );
        }

        if(amount == 0){
            denominationDB.forEach( (key, value) -> {
                if(value > 1) System.out.println( value + " notes " + "of " + key );
                else System.out.println( value + " note " + "of " + key );
            } );
        }
        else
        System.out.println("Amount is not accepted for the given denominations.");
    }
}
