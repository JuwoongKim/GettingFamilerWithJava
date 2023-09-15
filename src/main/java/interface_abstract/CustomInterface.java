package interface_abstract;

public interface CustomInterface {

    // public static final
    String INTERFACE_CONSTANT = "interface_constant";

    // public abstract
    void abstractFunction();

    // public
    default void defaultFunction() {
        System.out.println("can be override");
    }

    // public
    static void staticFunction() {
        System.out.println("can't be override");
    }

}



