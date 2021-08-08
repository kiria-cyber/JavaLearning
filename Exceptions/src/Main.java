public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b =7/a;
        } catch (ArithmeticException e1){
            System.out.println("На ноль делить нельзя");
        }catch (Exception e){

        } finally {
            System.out.println("Мы в блоке finally");
        }

        System.out.println("Hi");
    }


}
