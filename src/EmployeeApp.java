public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("herza");
        //employee.sayHello("dio");

        employee = new Manager("parama");
        //employee.sayHello("dio");

        employee = new VicePresident("yudhanto");
        //employee.sayHello("dio");

        sayHello(new Employee("herza"));
        sayHello(new Manager("parama"));
        sayHello(new VicePresident("yudhanto"));
    }
    static void sayHello(Employee employee){
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello vp " + vicePresident);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello manager " + manager.name);
        } else {
            System.out.println("Hello employee " + employee.name);
        }
    }
}
