import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Metodichka2 {
    public static void main(String[] args) {
        swap();
        System.out.println("-------------------------------------------");
        sequense();
        System.out.println("-------------------------------------------");
        multiplyNumbersInArrays();
        System.out.println("-------------------------------------------");
        twoDimensionalArray();
        System.out.println("-------------------------------------------");
        minMaxNumbersInArray();
        System.out.println("-------------------------------------------");
        int[] arrTask6 = new int[7];
        Random random = new Random();
        for (int i = 0; i < arrTask6.length; i++) {
            arrTask6[i] = random.nextInt(5);
        }
        System.out.println(equalPart(arrTask6));
        System.out.println("-------------------------------------------");
        int[] arrTask7 = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrTask7.length; i++) {
            arrTask7[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arrTask7));
        System.out.println("Введи число на которое вы хотите сдвинуть массив: ");
        int n = scanner.nextInt();
        shiftArrayValues(arrTask7, n);

    }


    // The task 1
    public static void swap() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    // The task 2
    public static void sequense() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }

    // The task 3
    public static void multiplyNumbersInArrays() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    // The task 4
    public static void twoDimensionalArray() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // The task 5
    public static void minMaxNumbersInArray() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Минимильное значение в массиве: " + min);
    }

    // The task 6
    public static boolean equalPart(int[] a) {
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            sumFirstPart += a[i];
            for (int j = a.length - 1; j > i; j--) {
                sumSecondPart += a[j];
            }
            if (sumFirstPart == sumSecondPart) {
                return true;
            } else {
                sumSecondPart = 0;
            }
        }
        return false;
    }

    // The task 7
    public static void shiftArrayValues(int[] a, int n) {
        if (n > a.length || (n * -1) > a.length) {
            for (int i = 0; i < a.length; i++) {
                a[i] = 0;
            }
        } else if (n > 0) {
            int quantity = a.length - n;
            for (int i = quantity; i < a.length; i++) {
                a[i] = -1;
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == -1 && j > 0) {
                        a[j] = a[j - 1];
                        a[j - 1] = -1;
                    }
                }
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i] == -1) {
                    a[i] = 0;
                }
            }
        } else if (n < 0) {
            n = n * -1;
            for (int i = 0; i < n; i++) {
                a[i] = -1;
            }
            for (int i = a.length; i > 0; i--) {
                for (int j = a.length-1; j >= 0; j--) {
                    if (a[j] == -1 && j < a.length-1) {
                        a[j] = a[j + 1];
                        a[j + 1] = -1;
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] == -1) {
                    a[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }


}
