import java.util.ArrayList;

public class Intern implements EmployeeDesignation{
int salary;
ArrayList<String> benefits;
    Intern(int salary)
    {
       this.salary=salary;
       this.benefits=new ArrayList<String>(){
           {
               add("Meals allowance ₹3000");
           }
       };
    }

    @Override
    public void printBenefits() {
        System.out.println("The benefits for the role of intern are");
        System.out.println("stipend "+salary+" which is tax free");
    }
}
