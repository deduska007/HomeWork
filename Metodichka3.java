import java.util.Random;
import java.util.Scanner;

public class Metodichka3 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        guessTheNumber();
        guessTheWord();

    }

    //The tusk 2
    public static void guessTheNumber() {
        int guessedNumber = random.nextInt(11);
        int input, restart;
        System.out.println("Угадайте загаданное число от 0 до 9, у вас есть 3 попытки!");
        System.out.println("Введите ваше число: ");
        for (int i = 0; i <= 3; i++) {
            if (i == 3) {
                System.out.println("Вы исчерпали количество попыток! Хотите продолжить? 1-ДА/2-НЕТ");
                restart = scanner.nextInt();
                if (restart == 1) {
                    i = -1;
                    guessedNumber = random.nextInt(9);
                    System.out.println("Введите ваше число: ");
                }else break;
            } else if (i < 3) {
                input = scanner.nextInt();
                if (input > guessedNumber) {
                    System.out.println("Загаданное число меньше!");
                } else if (input < guessedNumber) {
                    System.out.println("Загаданное число больше!");
                } else if (input == guessedNumber) {
                    System.out.println("Вы выйграли! Хотите сыграть ещё раз? 1-ДА/2-НЕТ");
                    restart = scanner.nextInt();
                    if (restart == 1) {
                        i = -1;
                        guessedNumber = random.nextInt(11);
                        System.out.println("Введите ваше число: ");
                    }else break;
                }
            }
        }
    }

    //The task 2
    public static void guessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String str, cap = "";
        String guessedTheWords = words[random.nextInt(words.length)];
        int restart;
        System.out.print("Вам нужно отгадать одно загаданное слова из предложенных: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + "; ");
        }
        System.out.println();
        System.out.println("Введите вашу догадку: ");
        for (; ;) {
            str = scanner.nextLine();
            while (str.length() < guessedTheWords.length()) {
                str += "#";
            }
            if (str.equals(guessedTheWords) == true) {
                System.out.println("Поздравляем вы выйграли! Загаданное слово: " + guessedTheWords);
                System.out.println("Желаете повторить? 1-ДА/2-НЕТ");
                restart = scanner.nextInt();
                if (restart == 1) {
                    guessedTheWords = words[random.nextInt(words.length)];
                    System.out.println("Введите вашу догадку: ");
                    str = scanner.nextLine();
                } else break;
            } else if (str.equals(guessedTheWords) == false) {
                cap = "";
                for (int i = 0; i < guessedTheWords.length() - 1; i++) {
                    if (guessedTheWords.charAt(i) == str.charAt(i)) {
                        cap += guessedTheWords.charAt(i);
                    } else cap += "#";
                }
                while (cap.length() < 15) {
                    cap += "#";
                }
                System.out.println(cap);
                System.out.println("Повторите попытку!");
            }
        }
    }

}
