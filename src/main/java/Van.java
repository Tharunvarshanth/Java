/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author USER
 */
public class Van extends Vehicle {
    String id,make,td,volume;
     
    LinkedList<ArrayList<String>> van=new LinkedList<ArrayList<String>>(); 
   
    public void getdetail(String id,String make,String td,String volume ){
        ArrayList<String> a=new ArrayList<String>();  
        a.add("ID:"+id);a.add("Make:"+make);a.add("time and data:"+td);a.add("Cargo volume :"+volume);
        
        van.add(a);
    }
    public int vansize(){
        int n=van.size();
        return n;}
    
    public void delete(String plate){
       int i,j;
        for(i=0;i<=van.size();i++){          
        if(van.get(i).get(0).contains(plate)){
             van.remove(i);}}
        
             for(j=i;j<van.size();j++) {       
            van.set(j,van.get(j+1));}
        }
        
    
       
        
        
    
    @Override
    public String ID() {
      return id;
    }

    @Override
    public String Brand() {
        return make;
    }
    
    
    public String vol(){
        return volume;
    }

    @Override
    public String time() {
        return td;
    }
    
     







}