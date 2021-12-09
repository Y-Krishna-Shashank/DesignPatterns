import java.util.ArrayList;

public class SoftwareEngineer implements EmployeeDesignation{
        int salary;
        ArrayList<String> benefits;
        SoftwareEngineer(int salary)
        {
            this.salary=salary;
            this.benefits=new ArrayList<String>(){
                {
                    add("Meals allowance ₹3000");
                    add("Work from home setup assistance ₹11000");
                    add("Insurance ₹5lacs");
                    add("Salary: "+salary);
                }
            };
        }

        @Override
        public void printBenefits() {
            System.out.println("The benefits for the role of software are");
            for(String benefit: benefits)
                System.out.println(benefit);
        }
    }


