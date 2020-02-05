package com.schema3.epamTaskpro;

class Rasamalai extends Sweet implements Gift{
    Rasamalai(int quantity,int calories){
    super(quantity,calories);
    }
    public void name(){
        System.out.println("Rasamalai is gifed");
    }
    public int getquantity(){
        return quantity;
    }
    public String getname(){
        return "Rasamalai";
   }
}
