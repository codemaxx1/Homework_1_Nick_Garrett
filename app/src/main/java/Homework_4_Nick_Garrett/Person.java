package Homework_4_Nick_Garrett;

public class Person {
    //age name, birthday
    private String name;
    private int age;
    private String birthday;

    public Person(String name, int age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Person(String name) {
    }


    /////////////////////////////////
    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    /////////////////////////////////
    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    /////////////////////////////////
    //birthday
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}
