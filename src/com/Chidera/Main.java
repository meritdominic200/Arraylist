package com.Chidera;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList =  new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int chioce = 0;
        printinstruction();
        while(!quit){
            System.out.println("enter the chioce: ");
            chioce = scanner.nextInt();
            scanner.nextLine();
            switch (chioce){
                case 0:
                    printinstruction();
                    break;
                case 1:
                    groceryList.printGroceryItem();
                    break;
                case 2:
                    additem();
                    break;
                case 3:
                    modifyitem();
                    break;
                case 4:
                    removeitem();
                    break;
                case 5:
                    Searchforitem();
                case 6:
                    quit = true;
                    break;


            }

        }
    }
    public static void printinstruction(){
        System.out.println("\n press");
        System.out.println("\t 0 - to print chioce options");
        System.out.println("\t 1 - to print list of grocery item ");
        System.out.println("\t 2 - to add an item  to the list");
        System.out.println("\t 3 - to modify the item list ");
        System.out.println("\t 4 - to remove item from the list");
        System.out.println("\t 5 - to search for item from  the list");
        System.out.println("\t 6 - to quit the application");

    }
    public static void additem(){
        System.out.print("please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
public static void modifyitem(){
    System.out.print("please enter item : ");
    String itemNo = scanner.nextLine();
    System.out.print("enter the replacement item: ");
    String newItem = scanner.nextLine();
    groceryList.modifyGroceryItem(itemNo,newItem);
}
public static void removeitem(){
    System.out.print("please enter the item : ");
    String itemNo = scanner.nextLine();
    groceryList.removeItem(itemNo);

}
public static void Searchforitem(){
    System.out.print("item to search for ");
    String searchItem = scanner.nextLine();
    if (groceryList.onFile(searchItem)) {
        System.out.println("found " + searchItem + " in the grocery list");
    } else{
            System.out.println( searchItem + "item not found in the list ");

        }

    }
}


