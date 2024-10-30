package exampleOne;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDaoObject;

    public EmployeeDaoProxy() {
        this.employeeDaoObject = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDaoObject.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDaoObject.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDao get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") ||  client.equals("USER")) {
           return employeeDaoObject.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}
