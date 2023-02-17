/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bailab;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    public static void menu(){
        while(true){
            System.out.print("\n\n\n0.Thoat");
            System.out.print("\n1.Giai phuong trinh bac nhat ax+b=0");
            System.out.print("\n2.Giai phuong trinh bac hai ax^2+bx+c=0");
            System.out.print("\n3.Tinh tien dien");
            System.out.print("\n4.Menu bang switch-case");
            
            int luachon;
            System.out.print("\nNhap lua chon: ");
            Scanner scanner = new Scanner(System.in);
            luachon=scanner.nextInt();
            if(luachon==0)
            {
                break;
            } else if(luachon==1)
            {
                GiaiPTBac1();
            } else if(luachon==2)
            {
                GiaiPTBac2();
            } else if(luachon==3)
            {
                TinhTienDien();
                        
            } else if(luachon==4)
            {
                menuSwitchCase();
            }
            
        }
    }
    public static void GiaiPTBac1(){
      float a,b;
      System.out.print("nhap he so a: ");
      Scanner scanner = new Scanner(System.in);
      a=scanner.nextFloat();
      System.out.print("nhap he so b: ");
      b=scanner.nextFloat();
      if(a==0){
          if(b==0){
              System.out.println("Phuong trinh co vo so nghiem");
          } else{
              System.out.println("Phuong trinh vo nghiem");
          }
      } else{
          System.out.println("Nghiem cua phuong trinh la: "+(-b/a));
      }
          
    }
    public static void GiaiPTBac2(){
      float a,b,c;
      System.out.print("nhap he so a: ");
      Scanner scanner = new Scanner(System.in);
      a=scanner.nextFloat();
      System.out.print("nhap he so b: ");
      b=scanner.nextFloat();
      System.out.print("nhap he so c: ");
      c=scanner.nextFloat();
      if(a==0){
          GiaiPTBac1();
      } else{
          double delta = (b*b)-(4*a*c);
          if(delta<0){
              System.out.println("Phuong trinh vo nghiem");
          } else if(delta==0){
              System.out.println("Phuong tring co nghiem kep: "+((-b)/(2*a)));
          } else {
              System.out.println("Phuong trinh co 2 nghiem phan biet x1="+((-b+Math.sqrt(delta))/(2*a))+"x2="+((-b-Math.sqrt(delta))/(2*a)));
          }
          
      }
          
    }
    public static void TinhTienDien(){
      float a;
      do{
                System.out.print("nhap so dien da su dung: ");
                Scanner scanner = new Scanner(System.in);
                a=scanner.nextFloat();
                if(a <0){
                    System.out.print("so khong hop le !! vui long nhap lai ");
                }
        }while(a <0);
      
      if(a<=50){
          System.out.println("tien dien can tra la: "+a*1000);
      } else {
          System.out.println("tien dien can tra la: "+((50*1000)+(a-50)*1200));
      }
          
    }
    public static void menuSwitchCase(){
            System.out.print("\n\n\n0.Thoat");
            System.out.print("\n1.Giai phuong trinh bac nhat ax+b=0");
            System.out.print("\n2.Giai phuong trinh bac hai ax^2+bx+c=0");
            System.out.print("\n3.Tinh tien dien");
            
            int luachon;
            System.out.print("\nNhap lua chon: ");
            Scanner scanner = new Scanner(System.in);
            luachon=scanner.nextInt();
            switch (luachon) {
            case 0:
                
                break;
            case 1:
                GiaiPTBac1();
                break;
            case 2:
                GiaiPTBac2();
                break;
             case 3:
                TinhTienDien();
                break;
            default:
                System.out.println("vui long nhap lua chon 1->3");
        }
     
            
            
        
    }
    
}
