public class Polite_Class {
    private string name;
    private int age;

    public Polite_Class(string name, int age) {
        this.name = name;
        this.age = age;
    }

    public Polite_Class() {
    }

    public string getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(string name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Polite_Class{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

}