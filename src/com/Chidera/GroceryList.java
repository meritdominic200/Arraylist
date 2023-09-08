package com.Chidera;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }


    public void printGroceryItem() {
        System.out.println("you have" + groceryList.size() + "item in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((1 + i) + "." + groceryList.get(i));
        }


    }

    public void modifyGroceryItem(String currentItem,String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("grocery item " + position + 1 + "has been modified");


    }
    public void removeItem (String Item) {
        int position = findItem(Item);
        if (position >= 0) {
            removeItem(position);
        }
    }
    private void removeItem(int position) {
        //String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);

    }
    public boolean onFile (String searchItem){
        int position = findItem(searchItem);
        if (position>=0){
            return true;

        }
            return false;
    }
}