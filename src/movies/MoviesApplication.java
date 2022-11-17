package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args){
        System.out.println("0 - Exit");
        System.out.println("1 - View all movies");
        System.out.println("2 - View movies by drama category");
        System.out.println("3 - View movies by comedy category");
        System.out.println("4 - View movies by horror category");
        System.out.println("5 - View movies by scifi category");
        System.out.println("6 - View movies by musical category");
        System.out.println("What would you like to do? Enter your choice by number: ");

        Input x = new Input();
        int userInput = x.getInt();

        if(userInput == 1) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                System.out.println("Name: " + MoviesArray.findAll()[i].getName() +
                        ", Category: " + MoviesArray.findAll()[i].getCategory());
            }
        }else if(userInput == 2){
                for (int i = 0; i < MoviesArray.findAll().length; i++){
                    if(MoviesArray.findAll()[i].getCategory().equals("drama")) {
                        System.out.println("Name: " + MoviesArray.findAll()[i].getName() +
                                ", Category: " + MoviesArray.findAll()[i].getCategory());
                    }
                }

            }else if(userInput == 3) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (MoviesArray.findAll()[i].getCategory().equals("comedy")) {
                    System.out.println("Name: " + MoviesArray.findAll()[i].getName() +
                            ", Category: " + MoviesArray.findAll()[i].getCategory());
                    }
                }
            }
        else if(userInput == 4) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (MoviesArray.findAll()[i].getCategory().equals("horror")) {
                    System.out.println("Name: " + MoviesArray.findAll()[i].getName() +
                            ", Category: " + MoviesArray.findAll()[i].getCategory());
                }
            }
        }
        else if(userInput == 5) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (MoviesArray.findAll()[i].getCategory().equals("scifi")) {
                    System.out.println("Name: " + MoviesArray.findAll()[i].getName() +
                            ", Category: " + MoviesArray.findAll()[i].getCategory());
                }
            }
        }
        else if(userInput == 6) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (MoviesArray.findAll()[i].getCategory().equals("musical")) {
                    System.out.println("Name: " + MoviesArray.findAll()[i].getName() +
                            ", Category: " + MoviesArray.findAll()[i].getCategory());
                }
            }
        }else {
            System.out.println("Thank you for your visit. See you again!");
        }
    }

}

