package com.example.mymessages;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    static List<Person> getList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Michael", "Jordan", "mj23@bulls.com", "2123452321", ""));
        people.add(new Person("Jennifer", "Nelson", "jNelson321.com", "7824569585", ""));
        people.add(new Person("Ben", "Laney", "laneyBen395.com", "4195427112", ""));
        people.add(new Person("Jessica", "Bonner", "bonner69.com", "8108957482", ""));
        people.add(new Person("John", "Goose", "goosejohn.com", "8528139781", ""));
        people.add(new Person("Eli", "Geroge", "eg851.com", "2157359237", ""));
        people.add(new Person("Steven", "Jobs", "stevejobs.com", "9527528953", ""));
        people.add(new Person("Dick", "Gordan", "GardanD.com", "85286498574", ""));
        people.add(new Person("Mark", "Pierman", "mpiermans.com", "4195427549", ""));
        people.add(new Person("Billy", "Jordan", "bjordan.com", "8135697125", ""));

        return people;
    }
}
