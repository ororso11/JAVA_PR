
class Student {
    private  String name;
    private  int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this(name,0);
    }

}

public class ClassCode {
    public static void main(String[] args) {
        Student yj = new Student("CYJ",10);
    }
}