package nested_class;

public class Scenario {

    public static void personScenario() {
        Person person = new Person("juwoong", 29);
        Person.Identification identification = person.new Identification("id_1", "1000-10");
        identification.printInfo();
    }

    public static void machineScenario() {
        Machine.Part machine = new Machine.Part("partName", 10);
        machine.printInfo();
    }
}
