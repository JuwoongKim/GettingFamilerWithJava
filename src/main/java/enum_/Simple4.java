package enum_;

public enum Simple4 {
    ONE("ONE") {
        @Override
        public void print() {
            System.out.println("ONE");
        }
    },
    TWO("TWW") {
        @Override
        public void print() {
            System.out.println("TWO");
        }
    };

    private String description;

    Simple4(String description) {
        this.description = description;
    }

    public abstract void print();

}
