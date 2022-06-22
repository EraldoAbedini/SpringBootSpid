package entities;

import java.sql.Timestamp;

public class User extends Base {
    final private long id;
    private String name;
    private String surname;
    private String username;

    public User() {
        super();
        id = 0;
    }

    public User(long id, Timestamp createdAt, Timestamp modifiedAt, long userId, String name, String surname, String username) {
        super(id, createdAt, modifiedAt);
        this.id = userId;
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("UserId: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Username: " + this.username);
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}