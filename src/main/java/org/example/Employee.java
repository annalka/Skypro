package org.example;

public class Employee {
    // Статическая переменная-счётчик для ID
    private static int idCounter = 1;

    // Поля класса (скрытые)
    private int id;
    private String fullName;
    private int department;
    private double salary;

    // Конструктор
    public Employee(String fullName, int department, double salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    // Геттеры
    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public int getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Сеттеры
    public void setDepartment(int department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }

    // Контракт equals — сравнение только по зарплате
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(salary);
    }

    // Переопределение toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + "'"+
        ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    // Метод вывода краткой информации
    public void printShortInfo() {
        System.out.println("Имя: " + fullName + ", Зарплата: " + salary);
    }
}

