package com.example.demo;

import entities.Spid;
import entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.USService;

import java.util.ArrayList;
import java.util.Arrays;


@ComponentScan("com.example.demo")
@Configuration
@SpringBootApplication

public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		USService userService = new USService();
		User user1 = userService.createUser(1000L, 101L, "Eraldo", "Abedin", "abedinieraldo@gmail.com");
		User user2 = userService.createUser(1001L, 102L, "Albin", "Mema", "albinmema@gmail.com");
		user1.displayInfo();

		Spid spid1 = userService.createSpid(1001L, 101L, user1, "text1");
		Spid spid2 = userService.createSpid(1002L, 102L, user2, "text2");
		ArrayList<Spid> spidArrayList = new ArrayList<>(Arrays.asList(spid1, spid2));

		System.out.println(spid1.toString());
		System.out.println();

		userService.updateUserName(user1, "Eri");
		userService.updateUserSurname(user1, "Abedini");
		userService.updateUserUsername(user1, "eri@gmail.com");
		userService.updateUser(user1, "Edison", "Peshtani", "soni@gmail.com");

		userService.approveStatus(spid1, user1);
		userService.updateDescription(spid1, "text..");
		userService.showAllSpids(spidArrayList);
		userService.connectedTo(spidArrayList);
		System.out.println(userService.searchUserSpid(spidArrayList, user1));
	}
}
