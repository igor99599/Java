package number4;

public class Processor
{
    String name;
    float Ghz;

    Processor(String name, int Ghz)
    {
        this.name = name;
        this.Ghz = Ghz;
    }

    float getGhz () {return Ghz;}
    void setGhz (float Ghz) {this.Ghz = Ghz;}

    String getName () {return name;}
    void setName (String name) {this.name = name;}
}

