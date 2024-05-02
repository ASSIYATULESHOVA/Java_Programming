package day30_Inheritance.PhoneTask;

import java.util.Arrays;

public class Phone {

   private String brand , model, size, color;
   private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White","Silver","Gold","Pink"};
        if(Arrays.asList(colors).contains(color)){
            this.color = color;
        }else{
            System.err.println("Invalid color: "+color+" color of the can only be: "+Arrays.toString(colors));
            System.exit(1);
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setPrice(price);
        setColor(color);
        setModel(model);
        setSize(size);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", size='" + getSize()+ '\'' +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
  public void call(long phoneNumber){
      System.out.println(getModel()+" is calling "+phoneNumber);
  }

  public void text(long phoneNumber){
      System.out.println(getModel()+" is texting "+phoneNumber);
  }
}
