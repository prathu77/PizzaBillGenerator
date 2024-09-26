package com.pac1;

public class Pizza 
{
  private int price;
  private Boolean veg;
  private int ExtraCheesePrice=100;
  private int ExtraToppingsPrice=150;
  private int backpack=20;
  private int basePizzaPrice;
  private boolean isExtraCheeseAdded=false;
  private boolean isExtraToopingsAdded=false;
  private boolean isOptedTakeaway=false;
  
  public Pizza(Boolean veg)
  {
	  this.veg=veg;
	  if(this.veg)
	  {
		  this.price=300;
	  }
	  
	  else
	  {
		  this.price=400;
	  }
	  basePizzaPrice=this.price;
	  
  }
   public void addExtraCheese()
  {
	   isExtraCheeseAdded=true;
	  //System.out.println("Extra cheese added succefully");
	  this.price+= ExtraCheesePrice;
  }
  
  public void addExtraToppings() 
  {
	  
	isExtraToopingsAdded=true;
	//System.out.println("Extra Toppings are added");
	this.price +=ExtraToppingsPrice;
  }
  
  public void takeAway()
  {
	  isOptedTakeaway=true;
	  //System.out.println(" Take away optd");
	  this.price+=backpack;
  }
  public void getBill()
  {   
	  String Bill=" ";
	  System.out.println(this.price);
	  System.out.println("Pizza" + basePizzaPrice);
	  if(isExtraCheeseAdded)
	  {
		  Bill+="extra cheese added "+ExtraCheesePrice + "\n";
	  }
	  if(isExtraToopingsAdded)
	  {
		  Bill+="Extra Toppings Added" + ExtraToppingsPrice + "\n";
	  }
	  if(isOptedTakeaway)
	  {
		  Bill+="Take away" + backpack + "\n";
	  }
	  Bill+="Bill :" +this.price+"\n";
	  System.out.println(Bill);
  }

  public static void main(String[] args) 
  {
	//Pizza basePizza=new Pizza(false);
	//basePizza.addExtraCheese();
	//basePizza.addExtraToppings();
	//basePizza.takeAway();
	//basePizza.getBill();
	//basePizza.getPizzaPrice();
	  
	  DeluxePizza dp=new DeluxePizza(true);
	  dp.addExtraCheese();
	  dp.addExtraToppings();
	  dp.getBill();
  }
}