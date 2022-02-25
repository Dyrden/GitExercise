package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("it works!");
        Main main = new Main();
        //main.greet();
        main.askAboutAge();

    }

    public void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("indtast navn : ");
        String navn = sc.nextLine();
        System.out.println(" " + navn);
    }

    public void askAboutAge() {
        Scanner sc = new Scanner(System.in);
        System.out.print("indtast din alder: ");
        System.out.println("din alder er " + sc.nextLine());
    }
}
