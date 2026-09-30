interface RemoteControl {

    void turnOn();

    void turnOff();
}


abstract class Appliance {

    abstract void displayAppliance();
}


class SmartTV extends Appliance implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Smart TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is OFF");
    }

    @Override
    void displayAppliance() {
        System.out.println("Appliance: Smart TV");
        System.out.println("Status: Ready");
    }
}


public class Exp6
 {

    public static void main(String[] args) {

        // Dynamic method dispatch
        Appliance a = new SmartTV();

        a.displayAppliance();

        RemoteControl tv = (SmartTV) a;

        tv.turnOn();
        tv.turnOff();
    }
}