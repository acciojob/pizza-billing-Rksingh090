package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice = 0;
    private int toppingPrice = 0;
    private int addTakeaway = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) this.price = 300;
        else this.price = 400;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.cheesePrice = 80;

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) this.toppingPrice = 70;
        else this.toppingPrice = 120;
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
        ans += "Total Price: "+(price+cheesePrice+toppingPrice+addTakeaway);
        return ans;
    }
}
