package number7;

public class Schoolboy extends learner
{
    String id;

    Schoolboy(String fio, String id)
    {
        this.fio=fio;
        this.id=id;
    }

    void getSchoolboy()
    {
        System.out.println(fio+": "+id);
    }
}
