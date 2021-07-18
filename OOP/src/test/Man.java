package test;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else System.out.println("Возраст должен быть больше 0");
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else System.out.println("Имя не может быть пустым");
    }

    public void showInfo() {
        System.out.println("Name " + name + " ,age " + age);
    }


}
