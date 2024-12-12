// By normal main function approach .

import java.util.*;
public class Function{
    public static void main(String[] args){
        System.out.println("Enter two number a and b");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int n = sc.nextInt();
      
      if(n==1){
          System.out.println("addition of two number"+(a+b));
      }
      else if(n==2){
          System.out.println("subtraction of two number"+(b-a));
      }
      else if(n==3){
          System.out.println("multiplication of two numbers"+(a*b));
      }
      else if(n==4){
          System.out.println("division of two numbers"+(a/b));
      }
      else{
          System.out.println(-1);
      }
    }
    
}


// by creating a dedicated function 

import java.util.*;
public class Function{
    
    public static int calculateName(int a , int b ,int n ){
        
             if(n==1){
           return a+b ;
      }
      else if(n==2){
          return b-a;
      }
      else if(n==3){
          return a*b;
      }
      else if(n==4){
          return a/b;
      }
      else{
          return -1;
      }
        
        
    }
    public static void main(String[] args){
        System.out.println("Enter two number a and b");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int n = sc.nextInt();
      
      int result = calculateName( a,b,n);
      System.out.println (result);
    }
    
}
