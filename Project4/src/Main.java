import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 5000.0),
                new Employee(2, "Bob", "IT", 7000.0),
                new Employee(3, "Charlie", "Finance", 6000.0),
                new Employee(4, "David", "HR", 4000.0),
                new Employee(5, "Eve", "IT", 8000.0),
                new Employee(6, "Frank", "Finance", 5500.0));

        // employee with the highest salary in each department.
        Map<String, Optional<Employee>> highestPaidPerDept = employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment(),
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        System.out.println("employee with the highest salary : "+highestPaidPerDept);

        // average salary of employees in the entire company.
        double averageSalary = employees.stream()
                .mapToDouble(emp -> emp.getSalary())
                .average()
                .orElse(0.0);

        System.out.println("averageSalary : "+averageSalary);

        // List the names of employees who earn above the average salary,
        // sorted in descending order of their salaries.
        List<String> aboveAverage = employees.stream()
                .filter(e -> e.getSalary() > averageSalary)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("aboveAverageSalary Employee Names : "+aboveAverage);


        // Group employees by their departments.
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Group employeesByDepartment : "+employeesByDepartment);



    }
}