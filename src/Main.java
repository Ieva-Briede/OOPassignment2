import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Officer> officers = new ArrayList<>();
        Officer officer1 = new Officer("Bruce", "Lee", 1050, 5);
        Officer officer2 = new Officer("James", "Bond", 1051,  127);
        Officer officer3 = new Officer("John", "Strange", 1052, 34);
        Officer officer4 = new Officer("David", "Mail", 1053, 56);
        Officer officer5 = new Officer("Luis", "Sailor", 1054, 12);
        Officer officer6 = new Officer("John", "Tailor", 1055, 66);
        Officer officer7 = new Officer("Alice", "Johnson", 1056, 31);

        District district1 = new District("District 1", "Riga", 6010,officers);
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



        //Collections.addAll(district99, officer1, officer2, officer3);

    }
}
