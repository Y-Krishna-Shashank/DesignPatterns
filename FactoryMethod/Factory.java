public class Factory {


    public EmployeeDesignation employeeObject(EmployeeType employeeType)
    {
        if(employeeType.equals(EmployeeType.INTERN))
        {
            return new Intern(20000);
        }
        else if(employeeType.equals(EmployeeType.SOFTWARE_ENGINEER))
        {
            return new SoftwareEngineer(700000);
        }
        else if(employeeType.equals(EmployeeType.SENIOR_SOFTWARE_ENGINEER))
        {
            return new SeniorSoftwareEngineer(1400000);
        }

        return null;
    }
}
