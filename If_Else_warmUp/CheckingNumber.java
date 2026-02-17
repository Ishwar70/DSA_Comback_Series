import java.util.*;
class CheckingNumber {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    if(num>0){
        System.err.println("Number is +ve");
    }
    else if(num<0){
        System.err.println("Number -ve ");
    }
    else{
        System.err.println("Number is Zero");
    }
}
}
