package name.jnsmith.patterns.structure.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() throws Exception {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@homes.com");

        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}
