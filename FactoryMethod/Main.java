import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String designation;

        System.out.println("Enter employee type\n 1.Intern\n 2.Software engineer\n 3.Senior software engineer\n");
        designation= scanner.nextLine();
        Factory eeDesignationFactory=new Factory();
        EmployeeDesignation emp;
        if(designation.equalsIgnoreCase("intern"))
           emp= eeDesignationFactory.employeeObject(EmployeeType.INTERN);
        else if(designation.equalsIgnoreCase("software engineer"))
           emp= eeDesignationFactory.employeeObject(EmployeeType.SOFTWARE_ENGINEER);
        else if(designation.equalsIgnoreCase("senior software engineer"))
            emp=eeDesignationFactory.employeeObject(EmployeeType.SENIOR_SOFTWARE_ENGINEER);
        emp.printBenefits();

    }
}
