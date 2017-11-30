package model;

public class EachDish {

    private String name;
    private String cost;
    private String kind;

    public EachDish(String name, String cost, String type) {
        this.name = name;
        this.cost = cost;
        kind = type;
    }

    /**
     * returns food name
     */
    public String getFood() {
        return name;
    }

    /**
     * returns food cost
     */
    public double getCost() {
        return Double.parseDouble(cost);
    }

    public String getKind() {
        return kind;
    }

}
