public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Albert", "Wesker", 34, "Project Manager");
        System.out.println(employee.getAge()); // old age
        employee.setAge(40);
        System.out.println(employee.getAge()); // new age
    }
}