package Groceries;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroceryListApplication {

    public static void createItem(ArrayList<Grocery> groceryList){
        List<String> categories = Arrays.asList("dairy", "meat", "produce", "fruit", "beverages", "prepared foods");
        Input input = new Input();
        System.out.println("Categories:");
        for (int i = 0; i < categories.size(); i++){
            if (i == categories.size() -1) {
                System.out.println(categories.get(i));
            } else {
                System.out.print(categories.get(i) + ", ");
            }
        }// end for loop through categories list
        System.out.println("Choose a category: ");
        String categoryChoice = input.getString();
        System.out.println("Enter the name of the item: ");
        String nameOfItem = input.getString();
        System.out.println("Enter the quantity:");
        String quantity = String.valueOf(input.getInt());
        Grocery grocery = new Grocery(Integer.parseInt(quantity), nameOfItem, categoryChoice);
        groceryList.add(grocery);
        System.out.println(groceryList);
    }
    public static void outputList(ArrayList<Grocery> groceryList){
        System.out.println("Your list:");
        for (Grocery grocery: groceryList){
            System.out.println("Category: " + grocery.getCategory());
            System.out.println("Item: " + grocery.getName());
            System.out.println("Quantity: " + grocery.getQuantity());
            System.out.println("");
        } // end loop through grocery list
    }



    public static ArrayList<Grocery> sortGroceriesByName(ArrayList<Grocery> groceryList){
        ArrayList<Grocery> alphabetizedList = new ArrayList<>();
        ArrayList<String> listOfItems = new ArrayList<>();
        for (Grocery grocery: groceryList){
            listOfItems.add(grocery.getName());
        }
        Collections.sort(listOfItems);
        for (String name: listOfItems){
            for(Grocery grocery: groceryList){
                if (grocery.getName().equals(name)){
                    alphabetizedList.add(grocery);
                }
            }
        }
        return alphabetizedList;
    }


    public static void main(String[] args) {
        ArrayList<Grocery> groceryList = new ArrayList<>();
        Input input = new Input();
        System.out.println("Would you like to create a grocery list? (yes/no)");
        String userChoice = input.getString();
        if (userChoice.equals("yes")){
            while(true){
                createItem(groceryList);
                System.out.println("Would you like to enter another item? (yes/no)");
                String chooseToContinue = input.getString();
                if (chooseToContinue.equals("no")){
                    break;
                }
            }
        } // if user says "yes" and wants to create grocery list
        outputList(sortGroceriesByName(groceryList));
    } // end main method
}
