package exampleOne;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee obj) throws Exception {
        //creates a new row
        System.out.println("created a new row in the employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        //deletes existing row
        System.out.println("deleted a existing row in the employee table with employeeId " + employeeId);
    }

    @Override
    public EmployeeDao get(String client, int employeeId) throws Exception {
        // fetch row
        System.out.println("Fetching data from DB");
        return new EmployeeDaoImpl();
    }
}
