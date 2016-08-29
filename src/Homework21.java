public class Homework21 {

    static int sum(int array []) {
        int arraySum = 0;
        for (int massive : array) {
            arraySum += massive;
        }
        return arraySum;
    }

    static double sum(double array []) {
        double arraySum = 0;
        for (double massive : array) {
            arraySum += massive;
        }
        return arraySum;
    }

    static int min (int array []){
        int arrayMin = array [0];
        for (int i = 1; i<array.length; i++){
            if (arrayMin > array [i]){
                arrayMin = array [i];
            }
        }
        return arrayMin;
    }

    static double min (double array []){
        double arrayMin = array [0];
        for (int i = 1; i<array.length; i++){
            if (arrayMin > array [i]){
                arrayMin = array [i];
            }
        }
        return arrayMin;
    }

    static int max (int array []){
        int arrayMax = array [0];
        for (int i = 1; i<array.length; i++){
            if (arrayMax < array [i]){
                arrayMax = array [i];
            }
        }
        return arrayMax;
    }

    static double max (double array []){
        double arrayMax = array [0];
        for (int i = 1; i<array.length; i++){
            if (arrayMax < array [i]){
                arrayMax = array [i];
            }
        }
        return arrayMax;
    }

    static int maxPositive (int array []){
        int arrayMaxPos = array [0];
        for (int i = 1; i<array.length; i++){
            if (array[i] > 0){
                if (arrayMaxPos < array [i]) {
                    arrayMaxPos = array[i];
                }
            }
        }
        return arrayMaxPos;
    }

    static double maxPositive (double array []){
        double arrayMaxPos = array [0];
        for (int i = 1; i<array.length; i++){
            if (array[i] > 0){
                if (arrayMaxPos < array [i]) {
                    arrayMaxPos = array[i];
                }
            }
        }
        return arrayMaxPos;
    }

    static long multiplication(int array []) {
        long arrayMult = 1;
        for (int massive : array) {
            arrayMult *= massive;
        }
        return arrayMult;
    }

    static double multiplication(double array []) {
        double arrayMult = 1;
        for (double massive : array) {
            arrayMult *= massive;
        }
        return arrayMult;
    }

    static int modulus (int array []){
        int mod;
        int i = array.length-1;
        mod = array[0] % array[i];

        return mod;
    }

    static double modulus (double array []){
        double mod;
        int i = array.length-1;
        mod = array[0]%array[i];

        return mod;
    }

    static int secondLargest (int array []){
        int arrayMax = max(array);
        int secondMax = min(array);
        for (int i = 1; i<array.length; i++){
            if (secondMax < array[i] && array[i] != arrayMax) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    static double secondLargest (double array []){
        double arrayMax = max(array);
        double secondMax = min(array);
        for (int i = 1; i<array.length; i++){
            if (secondMax < array[i] && array[i] != arrayMax) {
                secondMax = array[i];
            }
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
