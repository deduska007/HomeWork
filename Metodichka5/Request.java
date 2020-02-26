
public class Request {
    public static void main(String[] args) {
        Sotrudnik[] person = new Sotrudnik[5];
        person[0] = new Sotrudnik("Valentin", "Ivanov", "Programmer", "valyaivan@google.ru", 890544444423L, 254000, 27);
        person[1] = new Sotrudnik("Oleg", "Kortaviy", "Cleaner", "cleanerolezha@mail.com", 81233211234L, 12000, 47);
        person[2] = new Sotrudnik("Vova", "Stariy", "Engineer", "stariyvova37@yahoo.zhopa", 82324562234L, 48560, 37);
        person[3] = new Sotrudnik("Kirill", "Kortashev", "Climber", "climberkiryuha@zhopa.net", 85635678901L, 52000, 18);
        person[4] = new Sotrudnik("Michelandgelo", "Buonnaroti", "Mutant Turtle", "pizza@italia.net", 89222123553L, 0, 62);
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                System.out.println("Имя: " + person[i].getName() + "; Фамилия: " + person[i].getSurname() + "; Должность: " + person[i].getPosition() + "; Почта: " + person[i].getMail() + "; Телефон: " + person[i].getPhoneNumber() + "; ЗП: " + person[i].getWage() + "; Возраст: " + person[i].getAge());
            }
        }

    }
}
