package Mathematics;

public class modularInverse {
    public static void main(String[] args) {
        System.out.println(modInverse(3, 11));
    }
    static int modInverse(int a, int m)
    {
      for(int i = 1 ; i < m ; i++){
          int c = (i*a)%m;
          if(c == 1){
              return i;
          }
      }
      return -1;
    }
}
