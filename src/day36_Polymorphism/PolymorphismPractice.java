package day36_Polymorphism;
import day26_Static.IPhone;
import day30_Inheritance.PhoneTask.iPhone;
import day30_Inheritance.PhoneTask.Nokia;
import day30_Inheritance.PhoneTask.Phone;
import day30_Inheritance.PhoneTask.Samsung;
public class PolymorphismPractice {
    public static void main(String[] args) {

Phone[] phones = {
        new iPhone("iPhone 11 Pro","Large","Black",900),
        new iPhone("iPhone 12 Pro Max","Large","Black",1000),
        new iPhone("iPhone 9","Medium","Gold",700),
        new Samsung("Galaxy S19","Medium","Gold",900),
        new Samsung("Galaxy S20","Large","White",950),
        new Samsung("Galaxy S21","Large","Silver",850),
        new Nokia("XR20","Small","Black",350),
        new Nokia("Brick","Medium","Pink",99),
        new Nokia("Brick","Large","White",250),
        new iPhone("iPhone 11 Pro Max","Large","Silver",1100),
        new iPhone("iPhone 12 Pro","Large","Gold",1200),
        new Samsung("Galaxy S18","Medium","Gold",700),
        new Samsung("Galaxy S17","Large","White",650),
        new Nokia("Brick","Large","White",500),
};

        for (Phone eachPhone : phones) {
            System.out.println(eachPhone.getModel()+" - "+ eachPhone.getColor()+" - "+ eachPhone.getPrice());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

 int countIphone = 0;
 int countSamsung = 0;
        for (Phone each : phones) {
            if(each instanceof iPhone){
                countIphone++;
            }
            if(each instanceof Samsung){
                countSamsung++;
            }
        }
        System.out.println(countIphone);
        System.out.println(countSamsung);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (Phone each : phones) {
            if( each instanceof iPhone || each instanceof Samsung){
                if(each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }










    }
}
