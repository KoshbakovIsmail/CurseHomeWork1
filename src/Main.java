
public class Main {
    public static void main(String[] args) {
        Employee[] employeesArr = new Employee[10];
        employeesArr[0] = new Employee("Roy Jons Sapper", 1, 15600.56);
        employeesArr[1] = new Employee("Janni Cappi Sappi", 5, 11500.12);
        employeesArr[2] = new Employee("Chai Ti Li", 4, 13400.02);
        employeesArr[3] = new Employee("Alla Anya Semenova", 3, 12700.45);
        employeesArr[4] = new Employee("Sara Kalli Liss", 1, 17600.89);
        employeesArr[5] = new Employee("Kya Sin Jei", 2, 15600.78);
        employeesArr[6] = new Employee("Fedor Benni Bil", 4, 18260.45);
        employeesArr[7] = new Employee("lilla Lai Sunndi", 2, 14350.36);
        employeesArr[8] = new Employee("Dedy Dos Tolli", 5, 18600.12);
        employeesArr[9] = new Employee("Donni Li Fu", 3, 18405.01);
        printAllEmployee(employeesArr);
        calculateTotatlSalary(employeesArr);
        findAnEmployeeMinSalary(employeesArr);
        findAnEmployeeMaxSalary(employeesArr);
        calculateAvarageSalary(employeesArr);
        printEmployeeFullName(employeesArr);

    }

    public static void printAllEmployee(Employee[] employees) {
        for (Employee employee : employees)
            if (employee != null) {
                System.out.println(employee);
            }
    }

    public static void calculateTotatlSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.salary;
            }
        }
        System.out.println("Total salary of all employee - " + totalSalary);
    }

    public static void findAnEmployeeMinSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        System.out.println(" Minimum wage for workers - " + minSalary.getFullName() + "-" + minSalary.getSalary());
    }

    public static void findAnEmployeeMaxSalary(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        System.out.println(" Maximum wage for workers - " + maxSalary.getFullName() + "-" + maxSalary.getSalary());
    }

    public static void calculateAvarageSalary(Employee[] employees) {
        double totalSum = 0;
        double avarageSum;
        for (Employee employee : employees) {
            totalSum += employee.getSalary();
        }
        avarageSum = totalSum / employees.length;
        System.out.println("Avarage salary - " + avarageSum);
    }

    public static void printEmployeeFullName(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Employee full name - " + employee.getFullName());
            }
        }
    }
}








