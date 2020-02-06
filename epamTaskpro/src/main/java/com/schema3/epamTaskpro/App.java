package com.schema3.epamTaskpro;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.io.*;







public class App 
{
    public static void main( String[] args )
    {
        Gift []gifts=new Gift[6];
        gifts[0]=new Wrafferchocolate(5,500,300);
        gifts[1]=new Nutchocolate(3,700,500);
        gifts[2]=new Cocochocolate(6,800,200);
        gifts[3]=new Candy(10,600,600);
        gifts[4]=new Rasamalai(5,1500,400);
        gifts[5]=new Rasagulla(4,2500,100);


  for(int i=0;i<6;i++){
     if(gifts[i] instanceof Chocolates){
         if(gifts[i] instanceof Wrafferchocolate){
             Wrafferchocolate w=(Wrafferchocolate) gifts[i];
             w.name();
         }
         else if(gifts[i] instanceof Nutchocolate){
             Nutchocolate n=(Nutchocolate) gifts[i];
             n.name();
         }
         else if(gifts[i] instanceof Cocochocolate){
             Cocochocolate co=(Cocochocolate) gifts[i];
             co.name();
         }
         else{            
         Candy c=(Candy) gifts[i];
             c.name();
         }
     }
     else{
         if(gifts[i] instanceof Rasamalai){
            Rasamalai r=(Rasamalai) gifts[i];
             r.name();
         }
         else{
             Rasagulla r2=(Rasagulla) gifts[i];
             r2.name();
         }
       

     }
  }
  ArrayList<Chocolates> arr =new ArrayList<Chocolates>();
  for(int i=0;i<6;i++) {
      if(gifts[i] instanceof Chocolates) {
          Chocolates c=(Chocolates)gifts[i];
          arr.add(c);
      }
  }
  Collections.sort(arr,new Comparator<Chocolates>() {
        @Override
        public int compare(Chocolates  a, Chocolates b) {
            return (a.quantity)-(b.quantity);
        }
    });
  int weight=0;
  int c1=0,c2=0;
  for(int i=0;i<6;i++) {
      weight+=gifts[i].getweight();
  }
  System.out.println("Weight of the gift received by children: "+weight);
  for(int i=0;i<6;i++) {
      if(gifts[i].getweight()<400)
            c1++;
      else
          c2++;
  }
  System.out.println("Items having weight lessthen 400: "+c1);
  System.out.println("Items having weight greatethen 400: "+c2);
  System.out.println("Chocolates after sorted by quantity:");
  for(int i=0;i<arr.size();i++) {
      System.out.println(arr.get(i).getname()+""+arr.get(i).getquantity());
  }
    }
}
