public class Methods {
    private String[] array = new String[10];
    private int size = 0;


    public String showArray() {
        String s = "";
        size=array.length;
        for (int i = 0; i < size - 1; i++) {
            s = s +", "+ array[i];
        }
        return s;
    }
    public void showArray(String arrayName[]) {
        String string = "";
        for (int i = 0; i < arrayName.length - 1; i++) {
            string = string + " " + arrayName[i];
        }
        System.out.println(string);
    }




}
