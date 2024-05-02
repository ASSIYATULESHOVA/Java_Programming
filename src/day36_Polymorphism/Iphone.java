package day36_Polymorphism;

import java.util.Arrays;

public class Iphone {
    private String brand , model, size, color;
    private double price;

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Iphone)){
            System.err.println("Invalid Object");
            System.exit(1);
        }
        if(obj instanceof Iphone){
           if(model.equals(( (Iphone)obj).model) ){
              if(color.equals( ( (Iphone)obj ).color)){
                return true;
               }
           }
        }
        return false;
    }

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

    public Iphone(String brand, String model, String size, String color, double price) {
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





