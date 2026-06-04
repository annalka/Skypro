package org.example;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    // 1. Вывод всех сотрудников
    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    // 2. Среднее значение зарплат
    public double calculateAverageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    // 3. Вывод налогов
    public void printTaxes(String taxType) {
        for (Employee employee : employees) {
            if (employee == null) continue;

            double tax = 0;
            switch (taxType) {
                case "PROPORTIONAL":
                    tax = employee.getSalary() * 0.13;
                    break;
                case "PROGRESSIVE":
                    double salary = employee.getSalary();
                    if (salary <= 150) {
                        tax = salary * 0.13;
                    } else if (salary <= 350) {
                        tax = salary * 0.17;
                    } else {
                        tax = salary * 0.21;
                    }
                    break;
                default:
                    System.out.println("Неизвестный тип налога: " + taxType);
                    return;
            }
            System.out.printf("Сотрудник: %s, Зарплата: %.2f, Налог: %.2f%n",
                    employee.getFullName(), employee.getSalary(), tax);
        }
    }

    // 4. Индексация зарплаты по отделу
    public void indexSalariesByDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee == null) continue;
            if (employee.getDepartment() != department) continue;

            double newSalary = employee.getSalary() * (1 + percent / 100);
            employee.setSalary(newSalary);
        }
    }

    // 5. Поиск первого сотрудника отдела с зарплатой выше указанной
    public void findFirstEmployeeWithHigherSalary(int department, double wage) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee == null) continue;

            if (employee.getDepartment() == department && employee.getSalary() > wage) {
                System.out.println("Найден сотрудник на позиции " + i + ":");
                employee.printShortInfo();
                return; // break уже есть в условии, но лучше явно выйти
            }
        }
        System.out.println("Сотрудник не найден");
    }

    // 6. Поиск первых N сотрудников с зарплатой меньше указанной
    public void findEmployeesWithLowerSalary(double wage, int employeeNumber) {
        int found = 0;
        int index = 0;

        while (index < employees.length && found < employeeNumber) {
            Employee employee = employees[index];
            if (employee != null && employee.getSalary() < wage) {
                employee.printShortInfo();
                found++;
            }
            index++;
        }
    }

    // 7. Проверка наличия сотрудника (по зарплате)
    public boolean containsEmployee(Employee employee) {
        if (employee == null) return false;

        for (Employee emp : employees) {
            if (emp != null && emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    // 8. Добавление нового сотрудника
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    // 9. Получение сотрудника по ID
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
