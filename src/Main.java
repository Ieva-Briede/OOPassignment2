import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Officer> officers = new ArrayList<Officer>();
        Officer officer1 = new Officer("Bruce", "Lee", 1050, 5);
        Officer officer2 = new Officer("James", "Bond", 1051, 127);
        Officer officer3 = new Officer("John", "Strange", 1052, 34);
        Officer officer4 = new Officer("David", "Mail", 1053, 56);
        Officer officer5 = new Officer("Luis", "Sailor", 1054, 91);
        Officer officer6 = new Officer("John", "Tailor", 1055, 66);
        Officer officer7 = new Officer("Alice", "Johnson", 1056, 81);

        District district1 = new District("District 1", "Riga", 6010, officers);
        District district2 = new District("District 2", "Ogre", 6020, officers);

        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);

        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        System.out.println("District 1: \n" + district1.toString());
        System.out.println("District 2: \n" + district2.toString());

        district2.removeOfficer("Alice", "Johnson");

        System.out.println("Average Level in District 1: " + district1.calculateAvgLevelInDistrict());
        System.out.println("Average Level in District 2: " + district2.calculateAvgLevelInDistrict());

        ArrayList<District> joinedDistrict = new ArrayList<>();
        joinedDistrict.add(district1);
        joinedDistrict.add(district2);

        int totalAmountOfOfficers = 0;
        float level = 0;

        for (District officer : joinedDistrict) {
            totalAmountOfOfficers = totalAmountOfOfficers + officer.getOfficersInTheDistrict().size();
            level = level + officer.calculateAvgLevelInDistrict();

        }
        System.out.println("There are " + totalAmountOfOfficers + " officers in both districts together");
        System.out.println("Average level of both districts is " + level / joinedDistrict.size());


        if (district1.calculateAvgLevelInDistrict() == district2.calculateAvgLevelInDistrict()) {
            System.out.println("Both districts are equal according to level of Officers");
        } else if (district1.calculateAvgLevelInDistrict() > district2.calculateAvgLevelInDistrict()) {
            System.out.println("District 1 is better than District 2 based on level of Officers");
        } else {
            System.out.println("District 2 is better than District 1 based on level of Officers");
        }

        joinedDistrict.remove(0); // are they just removed from the array list but they are still in arraylist District 1?
        System.out.println(district1);
        System.out.println(joinedDistrict);

    }

}






