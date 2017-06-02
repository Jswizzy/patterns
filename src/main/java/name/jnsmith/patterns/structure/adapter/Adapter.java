package name.jnsmith.patterns.structure.adapter;

import java.util.List;

public class Adapter {

    public static void main(String[] args) throws Exception {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
