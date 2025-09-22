public class linen_number {

    // Метод лінійного пошуку
    public static int linearSearch(int[] array, int target) {
       for( int i = 0; i < array.length; i++ ) {
       if( array [i] == target ) {
       return i;
       }
    }
       return -1;
    }
    public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int target = 23;
    int index = linearSearch ( numbers, target );
    if( index != -1 ) {
    System.out.println( "Символ найден на индексе: " + index );
    } else {
        System.out.println( "Элемент не найден" ) ; }
    }
    }

