package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        System.out.println("ТЕСТИРОВАНИЕ ДОБАВЛЕНИЯ СОТРУДНИКОВ");
        boolean[] results = new boolean[11];
        results[0] = book.addEmployee(new Employee("Иванов И.И.", 1, 100));
        results[1] = book.addEmployee(new Employee("Петров П.П.", 2, 200));
        results[2] = book.addEmployee(new Employee("Сидоров С.С.", 3, 300));
        results[3] = book.addEmployee(new Employee("Козлов К.К.", 4, 400));
        results[4] = book.addEmployee(new Employee("Новиков Н.Н.", 5, 450));
        results[5] = book.addEmployee(new Employee("Фёдоров Ф.Ф.", 1, 120));
        results[6] = book.addEmployee(new Employee("Яковлев Я.Я.", 2, 180));
        results[7] = book.addEmployee(new Employee("Григорьев Г.Г.", 3, 250));
        results[8] = book.addEmployee(new Employee("Семёнов С.С.", 4, 320));
        results[9] = book.addEmployee(new Employee("Тихонов Т.Т.", 5, 380));
        results[10] = book.addEmployee(new Employee("Васильев В.В.", 1, 160)); // 11-й — не поместится

        for (int i = 0; i < results.length; i++) {
            System.out.println("Добавление сотрудника " + (i + 1) + ": " + results[i]);
        }

        System.out.println("\nТЕСТ 1: ВЫВОД ВСЕХ СОТРУДНИКОВ");
        book.printAllEmployees();

        System.out.println("\nТЕСТ 2: СРЕДНЯЯ ЗАРПЛАТА");
        System.out.println("Средняя зарплата: " + String.format("%.2f", book.calculateAverageSalary()));

        System.out.println("\nТЕСТ 3: НАЛОГИ (PROPORTIONAL)");
        book.printTaxes("PROPORTIONAL");

        System.out.println("\nТЕСТ 3: НАЛОГИ (PROGRESSIVE)");
        book.printTaxes("PROGRESSIVE");

        System.out.println("\nТЕСТ 4: ИНДЕКСАЦИЯ ЗАРПЛАТ (отдел 1, +10%)");
        book.indexSalariesByDepartment(1, 10);
        book.printAllEmployees();

        System.out.println("\nТЕСТ 5: ПОИСК СОТРУДНИКА С ЗАРПЛАТОЙ > 200 В ОТДЕЛЕ 2");
        book.findFirstEmployeeWithHigherSalary(2, 200);

        System.out.println("\nТЕСТ 6: ПЕРВЫЕ 3 СОТРУДНИКА С ЗАРПЛАТОЙ < 300");
        book.findEmployeesWithLowerSalary(300, 3);

        System.out.println("\nТЕСТ 7: ПРОВЕРКА НАЛИЧИЯ СОТРУДНИКА");
        Employee testEmployee = new Employee("Тест", 1, 200); // Такой же по зарплате как Петров
        System.out.println("Есть ли сотрудник с зарплатой 200: " + book.containsEmployee(testEmployee));

        Employee nonExistent = new Employee("Не существует", 1, 999);
        System.out.println("Есть ли сотрудник с зарплатой 999: " + book.containsEmployee(nonExistent));

        System.out.println("\nТЕСТ 8: ПОЛУЧЕНИЕ СОТРУДНИКА ПО ID");
        Employee emp = book.getEmployeeById(3);
        if (emp != null) {
            System.out.println("Найден сотрудник с ID 3:");
            emp.printShortInfo();
        } else {
            System.out.println("Сотрудник с ID 3 не найден");
        }

        emp = book.getEmployeeById(99);
        if (emp != null) {
            System.out.println("Найден сотрудник с ID 99:");
            emp.printShortInfo();
        } else {
            System.out.println("Сотрудник с ID 99 не найден");
        }

        System.out.println("\nТЕСТ 9: ПРОВЕРКА equals");
        Employee emp1 = new Employee("Сотрудник 1", 1, 250);
        Employee emp2 = new Employee("Сотрудник 2", 2, 250);
        Employee emp3 = new Employee("Сотрудник 3", 3, 300);

        System.out.println("emp1 и emp2 (одинаковая зарплата): " + emp1.equals(emp2));
        System.out.println("emp1 и emp3 (разная зарплата): " + emp1.equals(emp3));

        System.out.println("\nТЕСТ 10: ПРОВЕРКА ID СОТРУДНИКОВ");
        for (int i = 1; i <= 10; i++) {
            Employee employee = book.getEmployeeById(i);
            if (employee != null) {
                System.out.println("Сотрудник: " + employee.getFullName() +
                        ", ID: " + employee.getId());
            }
        }

        System.out.println("\nТЕСТ 11: ПРОВЕРКА ФОРМАТОВ ВЫВОДА");

        Employee sample = book.getEmployeeById(1);
        if (sample != null) {
            System.out.println("toString: " + sample.toString());
            System.out.print("printShortInfo: ");
            sample.printShortInfo();
        } else {
            System.out.println("Ошибка: не удалось получить образец сотрудника для теста.");
        }

        System.out.println("\nВСЕ ТЕСТЫ ЗАВЕРШЕНЫ");
    }
}
