package com.schema3.epamTaskpro;


abstract class Sweet{
   public int quantity;
   public int calories;
   public int wei;
   abstract int getquantity();
   abstract int getweight();
   abstract String getname();
  Sweet(int quantity,int calories,int wei){
       this.quantity=quantity;
       this.calories=calories;
       this.wei=wei;
   }
   //abstract name();
}
