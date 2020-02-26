
public class Sotrudnik {
    private String name;
    private String surname;
    private String position;
    private String mail;
    private long phoneNumber;
    private int wage;
    private int age;

    public Sotrudnik(String name, String surname, String position, String mail, Long phoneNumber, int wage, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getMail() {
        return mail;
    }

    public int getWage() {
        return wage;
    }

    public int getAge() {
        return age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


}
