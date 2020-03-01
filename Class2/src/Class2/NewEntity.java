package Class2;

public class NewEntity{

    public static void main(String[] args) 
    {
        
      //System.out.println("Whoorayyyyyyy!! this our secound class!!");
    
  
    Addition add = new Addition();
    Addition add2 = new Addition();
    int sum = add.add(5, 6);
        System.out.println("Sum = "+sum);
     sum = add2.add(8, 6);
        System.out.println("Sum = "+sum);
        
         Mul mul = new Mul();
         Mul mul2 = new Mul();
    
    int ml = mul.mul(5,8);
        System.out.println("Mul = "+ml);
     ml = mul2.mul(8, 6);
        System.out.println("Mul = "+ml);
    }
        
}
    
            
            
            
            