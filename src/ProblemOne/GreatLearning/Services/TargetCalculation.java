package ProblemOne.GreatLearning.Services;

public class TargetCalculation {

    public static int isTargetPossible(int [] transactionArray, int target){
        int currentSum = 0;
        for(int i = 0; i < transactionArray.length; i++)
        {
            currentSum += transactionArray[i];
            if(currentSum >= target)
                return i+1;
        }
        return 0;
    }
}
