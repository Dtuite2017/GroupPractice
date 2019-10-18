public class Carol {
    private string name;
    private int age;

    public Carol(string name, int age) {
        this.name = name;
        this.age = age;
    }

    public Carol() {
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
        return "Carol{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

}