package rest;



public class Students {

    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public Students setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Students(int id, String name, String surname, String email, String phone) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public Students(int id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Students() {

    }

    public int getId() {
        return id;
    }

    public Students setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Students setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Students setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Students setEmail(String email) {
        this.email = email;
        return this;
    }

}
