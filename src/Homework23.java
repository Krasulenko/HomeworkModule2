
public class Homework23 {

    static  double[] balances = {1200, 250, 2000, 500, 3200};
    static  String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double withdrawBalance(String ownerName, double withdrawal){
        double balance = 0;
        double commissionpercents = 0.05;
        for (int i = 0; i < ownerNames.length; i++){
            if (ownerNames[i] == ownerName) {
                balance = balances[i];
                break;
            }
        }
        double balanceAfter = balance - withdrawal - withdrawal * commissionpercents;
        if (balanceAfter >= 0){
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfter);
        }
        else {
            System.out.println(ownerName + " NO");
        }
        return balanceAfter;
    }

    public static void main(String[] args) {

        String ownerName = "Jack";
        double withdrawal = 1750;

        withdrawBalance(ownerName,withdrawal);
    }

}
