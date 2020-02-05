package com.schema3.epamTaskpro;

class Rasagulla extends Sweet implements Gift{
    Rasagulla(int quantity,int calories){
    super(quantity,calories);
    }
    public void name(){
        System.out.println("Rasagulla is gifed");
    }
    public int getquantity(){
        return quantity;
    }
    public String getname(){
        return "Rasagulla";
   }
}
