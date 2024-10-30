package exampleOne;

public interface EmployeeDao {
     void create(String client, Employee obj) throws Exception;
     void delete(String client, int employeeId) throws Exception;
     EmployeeDao get(String client, int employeeId) throws Exception;
}
