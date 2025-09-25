// public class try_catch {
   // public static void main(String[] args) {
   //     try {int x = 10 / 0;
     //   } catch (Exception e){
       //     System.out.println("На нуль ділити не можна " + e.getMessage());
        //}

   // }
//}


public class try_catch {
    public static void equal(int a, int b) {
        try {
            int result = a / b;
            System.out.println("результат " + result);
        } catch  (ArithmeticException e) {
            System.out.println("На нуль ділить не можна");
        }
    }
public  static void main(String[] args){
        equal(24, 3);
        equal(21, 0);
    }
}

