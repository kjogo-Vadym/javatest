public class logincheck {
    public  static void main(String args[]) {
        String expected = "Login Successfull";
        String actual = "Login NotSuccessfull";
        if (expected.equals(actual)) {
            System.out.println("Тест пройдено");
        } else {
            System.out.println("Тест не пройдено");
        }
    }
}