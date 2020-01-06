/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String id,type,make,time,colour,door;
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime enter= LocalDateTime.now();
        ArrayList<String> arr;
        arr = new ArrayList<String>();
        int count=0,sele;
        Scanner myobj=new Scanner(System.in);
        if(count<21)
            count++;
        System.out.println("which type vehcile are you input");
        System.out.println("[1]-car [2]-van [3]-motorbike");
         sele = myobj.nextInt();
        switch(sele){
            case 1:
         System.out.println("enter id");  id=myobj.nextLine();
             arr.add(id);    
         System.out.println("enter brand");make=myobj.nextLine();              
              arr.add(make);           
        System.out.println("enter colour"); colour =myobj.nextLine();        
         arr.add(colour);
        System.out.println("enter doors");  door=myobj.nextLine();
         arr.add(door);
         type="Car";    time=enter.format(dtf);
         arr.add(type); arr.add(time);         
         
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
    
}
