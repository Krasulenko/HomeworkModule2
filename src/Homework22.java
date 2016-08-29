
public class Homework22 {

    static double balance = 100;
    static double withdrawal = 50;
    static double commissionpercents = 0.05;
    static double commission = withdrawal * commissionpercents;

    static double withdrawBalance(double balance, double withdrawal) {

        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {

        double balanceAfter = withdrawBalance (balance, withdrawal);

        if (balanceAfter >= 0){
            System.out.println("OK " + commission + " " + balanceAfter);
        }
        else {
            System.out.println("NO");
        }
    }
}
