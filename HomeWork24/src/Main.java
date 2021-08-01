import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Alex");
        Programmer programmer2 = new Programmer("Greg");
        Programmer programmer3 = new Programmer("Sarah");
        Driver driver1 = new Driver("Hanna");
        Driver driver2 = new Driver("Anna");
        Driver driver3 = new Driver("Rob");
        Cook cook1 = new Cook("Den");
        Cook cook2 = new Cook("Noah");
        Cook cook3 = new Cook("William ");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(cook1);
        employees.add(cook2);
        employees.add(cook3);

        for (Employee person : employees) {
            person.voice();
        }
        ArrayList<Programmer> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        for (Programmer person : programmers) {
            person.Programming();
        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Driver person : drivers) {
            person.Driving();
        }
        ArrayList<Cook> cooks = new ArrayList<>();
        cooks.add(cook1);
        cooks.add(cook2);
        cooks.add(cook3);
        for (Cook person : cooks) {
            person.Cook();
        }

    }
}
