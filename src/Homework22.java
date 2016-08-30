
public class Homework22 {

    static double commissionpercents = 0.05;

    static double withdrawBalance(double balance, double withdrawal) {

        return balance - withdrawal - withdrawal*commissionpercents;
    }

    public static void main(String[] args) {

        double balance = 100;
        double withdrawal = 50;

        double commission = withdrawal * commissionpercents;
        double balanceAfter = withdrawBalance (balance, withdrawal);

        if (balanceAfter >= 0){
            System.out.println("OK " + commission + " " + balanceAfter);
        }
        else {
            System.out.println("NO");
        }
    }
}
