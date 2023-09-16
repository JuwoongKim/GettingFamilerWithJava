package nested_class;

public class Machine {
    String name;
    String usedTime;

    static class Part {
        String partName;
        long partUsedTime;

        public Part(String partName, long partUsedTime) {
            this.partName = partName;
            this.partUsedTime = partUsedTime;
        }

        public void printInfo() {
            System.out.println(partName);
            System.out.println(partUsedTime);
        }
    }

}
