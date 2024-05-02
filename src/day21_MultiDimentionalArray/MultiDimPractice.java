package day21_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimPractice {
    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", " Anna", "Molly"};
        String[] group2 = {"Alex", "Sasha", "Monica"};
        String[] group3 = {"Sofia", "Galina", "Madina","Asiayh", "Zhanna"};
        String[] group4 = {"Medin", "Bek"};

        String[][] groups = {group1,group2,group3,group4 };
        // index                0      1      2     3
        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("===================================");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }


        System.out.println("===================================");

        for (int i = groups.length - 1; i >= 0; i--) {
          String[] eachGroup =  groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent :eachGroup){
                System.out.println(eachStudent);
            }
        }

        System.out.println("===================================");

        System.out.println( Arrays.deepToString(groups)); // deeptoString method for multiDime

    }
}
