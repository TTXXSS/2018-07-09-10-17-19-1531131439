package practice07;

public class Student extends Person{
    private String name;
    private int age;
    private Klass klass;
    //private Klass myClass;
    public Student(String name, int age,Klass klass) {
        super(name,age);
        this.name = name;
        this.age = age;
        this.klass=klass;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public Klass getKlass(){
        return klass;
    }
    public String introduce() {
        return super.introduce()+" I am a Student. I am at Class " + getKlass().getNumber() + ".";
    }
}

