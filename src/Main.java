public class Main {
    public static void main(String[] args) {
        String name = "Vadym";
        int age = 19;
        double height = 1.86;
        boolean IsStudent = false;
        System.out.println( "Name : " + name );
        System.out.println( "Age : " + age );
        System.out.println( "Height : " + height );
        System.out.println( "Is Student: " + IsStudent );
        Calculator calculator = new Calculator();
        calculator.add(4, 10);
        System.out.println("Сума: " + calculator.add(4, 10));
    }
    }
