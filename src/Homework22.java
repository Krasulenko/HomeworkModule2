
public class Homework22 {

    static double withdrawBalance(double balance, double withdrawal, double commission) {

        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 50;
        double commission = withdrawal * 0.05;

        double balanceAfter = withdrawBalance (balance, withdrawal,commission);

        if (balanceAfter >= 0){
            System.out.println("OK " + commission + " " + balanceAfter);
        }
        else {
            System.out.println("NO");
        }
    }
}
