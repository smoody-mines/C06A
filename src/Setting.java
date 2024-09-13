
public enum Setting {

    OFF("---"),
    LOW("--+"),
    MEDIUM("-++"),
    HIGH("+++");

    private final String display;

    // Constructor for enum
    
    Setting(String display) {
        this.display = display;
    }

    // Override toString() method to return the string representation
    @Override
    public String toString() {
        return display;
    }
}
