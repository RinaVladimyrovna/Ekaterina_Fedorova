package hws.hw6.ex1.ENUMs;

public enum Metals {

    GOLD("Gold"),
    SILVER("Silver"),
    BRONZE("Bronze"),
    SELEN("Selen");

    private String value;

    Metals(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
