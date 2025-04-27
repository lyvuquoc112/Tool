/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hanly
 */
public class Inputter {
    private Scanner sc;
    
    public Inputter(){
        this.sc= new Scanner(System.in);
    }
   
    
    public String inputString(String mess){
        System.out.println(mess);
        return this.sc.nextLine();
    }
    
     public int inputInt(String mess){
         while(true){
             try{
                String dl = inputString(mess);
                return Integer.parseInt(dl);
             }catch(NumberFormatException e){
                 System.out.println("Invalid input");
             }
         }
    }
     
     public float inputFloat(String mess){
         while(true){
         try{
            String dl = inputString(mess);
            return Float.parseFloat(dl);
         }catch (NumberFormatException e){
             System.out.println("Invalid input");
         }
        }    
     }
     
     public double inputDouble(String mess){
         while(true){
             try{
                String dl = inputString(mess);
                return Double.parseDouble(dl);
             }catch(NumberFormatException e){
                 System.out.println("Invalid input");
             }
         }
     }
     public boolean inputBoolean(String mess){
         while(true){
             String dl = inputString(mess);
             if(dl.toLowerCase().equals("0"))
                 return true;
             else if(dl.toLowerCase().equals("1"))
                 return false;
             else   
                 System.out.println("Không hợp lệ");
         }
     }
     // phuong thuc cho phep nhap du lieu duoi dang ngay thang nam
     public Date inputDate(String mess){
         
         while(true){
         Date result = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         String cn = inputString(mess);
        
        try {
            result = sdf.parse(cn);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in dd/MM/yyyy format.");        }
         return result;
         }
     }
}
