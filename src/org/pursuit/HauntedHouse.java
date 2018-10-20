package org.pursuit;

import java.util.Scanner;

public class HauntedHouse {
//made a class named Instructions


    public HauntedHouse() {

    }


    public static void startGame() {
//made a method named Instructions where I give the instructions, and ask them to INPUT the location they'd like to go to.



       // String direction1[] ={ "kitchen", "Backyard", "Bedroom", "Basement"};

        System.out.println("Welcome to the Haunted House!  Please enter L, R, D, U and press enter to choose the direction in which you will go");
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.nextLine();
        direction = direction.toUpperCase();

        String location = direction;


        System.out.println("You chose: " + direction);
        char firstLetter;
        firstLetter = direction.charAt(0);

            do {
                System.out.println("Invalid entry, Please try again");
                scanner.nextLine();

            } while ((firstLetter != 'L') || (firstLetter != 'R') || (firstLetter != 'U') || (firstLetter != 'D'));


            switch (direction) {
                case "L":
                    location = "Kitchen";
                    break;
                case "R":
                    location = "Backyard";
                    break;
                case "U":
                    location = "Bedroom";
                    break;
                case "D":
                    location = "Basement";
                    break;
                default:
                    System.out.println("Invalid entry, Please try again");
                    break;
            }


        System.out.println("You have entered the " + location);

        if (location.equals("Kitchen")) {
            System.out.println("In the kitchen, you come face to face with an evil clown! Your only option is to pick up a weapon and swing! \n" +
                    "Which weapon will you choose? A sword, a hammer, a lamp or a book?");
        } else if (location.equals("Backyard")) {
            System.out.println("In the Backyard you face a Giant spider! \n" +
                    "Which weapon will you choose? A sword, a hammer, a lamp or a book?");
        } else if (location.equals("Bedroom")) {
            System.out.println("In the Bedroom.........\n" +
                    "Which weapon will you choose? A sword, a hammer, a lamp or a book?");
        } else if (location.equals("Basement")) {
            System.out.println("In the Basement.....\n" +
                    "Which weapon will you choose? A sword, a hammer, a lamp or a book?");
        }




    }


    public static String weapons() {

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String weapons = scanner.nextLine();

        switch (weapons) {
            case "sword":
                System.out.println("A sword, good choice!  No evil will win with this weapon in hand! ");
                break;
            case "hammer":
                System.out.println("You hit the monster with the Axe and blood splatters everywhere");
                break;
            case "lamp":
                System.out.println("You chose the lamp?!  A genie comes out, and you wish yourself out of this mess! Automatic win!");
                break;
            case "book":
                System.out.println("Seriously!? A book?  This is not what your parents meant when they said pick up a book! Game over!");
                break;
            default:
                System.out.println("None of those in sight, game over!");
        }
        return weapons;

        }
    }


