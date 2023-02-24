package example;

public class Factory {
    Machine machine;

    public Factory(Machine machine) {
        this.machine = machine;
        System.out.println("FACTORY INITIALIZED");
    }

    public Factory() {}

    public void start() {
        machine.doDetail();
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }
}
