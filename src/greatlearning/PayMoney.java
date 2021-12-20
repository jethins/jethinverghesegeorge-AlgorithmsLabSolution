package greatlearning;

public class PayMoney {
int sum = 0, flag=0;
        public void VerifyTarget(int [] transactions,int countTransactions,int target){
            for (int i = 0; i<countTransactions; i++){
                sum = sum + transactions[i];
                System.out.println("Amount accumulated after transaction "+(i+1) + " is : " + sum);
                if (sum >= target){
                    System.out.println("Target achieved after transaction "+(i+1));
                    flag = 1;
                    break;
                }
            }
            if (flag ==0)
                System.out.println("Given target is not achieved.");
        }

}
