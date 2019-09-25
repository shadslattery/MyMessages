package com.example.mymessages;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    static List<Person> getList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Michael", "This is Michael Message", "1:50pm"));
        people.add(new Person("Jennifer", "This is Jennifer Message", "2:50pm"));
        people.add(new Person("Ben", "This is Ben Message", "2:55pm"));
        people.add(new Person("Jessica", "This is Jessica Message", "3:00am"));
        people.add(new Person("John", "This is John Message", "3.10am"));
        people.add(new Person("Eli", "This is Eli Message", "3:20am"));
        people.add(new Person("Steven", "This is Steven Message", "4:25am"));
        people.add(new Person("Dick", "This is Dick Message", "8:00am"));
        people.add(new Person("Mark", "This is Mark Message", "6:30am"));
        people.add(new Person("Billy", "This is Billy Message", "7:30am"));

        return people;
    }
}
