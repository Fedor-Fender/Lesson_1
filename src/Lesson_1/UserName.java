package Lesson_1;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert user_name");
        String user_name = sc.next();
        System.out.println("You get user_name " + user_name);
    }
}
