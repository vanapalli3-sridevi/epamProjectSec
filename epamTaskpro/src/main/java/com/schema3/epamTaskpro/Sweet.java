package com.schema3.epamTaskpro;


abstract class Sweet{
   public int quantity;
   public int calories;
   abstract int getquantity();
   abstract String getname();
  Sweet(int quantity,int calories){
       this.quantity=quantity;
       this.calories=calories;
   }
   //abstract name();
}
