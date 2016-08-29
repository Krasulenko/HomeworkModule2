
public class Homework23 {

    static  double[] balances = {1200, 250, 2000, 500, 3200};
    static  String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static String ownerName = "Jack";
    static double withdrawal = 1750;
    static double commissionpercents = 0.05;
    static double commission = withdrawal * commissionpercents;

    static double withdrawBalance(String ownerName, double withdrawal){
        double balance = 0;
        for (int i = 0; i < ownerNames.length; i++){
            if (ownerNames[i] == ownerName) {
                balance = balances[i];
                break;
            }
        }
        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {

        double balanceAfter = withdrawBalance(ownerName,withdrawal);
        if (balanceAfter >= 0){
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfter);
        }
        else {
            System.out.println(ownerName + " NO");
        }
    }

}
