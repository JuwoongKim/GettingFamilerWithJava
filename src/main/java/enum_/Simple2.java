package enum_;

public enum Simple2 {
    ONE("NUMBER ONE"),
    TWO("NUMBER TWO"),
    THREE("NUMBER THREE"),
    FOUR("NUMBER FOUR");

    String description;

    Simple2(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
