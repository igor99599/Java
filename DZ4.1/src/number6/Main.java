package number6;

public class Main
{
    public static void main(String[] args)
    {
        Employer manager = new Manager(150.5, 20);
        Employer employer = new Employer(200);
        Employer[] employers = {manager, employer};

        for (Employer emp : employers) {
            System.out.println(emp.getIncome());
        }
    }
}
