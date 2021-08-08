public class ArrayExempion {
    public static void main(String[] args) {
        int[] intArray3 = new int[]{1, 5, 7, 8, 9, 4, 7, 15, 74};
       try{
           System.out.println(intArray3[intArray3.length]);
       }catch (IndexOutOfBoundsException e){
           System.out.println("Выход за пределы массива");
       }
    }


}
