package org.example.task2;

public class Item {

    private final long id;
    private String name;
    private double price;

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public long getId(){
        return id;
    }

    public Item(long _id, String _name, double _price) {
        this.id = _id;
        this.name = _name;
        this.price = _price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
