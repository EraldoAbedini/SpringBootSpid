package service;

import entities.Spid;
import entities.Status;
import entities.User;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class USService {
    public User createUser(long id, long userId, String name, String surname, String username) {
        User user = null;
        try {
            user = new User(id,
                    new Timestamp(System.currentTimeMillis()),
                    new Timestamp(System.currentTimeMillis()),
                    userId, name, surname, username);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    public Spid createSpid(long id, long spidId, User user, String description) {
        Spid spid = null;
        try {
            spid = new Spid(id,
                    new Timestamp(System.currentTimeMillis()),
                    new Timestamp(System.currentTimeMillis()),
                    spidId, user, description
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return spid;
    }

    public void updateUserName(User user, String name) {
        user.setName(name);
        System.out.println("User with id " + user.getId() + " changed name to " + user.getName());
    }

    public void updateUserSurname(User user, String sname) {
        user.setSurname(sname);
        System.out.println("User with id " + user.getId() + " changed surname to " + user.getSurname());
    }

    public void updateUserUsername(User user, String gmail) {
        user.setUsername(gmail);
        System.out.println("User with id " + user.getId() + " changed username to " + user.getUsername());
    }

    public void updateUser(User user, String name, String sname, String usname) {
        user.setName(name);
        user.setSurname(sname);
        user.setUsername(usname);
    }

    public void updateDescription(Spid spid, String desc){
        spid.setDescription(desc);
        System.out.println("Spid with id " + spid.getId() + " changed description to " + spid.getDescription());
    }

    public void approveStatus(Spid spid, User user) {
        spid.setStatus(Status.APPROVED);
        System.out.println("Status of user with userId " + user.getId() + " is approved!");
    }

    public void connectedTo(ArrayList<Spid> spidArrayList){
        for(Spid spid: spidArrayList) System.out.println(spid.getUser().getName() + " is connected to " + spid.getId());
    }


    public void showAllSpids(ArrayList<Spid> spidArrayList){
        spidArrayList.forEach(System.out::println);
    }
    public List<Spid> searchUserSpid(ArrayList<Spid> arrayList, User user){
        return arrayList.stream().filter((s) -> s.getId() == user.getId()).collect(Collectors.toList());
    }
}