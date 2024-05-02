package day30_Inheritance.PhoneTask;

public class TestPhoneTask {
    public static void main(String[] args) {

    iPhone iphone = new iPhone("iPhone 12","Large","Black",1000);
    Samsung samsung = new Samsung("Galaxy S22","Medium","White",1100);
    Nokia nokia = new Nokia("Brick","Small","Pink",50);


   iphone.call(911);
   samsung.call(911);
   nokia.call(911);

   iphone.text(123456789);
samsung.text(987654321);
nokia.text(741258963);

        System.out.println("+++++++++++++++++++++++++++++++++++++");

  iphone.faceTime("Asiyatulesh@gmail.com");
  samsung.freeze();
  nokia.selfDefence();
        System.out.println("==================================================");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }
}
