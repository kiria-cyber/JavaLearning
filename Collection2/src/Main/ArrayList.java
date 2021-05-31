package Main;

public class ArrayList {
    private static String[] array = new String[10];
    private static int size = 0;

    public void add(String s) {
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
                ;
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index < size || index > 0) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            size--;
        } else {
            System.out.println("Index isn't correct");
        }
    }
    public void showArray(){
               for (int i = 0; i<size; i++){
                   System.out.println(array[i]);
               }
    }

    public static int getSize() {
        return size;
    }

    public static String[] getArray() {
        return array;
    }

    public String get(int index) {
        if (index < size || index > 0) {

            return array[index];
        } else {
            return "Record don't found";
        }

    }
}
