package practice06;

public class Teacher extends Person {

    private String name;
    private int age;
    private int klass;

    public Teacher(String name, int age, int klass) {
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

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if(getKlass()!=0)
        return super.introduce() + " I am a Teacher. I teach Class "+getKlass()+".";
        else
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
    }

}

