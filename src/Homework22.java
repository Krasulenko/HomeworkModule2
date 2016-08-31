
public class Homework22 {

    static double withdrawBalance(double balance, double withdrawal) {
        double commissionpercents = 0.05;
        double commission = withdrawal * commissionpercents;
        double balanceAfter = balance - withdrawal - commission;

        if (balanceAfter >= 0){
            System.out.println("OK " + commission + " " + balanceAfter);
        }
        else {
            System.out.println("NO");
        }
        return balanceAfter;
    }

    public static void main(String[] args) {

        double balance = 100;
        double withdrawal = 50;

        withdrawBalance(balance, withdrawal);

    }
}
