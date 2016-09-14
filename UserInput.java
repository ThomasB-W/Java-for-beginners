package userinput;

import java.util.Scanner;
        
public class UserInput {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("How old are you?");
        String age = sc.nextLine();
        System.out.println("What is your username?");
        String user = sc.nextLine();
        System.out.println("What is your student ID?");
        String id = sc.nextLine();
        System.out.println("What is your GDA?");
        String gda = sc.nextLine();
        System.out.println("What is your predicted grade?");
        String grade = sc.nextLine();
        System.out.println("Your name is: "+name);
        System.out.println("You are: "+age);
        System.out.println("Your username is: "+user);
        System.out.println("Your student ID is:"+id);
        System.out.println("Your GDA is:"+gda);
        System.out.println("Your predicted grade is:"+grade);
        
        
        
        
}
}
