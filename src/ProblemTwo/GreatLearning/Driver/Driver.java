package ProblemTwo.GreatLearning.Driver;

import ProblemTwo.GreatLearning.Services.MergeSortImplementation;
import ProblemTwo.GreatLearning.Services.Denomination;

import java.util.Map;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Denomination denomination = new Denomination();
        MergeSortImplementation mergeSort = new MergeSortImplementation();

        System.out.println("Enter the size of currency denominations ");
        int denominationSize = sc.nextInt();
        int [] denominationsArray = new int[denominationSize];


        System.out.println("Enter the currency denominations value : ");
        denomination.SetCurrencyDenominations(denominationsArray, denominationSize);

        mergeSort.MergeSort(denominationsArray, 0, denominationSize-1);

        System.out.println("Enter the amount  : ");
        int amount = sc.nextInt();

        denomination.MinimumDenomination( denominationsArray, denominationSize, amount );
    }
}
