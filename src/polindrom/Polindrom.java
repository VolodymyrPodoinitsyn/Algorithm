package polindrom;

public class Polindrom {
    public  static boolean isPolindrom(String word){
        boolean result = false;
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length/2; i++){
            if (array[i] != array[array.length - 1 - i]){
                result = false;
                return result;
            }
        }
        result = true;
        return result;

    }
}
