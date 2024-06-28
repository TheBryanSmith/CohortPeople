package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "TenFiveZero.csv";



        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

//        List listOfStudents = programObject.loadCSVFile(student_source);
        List listOfStudents = programObject.handWrittenLoadOfData(student_source);

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }


    private List handWrittenLoadOfData(String student_source) {
        ArrayList<Person> students = new ArrayList<>();
        String dry = "Water";

        Person p1 = new Person("Teddy", "Archibald");
        p1.setGitHub("");
        p1.setFavoriteColor("Red");
        p1.setBirthMonth(" March");
        p1.setBeverage("arnold palmer");
        students.add(p1);

        Person p2 = new Person("Peter", "Van Beever");
        p2.setGitHub("");
        p2.setFavoriteColor("Purple");
        p2.setBirthMonth("February");
        p2.setBeverage("Latte");
        students.add(p2);




        Person p3 = new Person("Tim", "Linkous");
        p3.setGitHub("");
        p3.setFavoriteColor("Green");
        p3.setBirthMonth("September");
        p3.setBeverage(dry);
        students.add(p3);



        Person p4 = new Person("Qian", "Wang");
        p4.setGitHub("");
        p4.setFavoriteColor("Blue");
        p4.setBirthMonth("October");
        p4.setBeverage(dry);
        students.add(p4);


        Person p5 = new Person("Diptika", "Devi");
        p5.setGitHub("");
        p5.setFavoriteColor("Orange");
        p5.setBirthMonth("June");
        p5.setBeverage("Tea");
        students.add(p5);



        Person p6 = new Person("Tim", "Nguyen");
        p6.setGitHub("");
        p6.setFavoriteColor("White");
        p6.setBirthMonth("November");
        p6.setBeverage("Bubble Tea");
        students.add(p6);


  Person p7 = new Person("Bryan", "Smith");
        p7.setGitHub("");
        p7.setFavoriteColor("Brown");
        p7.setBirthMonth("May");
        p7.setBeverage(dry);
        students.add(p7);



        Person p8 = new Person("Jonathan", "Diehl");
        p8.setGitHub("");
        p8.setFavoriteColor("Green");
        p8.setBirthMonth("December");
        p8.setBeverage("Coffee");
        students.add(p8);



         Person p9 = new Person("Jared", "Thacker");
        p9.setGitHub("");
        p9.setFavoriteColor("Green");
        p9.setBirthMonth("December");
        p9.setBeverage(dry);
        students.add(p9);

         Person p10 = new Person("Robbie", "Niemeyer");
        p10.setGitHub("");
        p10.setFavoriteColor("Blue");
        p10.setBirthMonth("January");
        p10.setBeverage(dry);
        students.add(p10);

         Person p11 = new Person("Mohammed", "N");
        p11.setGitHub("");
        p11.setFavoriteColor("Green");
        p11.setBirthMonth("August");
        p11.setBeverage("Snapple");

        Person p12 = new Person("Josue", "Castro");
        p12.setGitHub("");
        p12.setFavoriteColor("Blue");
        p12.setBirthMonth("June");
        p12.setBeverage("Coffee");

        Person p13 = new Person("Coreye", "Ross");
        p13.setGitHub("");
        p13.setFavoriteColor("Black");
        p13.setBirthMonth("October");
        p13.setBeverage(dry);

        Person p14 = new Person("Will", "Chapman");
        p14.setGitHub("");
        p14.setFavoriteColor("Purple");
        p14.setBirthMonth("December");
        p14.setBeverage(dry);


        // and so on for EACH person in the cohort.

        return students;
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1], values[2], values[3]);
        return newPerson;
    }

}
