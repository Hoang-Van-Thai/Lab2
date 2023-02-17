/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]=new int[100];
        menu( arr);
    }
    public static void menu( int arr[]){
        while(true){
            System.out.print("\n\n\n0.Thoat");
            System.out.print("\n1.Kiem tra so chinh phuong");
            System.out.print("\n2.Kiem tra xep loai");
            System.out.print("\n3.Doc so gom 3 chu so");
            System.out.print("\n4.Tinh n giai thua");
            System.out.print("\n5.Xoa phan tu = x trong mag so nguyen");
            
            int luachon;
            System.out.print("\nNhap lua chon: ");
            Scanner scanner = new Scanner(System.in);
            luachon=scanner.nextInt();
            if(luachon==0)
            {
                break;
            } else if(luachon==1)
            {
                kt_so_CP();
            } else if(luachon==2)
            {
                XepLoai();
            } else if(luachon==3)
            {
                Doc();
            } else if(luachon==4)
            {
                TinhGiaiThua();
            } else if(luachon==5)
            {
                int n=NhapLenght();
                NhapMang(n, arr);
                XuatMang(n, arr);
                int x;
                System.out.print("\nnhap vao so can xoa trong mang: ");
                x =scanner.nextInt();
                for(int i=0;i<n;i++){
                    if(x==arr[i]){
                        for(int j=i;j<n;j++){
                            arr[j]=arr[j+1];
                        }  
                        n--;
                        i--;
                    }
                }
                System.out.print("\nMang sau khi xoa\n ");
                XuatMang(n, arr);
            }
            
        }
    }
    public static void kt_so_CP(){
      System.out.print("Nhap so nguyen duong can kiem tra: ");
      Scanner scanner = new Scanner(System.in);
      double n =scanner.nextFloat();
      double tam=Math.sqrt(n);
      if((tam*tam)==n){
          System.out.print("\n"+n+" la so chinh phuong");
      }else {
          System.out.print("\n"+n+" khong phai so chinh phuong");
      }
          
    }
    public static void XepLoai(){
      int diem;
      do{
          System.out.print("Nhap so diem: ");
          Scanner scanner = new Scanner(System.in);
          diem =scanner.nextInt();
          if(diem >10 || diem<0){
               System.out.print("diem khong hop le!!! vui long nhap lai ");
          }
      }while(diem >10 || diem<0);
      if(diem<5 && diem >=0){
          System.out.print("\nKem");
      }else if(diem>=5 && diem<7){
          System.out.print("\nTrung binh");
      }else if(diem>=7 && diem<8){
          System.out.print("\nKha");
      }else if(diem>=8 ){
              
          System.out.print("\nGioi");
      }         
    }
    static public void Doc(){
        int so;
        int i=0;
        do{
                System.out.print("Nhap so gom 3 chu so: ");
                Scanner scanner = new Scanner(System.in);
                so =scanner.nextInt();
                if(so>=1000 || so <=100){
                    System.out.print("so khong hop le !! vui long nhap lai ");
                }
        }while(so>=1000 || so <=100);
        String[] arr = { "khong","mot","hai","ba","bon","nam","sau","bay","tam","chin" };
        String[] arr1={"","","",};
        while(so!=0){
            int a = so%10;
            arr1[i]=arr[a];
            so/=10;
            i++;
        }
         if((arr1[1] == "mot" )&& (arr1[0] == "khong") ){
            System.out.print(arr1[2]+" tram muoi ");
        } else if(arr1[1] == "mot"){
            System.out.print(arr1[2]+" tram muoi "+arr1[0]);
        } else if(arr1[1] == "khong" && arr1[0] == "khong" ){
            System.out.print(arr1[2]+" tram");
        } else if(arr1[1] == "khong" ){
            System.out.print(arr1[2]+" tram le "+arr1[0]);
        } else if(arr1[0] == "khong" ){
            System.out.print(arr1[2]+" tram "+arr1[1]+" muoi ");
        } else{
            System.out.print(arr1[2]+" tram "+arr1[1]+" muoi "+arr1[0]);
        }
    }
    static public void TinhGiaiThua(){
        int n;
        int s=1;
        do{
                System.out.print("Nhap vao so nguyen duong n: ");
                Scanner scanner = new Scanner(System.in);
                n =scanner.nextInt();
                if(n <0){
                    System.out.print("so khong hop le !! vui long nhap lai ");
                }
        }while(n <0);
        for(int i=1;i<=n;i++){
            s=s*i;
        }
        System.out.print(n+"!= "+s);
    }
    static public int NhapLenght(){
        int n;
        do{
                System.out.print("nhap do dai cua mang: ");
                Scanner scanner = new Scanner(System.in);
                n =scanner.nextInt();
                if(n <0){
                    System.out.print("so khong hop le !! vui long nhap lai ");
                }
        }while(n <0);
        return n;
        
    }
    static public void NhapMang(int n,int arr[]){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+(i)+"]=");
            arr[i] =scanner.nextInt();
        }
    } 
    static public void XuatMang(int n,int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static public void MTDoiXung(){
        int n;
        do{
                System.out.print("nhap do dai cua mang: ");
                Scanner scanner = new Scanner(System.in);
                n =scanner.nextInt();
                if(n <0){
                    System.out.print("so khong hop le !! vui long nhap lai ");
                }
        }while(n <0);
    }    
        
    
    
}
                  

      
      
      

