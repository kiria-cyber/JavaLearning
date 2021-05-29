public class Homework {
    public static void main(String[] args) {
        int [] FirstArray = new int [11];
        for (int i =0;i<FirstArray.length; i++)
        {
            FirstArray[i]=i*100;
        }
        for (int i:FirstArray)
        {
            System.out.println(i);
        }

        int [] SecondArray = new int [FirstArray.length];
        for (int i =0,j = FirstArray.length-1; i<SecondArray.length; i++, j--)
        {
            SecondArray[i] = FirstArray[j];
        }
        for (int i:SecondArray)
        {
            System.out.println(i);
        }
    }
}
