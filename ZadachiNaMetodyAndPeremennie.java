public class ZadachiNaMetodyAndPeremennie {
    public static void main(String[] args) {
        System.out.println(evenNumber(2));
        System.out.println("-------------------------------------------");
        isString("ты","пидор");
        System.out.println("-------------------------------------------");
        System.out.println(multiplyAndComparison(6, 5));
        System.out.println("-------------------------------------------");
        comparisonNumber(20,30,20);

    }
    // The task 1
    public static boolean evenNumber(int a) {
        if (a % 2 == 0) {
            return true;
        } else return false;
    }

    // The task 2
    public static void isString(String a, String b) {
        System.out.println(a + " " + b);
    }

    // The task 3
    public static int multiplyAndComparison(int a, int b) {
        if (a > b) {
            System.out.println("Число a:" + a + " больше числа b:" + b + "!");
        } else if (b > a) {
            System.out.println("Число b:" + b + " больше числа a:" + a + "!");
        }else System.out.println("Числа равны");
        return a * b;
    }

    // The task 4
    public static void comparisonNumber(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Все числа равны");
        } else if (a == c) {
            System.out.println("Число а:" + a + " равно числу c:" + c);
        } else if (b == c) {
            System.out.println("Число b:" + b + " равно числу c:" + c);
        } else if (a == b) {
            System.out.println("Число а:" + a + " равно числу b:" + b);
        }else System.out.println("Равных чисел нет");
    }

}
