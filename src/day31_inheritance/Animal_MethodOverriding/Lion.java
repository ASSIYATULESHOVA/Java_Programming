package day31_inheritance.Animal_MethodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion ;

    public Lion(String name, String breed, String size, String color, int age, char gender, boolean isAfricanLion) {
        super(name, breed, size, color, age, gender);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    public void eat(){
       System.out.println("Lion "+getName()+" is eating deer");
   }

    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", African lion =" + isAfricanLion +
                '}';
    }
}
