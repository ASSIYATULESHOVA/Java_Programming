package day27_accessModifiers;

public class InstanceInitialBlock {

public String name;
public int age;
/*
    {
        name = "James";
        age = 20;

    }
*/

    public InstanceInitialBlock(String name, int age){
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
      /*  InstanceInitialBlock obj1 = new InstanceInitialBlock();
        InstanceInitialBlock obj2 = new InstanceInitialBlock();

        System.out.println(obj1.name);
        System.out.println(obj2.age);
*/

    InstanceInitialBlock obj1 = new InstanceInitialBlock("James",20);
    InstanceInitialBlock obj2 = new InstanceInitialBlock("Aaron",25);

        System.out.println(obj1.name);
        System.out.println(obj2.age);




    }



}
