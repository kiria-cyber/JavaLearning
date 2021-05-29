public class employee {
    String name;
    String position;
    int salary;
    int i;


    public employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String info(int i) {
        this.i = i;
        int s = salary * i;
        String Inf = "Сотрудник: " + name + ", должность: " + position + ", За последние " + i + " месяцев получил " + s;
        return Inf;
    }
}
