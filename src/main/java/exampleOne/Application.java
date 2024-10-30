package exampleOne;

public class Application {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("ADMIN", new Employee());
            System.out.println("Operation Successful");

            System.out.println();
            employeeDao.create("USER", new Employee());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println("Operation Unsuccessful");
            System.out.println(e.getMessage());
        }
    }
}
