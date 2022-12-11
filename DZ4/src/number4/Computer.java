package number4;

public class Computer
{
    Monitor monitor;
    Processor processor;
    Memory memory;
    Names name;

    Computer(Names name, Monitor monitor, Processor processor, Memory memory)
    {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.name = name;
    }

    Monitor getMonitor () {return this.monitor;}

    Processor getProcessor () {return processor;}

    Memory getMemory () {return memory;}

    Names getName () {return name;}

    void setMonitor (Monitor monitor) {this.monitor = monitor;}

    void setName (Names name) {this.name = name;}

    void setMemory (Memory memory) {this.memory = memory;}

    void setProcessor (Processor processor) {this.processor = processor;}
}
