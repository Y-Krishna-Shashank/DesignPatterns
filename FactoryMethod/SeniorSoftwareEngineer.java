import java.util.ArrayList;

public class SeniorSoftwareEngineer implements EmployeeDesignation {
    int salary;
    ArrayList<String> benefits;
    SeniorSoftwareEngineer(int salary)
    {
        this.salary=salary;
        this.benefits=new ArrayList<String>(){
            {
                add("Meals allowance ₹3000");
                add("Work from home setup assistance ₹11000");
                add("Insurance ₹5lacs");
                add("Salary: "+salary);
                add("Commuter assistance");
                add("Parental leave");
                add("Stock options");
            }
        };
    }

    @Override
    public void printBenefits() {
        System.out.println("The benefits for the role of senior software engineer are");
        for(String benefit: benefits)
            System.out.println(benefit);
    }
}

