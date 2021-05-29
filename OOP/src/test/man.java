package test;

public class man {
    private String name;
    private int age;

    public man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be more then 0");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
