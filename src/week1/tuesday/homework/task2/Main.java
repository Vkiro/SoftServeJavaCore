package week1.tuesday.homework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String name;
        int age;
        String address;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        name = reader.readLine();
        System.out.println("Where are you live, " + name + "?");
        address = reader.readLine();
        System.out.println(name + " live in " + address);

    }
}
