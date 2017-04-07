package Electricity;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;
public class ElectricityBill {

    public void getdetail()  {
        Scanner input = new Scanner(System.in);
        int bill1 = 0;
        int bill2 = 0;
        int bill3 = 0;
        System.out.print("Enter the Initial unit : ");
        int initialReading;
        initialReading = input.nextInt();
        System.out.print("Enter the final Reading : ");
        int finalReading;
        finalReading = input.nextInt();
        int unitCount = finalReading - initialReading;
        
        
        System.out.print("\nTotal reading of this month is : "+unitCount);
        if(unitCount>1000&&unitCount<100000){
            bill3 = unitCount-1000;
            unitCount=1000;
            bill3 = bill3*10;
            System.out.print("\nBill for this month is for range 1000-10000 : "+bill3);
        }
        if(unitCount>500&&unitCount<=1000){
            bill2 = unitCount-500;
            bill2 = bill2*5;
            unitCount=500;
            System.out.print("\nBill for this month for range 500-1000is : "+bill2);
        }
        if(unitCount>100&&unitCount<=500){
            bill1 = unitCount-100;
            bill1 = bill1*2;
            unitCount = 100;
            System.out.print("\nBill for this month for range 100-500 is : "+bill1);
        }
        if(unitCount>0&&unitCount<=100)
            System.out.printf("\nNo bill for range of 0-100");   
        int bill = bill3+bill2+bill1;
        String s = "\n\n\nTotal bill is  : "+bill;
        String s1 = "\nBill for this month is for range 1000-10000 : "+bill3;
        String s2 = "\nBill for this month for range 500-1000is : "+bill2;
        String s3 = "\nBill for this month for range 100-500 is : "+bill1;
        String s4 = "\nNo bill for range of 0-100";
        try{ FileOutputStream ftr = new FileOutputStream("D:/work/Bill.txt"); 
            byte b1[] = s1.getBytes();
            byte b2[] = s2.getBytes();
            byte b3[] = s3.getBytes();
            byte b4[] = s4.getBytes();
            byte b5[] = s.getBytes();
            ftr.write(b1);
            ftr.write(b2);
            ftr.write(b3);
            ftr.write(b4);
            ftr.write(b5);
            ftr.close();
        }catch(Exception e){System.out.println(e);}
        System.out.print("\n\nSuccess");
        
    }
    
}
