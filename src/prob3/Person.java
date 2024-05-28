package prob3;

class Person implements java.io.Serializable {

    private String name;
    private int age;
    private String address;
    private long phonenumber;
    private char gender;

    public Person(String name, int age, String address, long phone, char gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phonenumber = phone;
        this.gender = gender;
    }

    // Getters and setters (optional)
}
