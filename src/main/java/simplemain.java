

import static java.util.Collections.list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class simplemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String id,type,make,time,colour,door,vol,size;
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime enter= LocalDateTime.now();
         
        
                
        int count=0,sele;
        Scanner myobj=new Scanner(System.in);
        
         westminstercarparkmanager w=new westminstercarparkmanager();
         Car c=new Car();Van v=new Van(); Motorbike m=new Motorbike();
         
          ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>(); 
          
                
        
        while(true){
             ArrayList<String> arr=new ArrayList<String>(); 
        System.out.println("which type vehcile are you input");
        System.out.println("[1]-car [2]-van [3]-motorbike");
        System.out.println("[4]-Parked vehicles"+"[5]-NO OF Free lots");
        System.out.println("[6]-Delete vehicle if its leave fro parks");
        System.out.println("[7]-display first and last");
        if(w.listsize()>3){
             System.out.println("***THERE ARE NO FREE LOTS***");
         }
         sele = myobj.nextInt();
         
        switch(sele){
               
            case 1:
           
         System.out.println("enter brand");make=myobj.nextLine();              
              arr.add(0,make);//0  
             
          System.out.println("enter id");  id=myobj.nextLine();
             arr.add(1,id);//1  
         
        System.out.println("enter colour"); colour =myobj.nextLine();        
         arr.add(2,colour);//2
        System.out.println("enter doors");  door=myobj.nextLine();
        arr.add(3,door);//3
         type="Car";    time=enter.format(dtf);
        arr.add(4,type);//4
        arr.add(5,time); //5     
        
        w.getdetail(arr.get(4),arr.get(1),arr.get(5));
        c.getdetail(arr.get(1),arr.get(2),arr.get(5),arr.get(2),arr.get(3));
       // list.add(arr);
        
       // System.out.println(list.get(0).get(4));
                break;
            case 2:
             System.out.println("enter brand");make=myobj.nextLine();              
              arr.add(0,make);//0  
             System.out.println("enter id");  id=myobj.nextLine();
             arr.add(1,id);//1
             System.out.println("enter cargo volume"); vol=myobj.nextLine();
             arr.add(2,vol);//2
             type="Van";//3
             arr.add(3,type);             
             time=enter.format(dtf);//4
             arr.add(4,time);
             list.add(arr);
             w.getdetail(arr.get(3),arr.get(1),arr.get(4));
             v.getdetail(arr.get(1),arr.get(0),arr.get(4),arr.get(2));
                break;
            case 3:
            System.out.println("enter brand");make=myobj.nextLine();              
              arr.add(0,make);//0  
             System.out.println("enter id");  id=myobj.nextLine();
             arr.add(1,id);//1
             System.out.println("enter engine size:");size=myobj.nextLine();
             arr.add(2,size);
             type="Motorbike";//3
             arr.add(3,type);             
             time=enter.format(dtf);//5
             arr.add(4,time);
             
             w.getdetail(arr.get(3),arr.get(1),arr.get(4));
             m.getdetail(arr.get(1),arr.get(0),arr.get(4),arr.get(2));
                break;
            
                
            case 4:
                w.parkeddis();
                System.out.println("      ***STATISTICS***     ");
            int noc=c.carsize(); int nom=m.bikesize();int nov=v.vansize();
            float per1= (float) (noc*100)/(noc+nov+nom);
            float per2= (float) (nom*100)/(noc+nov+nom);
            float per3= (float) (nov*100)/(noc+nov+nom);
            
            System.out.println("Cars %="+per1);
            System.out.println("Motorbikes %="+per2);
            System.out.println("Vans %="+per3);
                break;
            case 5:
                System.out.println(20-w.listsize());
                break;
            case 6:
                Scanner input=new Scanner(System.in);
                System.out.println("Enter id plate");
                String plate=input.nextLine();
                w.delete(plate);
                
                break;
            case 7:   
                w.fl();
                break;
             case 9:
           return ; 
           
           
        }
             
             
        
        
        }  
           
    }}
    
    
    

