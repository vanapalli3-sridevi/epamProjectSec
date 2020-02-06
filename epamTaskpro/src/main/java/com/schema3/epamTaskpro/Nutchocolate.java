package com.schema3.epamTaskpro;

class Nutchocolate extends Chocolates implements Gift{
    Nutchocolate(int quantity,int calories,int wei){
    super(quantity,calories,wei);
}
    public void name(){
        System.out.println("Nutchocolate is gifed");
    }
    public int getquantity(){
        return quantity;
    }
    public String getname(){
        return "NutChocolate";
   }
    public int getweight(){
        return wei;
    }
}