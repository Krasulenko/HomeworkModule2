
public class Homework24 {

    static  double[] balances = {1200, 250, 2000, 500, 3200};
    static  String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownerName, double fund){
        double balance = 0;
        for (int i = 0; i < ownerNames.length; i++){
            if (ownerNames[i] == ownerName) {
                balance = balances[i];
                break;
            }
        }
        double balanceAfter = balance + fund;
        System.out.println(ownerName + " " + balanceAfter);
        return balanceAfter;
    }

    public static void main(String[] args) {

        String ownerName = "Lane";
        double fund = 800;

        fundBalance(ownerName, fund);
    }

}
