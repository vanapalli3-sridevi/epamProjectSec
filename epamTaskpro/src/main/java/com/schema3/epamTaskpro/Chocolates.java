package com.schema3.epamTaskpro;

abstract class Chocolates{
	   public int quantity;
	   public int calories;
	   abstract int getquantity();
	   abstract String getname();
	   Chocolates(int quantity,int calories){
	       this.quantity=quantity;
	       this.calories=calories;
	   }
	  
	}