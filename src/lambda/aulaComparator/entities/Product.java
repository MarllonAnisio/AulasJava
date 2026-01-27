package lambda.aulaComparator.entities;

public class Product {


    private String name;
    private Double price;
    private Boolean active;

    public Product() {
    }

    public Product(String name, Double price, Boolean active) {
        this.name = name;
        this.price = price;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", active=" + active + "]";
    }


    public Boolean isActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
}
