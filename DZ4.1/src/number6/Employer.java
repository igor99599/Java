package number6;

public class Employer
{
    String firstName;
    String lastName;
    double income;

    Employer(double income)
    {
        this.income=income;
    }

    public Employer() {

    }

    double getIncome() {return income;}
}
