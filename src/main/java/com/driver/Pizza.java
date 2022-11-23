package com.driver;

import org.jetbrains.annotations.NotNull;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean isDeluxe = false;

    private int cheesePrice = 0;
    private int toppingPrice = 0;
    private int addTakeaway = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isDeluxe = false;

        if(isVeg) this.price = 300;
        else this.price = 400;
    }
    public Pizza(Boolean isVeg, Boolean Deluxe){
        this.isVeg = isVeg;
        this.isDeluxe = Deluxe;

        if(isVeg) this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isDeluxe)
            this.cheesePrice = 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isDeluxe && cheesePrice > 0) {
            if (isVeg) this.toppingPrice = 70;
            else this.toppingPrice = 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.addTakeaway = 20;
    }

    public String getBill(){
        // your code goes here
        String ans = "Base Price Of The Pizza: "+price+"\n";
        if(cheesePrice > 0) ans += "Extra Cheese Added: "+cheesePrice+"\n";
        if(toppingPrice > 0) ans += "Extra Toppings Added: "+toppingPrice+"\n";
        if(addTakeaway > 0) ans += "Paperbag Added: "+addTakeaway+"\n";
        ans += "Total Price: "+(price+cheesePrice+toppingPrice+addTakeaway)+"\n";
        return ans;
    }
}
