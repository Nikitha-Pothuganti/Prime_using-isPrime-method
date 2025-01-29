import java.util.*;
public class Prime{
  public static boolean isPrime(int number){
    int x = 0;
    for(int i=1; i <= number; i++){
      if(number % i == 0){
        x++;
      }
    }
    if(x>2){
      return false;
    }else{
      return true;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);{
    Prime obj = new Prime();
    int num = sc.nextInt();
    boolean result = isPrime(num);
    if(result == true){
      System.out.println(result+" (since "+ num +" is a prime number)");
    }else{
      System.out.println(result+" (since "+ num +" is not a prime number)");
    }
    sc.close();
    }
  }
}
