package greatlearning;

import java.util.Scanner;

public class TransactionsDriver {

    public static void main(String args[]){
        int countTransactions, countOfTargetTransactions, targetAmount=0;
        Boolean exitStrategy = false;

        // Reading the transactions count
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of transactions array : ");
        countTransactions = sc.nextInt();

        // Initializing and storing values into the array
        int transactions [] = new int[countTransactions];
        System.out.println("Enter the values of the array : ");
        for (int i=0; i<countTransactions; i++){
            transactions[i] =  sc.nextInt();
        }

        // Accepting target transaction count and exiting the application for invalid input value
        System.out.print("Enter the number of transactions in which target need to be achieved : ");
        countOfTargetTransactions = sc.nextInt();
        if( (countOfTargetTransactions<=0) ||(countOfTargetTransactions>countTransactions) ) {
            System.out.println("Kindly enter transaction count greater than zero and lesser or equal to number of transactions.");
            exitStrategy = true;
        }

        // Accepting target amount and exiting the application for invalid target amount value
        while (!exitStrategy) {
            System.out.print("Enter the target amount which need to be achieved : ");
            targetAmount = sc.nextInt();
            if (targetAmount <= 0) {
                System.out.println("Kindly enter a target amount greater than zero.");
                exitStrategy = true;
                break;
            }
            break;
        }

       // Processing the application logic if input values from the application user is valid.
       while (!exitStrategy) {
           PayMoney pay = new PayMoney();
           pay.VerifyTarget(transactions, countOfTargetTransactions, targetAmount);
           exitStrategy = true;
       }
    }
}
