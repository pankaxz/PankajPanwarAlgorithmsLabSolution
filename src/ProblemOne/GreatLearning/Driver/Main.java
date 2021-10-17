package ProblemOne.GreatLearning.Driver;
import ProblemOne.GreatLearning.Services.TargetCalculation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the transaction size : ");
        int transactionSize = sc.nextInt();
        int [] transactionArray = new int[transactionSize];
        System.out.println("Enter the transaction values : ");
        for(int i = 0 ;i < transactionSize; i++){
            transactionArray[i] = sc.nextInt();
        }

        System.out.println("Enter the total no of targets that needs to be achieved ");
        int targetNums = sc.nextInt();
        int [] targetArray = new int [targetNums];
        for(int i = 0 ;i < targetNums;){
            System.out.println("Enter the value of target ");
            targetArray[i] = sc.nextInt();

            if(targetArray[i] == 0) {
                System.out.println("Please enter a value greater than 0");
            }

            else {
                int expectedResult = TargetCalculation.isTargetPossible(transactionArray, targetArray[i]);
                if( expectedResult > 0 )
                    System.out.println("Target achieved after " + expectedResult + " transactions");
                else System.out.println("Target can not be achieved");
                i++;
            }

            System.out.println();
        }

    }
}
