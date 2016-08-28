public class Homework21 {

    static int sum(int array []) {
        int sum1 = 0;
        for (int massive : array) {
            sum1 += massive;
        }
        return sum1;
    }

    static double sum(double array []) {
        double sum1 = 0;
        for (double massive : array) {
            sum1 += massive;
        }
        return sum1;
    }

    static int min (int array []){
        int min1 = array [0];
        for (int i = 1; i<array.length; i++){
            if (min1 > array [i]){
                min1 = array [i];
            }
        }
        return min1;
    }

    static double min (double array []){
        double min1 = array [0];
        for (int i = 1; i<array.length; i++){
            if (min1 > array [i]){
                min1 = array [i];
            }
        }
        return min1;
    }

    static int max (int array []){
        int max1 = array [0];
        for (int i = 1; i<array.length; i++){
            if (max1 < array [i]){
                max1 = array [i];
            }
        }
        return max1;
    }

    static double max (double array []){
        double max1 = array [0];
        for (int i = 1; i<array.length; i++){
            if (max1 < array [i]){
                max1 = array [i];
            }
        }
        return max1;
    }

    static int maxPositive (int array []){
        int max1 = array [0];
        for (int i = 1; i<array.length; i++){
            if (max1 < array [i] && array[i] > 0){
                max1 = array [i];
            }
        }
        return max1;
    }

    static double maxPositive (double array []){
        double max1 = array [0];
        for (int i = 1; i<array.length; i++){
            if (max1 < array [i] && array[i] > 0){
                max1 = array [i];
            }
        }
        return max1;
    }

    static long multiplication(int array []) {
        long mult1 = 1;
        for (int massive : array) {
            mult1 *= massive;
        }
        return mult1;
    }

    static double multiplication(double array []) {
        double mult1 = 1;
        for (double massive : array) {
            mult1 *= massive;
        }
        return mult1;
    }

    static int modulus (int array []){
        int mod1;
        int i = array.length-1;
        mod1 = array[0] % array[i];

        return mod1;
    }

    static double modulus (double array []){
        double mod1;
        int i = array.length-1;
        mod1 = array[0]%array[i];

        return mod1;
    }

    static int secondLargest (int array []){
        int max1 = array [0];
        int secondMax = min(array);
        for (int i = 1; i<array.length; i++){
            if (max1 < array [i]){
                secondMax = max1;
                max1 = array [i];
            }
            else
            if (secondMax < array[i] && array[i]!=max1)
                secondMax = array[i];
        }
        return secondMax;
    }

    static double secondLargest (double array []){
        double max1 = array [0];
        double secondMax = min(array);
        for (int i = 1; i<array.length; i++){
            if (max1 < array [i]){
                secondMax = max1;
                max1 = array [i];
            }
            else
            if (secondMax < array[i] && array[i]!=max1)
                secondMax = array[i];
        }
        return secondMax;
    }


    public static void main(String[] args) {
        int array [] = {100, 100, 67, 100, 43, -5, 32, 90, 47, 87};
        double array1 [] = {393.8, 54.7, 52.9, 43.7, 76.8, 65.4, 24.5, 12.4, 90.7, 35.6};


        int resSum = sum(array);
        double resSum2 = sum(array1);
        System.out.println("sum int " + resSum);
        System.out.println("sum double " + resSum2);


        int resMin = min (array);
        double resMin1 = min (array1);
        System.out.println("min int " + resMin);
        System.out.println("min double " + resMin1);

        int resMax = max (array);
        double resMax1 = max (array1);
        System.out.println("max int " + resMax);
        System.out.println("max double " + resMax1);

        int resMaxPos = maxPositive (array);
        double resMaxPos1 = maxPositive (array1);
        System.out.println("maxPositive int " + resMaxPos);
        System.out.println("maxPositive double " + resMaxPos1);

        long resMult = multiplication(array);
        double resMult2 = multiplication(array1);
        System.out.println("multiplication int " + resMult);
        System.out.println("multiplication double " + resMult2);

        int resMod = modulus(array);
        double resMod2 = modulus(array1);
        System.out.println("modulus int " + resMod);
        System.out.println("modulus double " + resMod2);

        int resSecond = secondLargest(array);
        double resSecond2 = secondLargest(array1);
        System.out.println("secondLargest int " + resSecond);
        System.out.println("secondLargest double " + resSecond2);

    }

}
