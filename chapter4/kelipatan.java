public class kelipatan {
    public static void main(String[] args) {
       int i = 0;
       int result = 0;
       while(i < 1000){
          if(i%3 == 0 || i%5 == 0){
            result += i;
          }
          i++;
       }    
       System.out.println("Jumlah Kelipatan 3 Atau 5 Adalah : " + result);
    }
}