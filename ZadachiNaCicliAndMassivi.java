import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ZadachiNaCicliAndMassivi {
    public static void main(String[] args) {
    sumZerosAndOnes();
    System.out.println("-------------------------------------------");
    oddAverage();
    System.out.println("-------------------------------------------");
    sumFromNumberN();
    System.out.println("-------------------------------------------");
    sumTwoDimensionalArray();
    }

    // The task 1
    public static void sumZerosAndOnes() {
        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1};
        int[] arrTwo = new int[4];
        System.out.println(Arrays.toString(arr));
        int sumZero = 0;
        int sumOne = 0;

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (arr[i] == 0 && arr[i + 1] == 1) {
                    sumZero += 1;
                    sumOne = 0;
                    arrTwo[j] = sumZero;
                    j++;
                } else if (arr[i] == 0) {
                    sumZero += 1;
                }
                if (arr[i] == 1 && arr[i + 1] == 0) {
                    sumOne += 1;
                    sumZero = 0;
                    arrTwo[j] = sumOne;
                    j++;
                } else if (arr[i] == 1) {
                    sumOne += 1;
                }
            } else if (arr[i] == 1) {
                sumOne += 1;
                arrTwo[j] = sumOne;
            } else if (arr[i] == 0) {
                sumZero += 1;
                arrTwo[j] = sumZero;
            }
        }
        System.out.println(Arrays.toString(arrTwo));
    }

    // The task 2
    public static void oddAverage() {
        int[] arr = new int[10];
        Random random = new Random();

        int sum = 0;
        int quantity = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i+=2) {
            sum += arr[i];
            if (i % 2 != 0) {
                quantity += 1;
            }
        }
        double average = (double) sum / quantity;
        System.out.println("Среднее арифметическое чисел стоящих на нечётных позициях: " + average);
    }

    // The task 3
    public static void sumFromNumberN() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[15];
        int setValue;
        int sumValue = 0;
        int from = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Введите значение до которого будет посчитан массив: ");
        setValue = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == setValue) {
                for (int j = from; j <= i; j++) {
                    sumValue += arr[j];
                }
                from = i + 1;
            }
        }
        System.out.println(sumValue);
    }

    // The task 4
    public static void sumTwoDimensionalArray() {
        int[][] arr = new int[3][3];
        Random random = new Random();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(5);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма всех элементов квадратной матрицы: " + sum);

    }
}
