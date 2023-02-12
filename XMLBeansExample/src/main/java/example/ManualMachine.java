package example;

public class ManualMachine implements Machine{
    @Override
    public void doDetail() {
        System.out.println("ManualMachine did detail");
    }
}
