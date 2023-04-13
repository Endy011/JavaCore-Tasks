package Lesson7;

public class Employee {
    private String name;
    private String surname;
    private double salary;
    private double workHour;

    public Employee(String name, String surname, double salary, double workHour) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHour = workHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    public void getInfo() {
        System.out.println(getName() + " " + getSalary() + " " + getWorkHour());
    }

    public static void AddSal(double salary) {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void AddWork(double workHour) {
        if(workHour > 6) {
            salary+=5;
        }
    }
}
