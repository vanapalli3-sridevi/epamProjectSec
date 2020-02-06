package com.schema3.epamTaskpro;

class Rasamalai extends Sweet implements Gift{
    Rasamalai(int quantity,int calories,int wei){
    super(quantity,calories,wei);
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
    public int getweight(){
        return wei;
    }
}
