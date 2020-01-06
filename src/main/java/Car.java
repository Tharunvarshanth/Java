/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
/**
 *
 * @author USER
 */
public class Car extends Vehicle  {
String id,make,td,colour;
String door;   
  
LinkedList<LinkedList<String>> car=new LinkedList<LinkedList<String>>(); 
    
   
    public void getdetail(String id,String make,String td,String colour,String door){
        LinkedList<String> a=new LinkedList<String>(); 
   a.add(0,"ID:"+id);a.add(1,"Make:"+make);a.add(2,"data and time:"+td);
   a.add(3,"Colour:"+colour);a.add(4,"Door:"+door);      
      
   car.add(a);        
    }
    
    public void delete(String plate){
        int i,j;
        for(i=0;i<car.size();i++){          
        if( car.get(i).get(0).contains(plate)){
            car.remove(i);}}
        
           for(j=i;j<car.size()-1;j++) {
              car.set(j,car.get(j+1));}
           System.out.println(car.size());
        
}       
    public int carsize(){
        int n=car.size();
        return n;
    }
@Override
    public String ID() {
        
        return id;
    }

    @Override
    public String Brand() {
        return make;
    }  
   

    @Override
    public String time() {
        return td;
    }

    

    
    
    
}
