/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.System.exit;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
/**
 *
 * @author USER
 */
public class westminstercarparkmanager implements carparkmanager{
    String type,id,td;
  
   LinkedList<LinkedList<String>> list=new LinkedList<LinkedList<String>>(); 
   
    public void getdetail(String type,String id,String td){
         LinkedList<String> arr=new LinkedList<String>();
        this.type=type;type="type:"+type;
        arr.add(0,type);
        this.id=id;id="id:"+id;  arr.add(1,id);
        this.td=td; td="entry time date:"+td; arr.add(2,td);
        
         list.add(arr);
    }
    public int listsize(){
        return list.size();
    }
    
    public void parkeddis(){
            for(int i=list.size()-1;i>=0;i--)
            System.out.println(list.get(i)); 
            
    }
    public void delete(String plate){
        String s;int i,j;
     for( i=0;i<list.size();i++){ 
         
        if(list.get(i).get(1).contains(plate)){
                s=list.get(i).get(0); 
        
            switch (s) {
            case "Car":
                Car c=new Car();
                c.delete(plate);
                break;
            case "Van":
                Van v=new Van();
                v.delete(plate);
                break;
            case "Motorbike":
                Motorbike m=new Motorbike();            
                m.delete(plate);
                break;            
        }            
                list.remove(i);
        for(j=i;j<list.size()-1;j++) {       
            list.set(j,list.get(j+1));}
        System.out.println("leaved vehicle "+s);
        break;
       }
     }
    }
       
    /**
     *
     */
    public void fl(){
        
        System.out.println("First:- "+list.getFirst());
        System.out.println("last :- "+list.getLast());
    }
    public void type() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void td() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
 
}
