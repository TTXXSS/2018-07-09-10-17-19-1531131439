package practice07;

public class Teacher extends Person {

    private String name;
    private int age;
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (getKlass() != null)
            return super.introduce() + " I am a Teacher. I teach Class " + getKlass().getNumber() + ".";
        else
            return super.introduce()+" I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == getKlass().getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        else
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }

}
