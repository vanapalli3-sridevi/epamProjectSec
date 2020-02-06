package com.schema3.epamTaskpro;
class Wrafferchocolate extends Chocolates implements Gift{
    Wrafferchocolate(int quantity,int calories,int wei){
    super(quantity,calories,wei);
    }
    public void name(){
        System.out.println("Wrafferchocolate is gifed");
    }
    public int getquantity(){
        return quantity;
    }
    public String getname(){
        return "Wrafferchocolate";
   }
    public int getweight(){
        return wei;
    }
}