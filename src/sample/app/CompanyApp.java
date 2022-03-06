package sample.app;

import sample.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("inmotion");
//        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        employee.setName("herza");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

    }
}
