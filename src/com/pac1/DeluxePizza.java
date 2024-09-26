package com.pac1;

public class DeluxePizza extends Pizza
{

	public DeluxePizza(Boolean veg) 
	{
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
	}

	@Override
	public void addExtraCheese() {
		
		//super.addExtraCheese();
	}

	@Override
	public void addExtraToppings() {
		// TODO Auto-generated method stub
		//super.addExtraToppings();
	}

}
