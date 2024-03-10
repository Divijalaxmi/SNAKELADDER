package player;

import java.util.Scanner;

public class Player {
    String name;
    String emailId;
    String contactNumber;
    String address;
    int age;

    public void setPlayerDetails(String name, String emailId, String contactNumber, String address, int age){
        this.name = name;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.address = address;
        this.age = age;
    }

    public void setPlayerName(String name){
        this.name = name;
    }

    public void getPlayerDetails(){
        System.out.println("Player name: " + this.name);
        System.out.println("Player emailId: " + this.emailId);
        System.out.println("Player contactNumber: " + this.contactNumber);
        System.out.println("Player Address: " + this.address);
        System.out.println("Player age: " + this.age);
    }

    public String getPlayerName(){
        return this.name;
    }

    public void setPlayerDetailsFromUserInput(Player p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player Details");
        System.out.println("Enter player name");
        String name = sc.nextLine();
        System.out.println("Enter player contactNumber");
        String contactNumber = sc.nextLine();
        System.out.println("Enter emailId");
        String emailId = sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        System.out.println("Enter player age");
        int age = sc.nextInt();

        p.setPlayerDetails(name,emailId, contactNumber, address, age);
    }
        
}
