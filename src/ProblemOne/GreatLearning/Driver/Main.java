package ProblemOne.GreatLearning.Driver;
import ProblemOne.GreatLearning.Services.TargetCalculation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TargetCalculation targetCalculation = new TargetCalculation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the transaction size : ");
        int transactionSize = sc.nextInt();
        int [] transactionArray = new int[transactionSize];
        System.out.println("Enter the transaction values : ");
        for(int i = 0 ;i < transactionSize; i++){
            transactionArray[i] = sc.nextInt();
        }

        System.out.println("Enter the targets  : ");
        int targetNums = sc.nextInt();
        int [] targetArray = new int [targetNums];
        for(int i = 0 ;i < targetNums; i++){
            targetArray[i] = sc.nextInt();
        }

        for (int target : targetArray) {
            int expectedResult = targetCalculation.isTargetPossible(transactionArray, target);
            if( expectedResult > 0 )
                System.out.println(target + " days can be achieved in " + expectedResult + " days");
            else System.out.println("Target can not be achieved");
        }
    }
}
