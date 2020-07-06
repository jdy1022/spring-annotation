package bean;


/**
 * @author Mr.jdy
 * @create 2020-04-16 11:21
 */
public class Car {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 价格
     */
    private Double price;

    /**
     * 颜色
     */
    private String color;

    public Car(String brand, Double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public Car() {
        System.out.println("初始化开始。。。。。。");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
