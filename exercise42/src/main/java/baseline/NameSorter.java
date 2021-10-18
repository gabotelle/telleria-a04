package baseline;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//    NameSorter
//        -employees
public class NameSorter {
    private final ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> getEmployees(){
        return employees;
    }
    //        Read file
    //            Open file
    //                add to <employees> new Employee(inputFirst, inputLast, inputSalary)
    public void readFile() throws FileNotFoundException {
        FileInputStream fileInput = new FileInputStream("./data/exercise42_input.txt");
        Scanner sc = new Scanner(fileInput);
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(",");
            employees.add(new Employee(line[1], line[0], line[2]));
        }
        sc.close();
    }

    //        Print Header
    //        for each employee
    //              Print Last Name, First Name, Salary
    public void printEmployees(){
        System.out.println("Last       First      Salary");
        System.out.println("----------------------------");
        for (Employee employee: employees) {
            System.out.printf("%-10s %-10s %-10s%n", employee.getLastName(), employee.getFirstName(), employee.getSalary());
        }
    }
}
