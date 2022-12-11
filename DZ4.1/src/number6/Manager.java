package number6;

public class Manager extends Employer
{
    double averageSum;

    Manager (double income, double averageSum)
    {
        this.income=income;
        this.averageSum=averageSum;
    }

    double getIncome() {
        return income + averageSum;
    }
}
