
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Motorbike  extends Vehicle{
    String id,make,td,size;
      
    LinkedList<ArrayList<String>> bike=new LinkedList<ArrayList<String>>(); 
    
    public void getdetail(String id,String make,String td,String size){
        ArrayList<String> a=new ArrayList<String>(); 
         a.add("ID:"+id);a.add("Make:"+make);a.add("time and data:"+td);a.add("enfine size:"+size);
         bike.add(a);
    }
    public int bikesize(){
        int n=bike.size();
        return n;
    }
    public void delete(String plate){
        int i,j;
        for(i=0;i<=bike.size();i++){          
        if(bike.get(i).get(0).contains(plate)){
             bike.remove(i);
        }}
             for( j=i;j<bike.size();j++) {       
            bike.set(j,bike.get(j+1));}
 }
        
        
    

    @Override
    public String ID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Brand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String time() {
        return td;
    }
    

    


}





































