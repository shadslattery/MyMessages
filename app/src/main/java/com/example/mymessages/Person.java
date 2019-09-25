package com.example.mymessages;


public class Person {
    private String Name;
    private String Description;
    private String Time;
    /*private String Image;*/


    public Person(String Name, String Description,String Time) {
        this.Name = Name;
        this.Description = Description;
        this.Time = Time;
        /*this.Image = Image;*/
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    /*public String getImage() { return Image;*/
    }

    /*public void setImage(String Image) { this.Image = Image;}*/

