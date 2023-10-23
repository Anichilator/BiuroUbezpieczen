public class Person {
    private String name;
    private String surname;
    private long age;
    private int pesel;
    private int phoneNumber;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getAge() {
        return age;
    }

    public int getPesel() {
        return pesel;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, String surname, long age, int pesel, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
        this.phoneNumber = phoneNumber;
    }
}

