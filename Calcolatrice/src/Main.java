public class Main {
    public static void main(String[] args) {
        double valUno = 10;
        double valDue = 3;
        char oper = '*';

        System.out.println(isEven(10));
    }

    public static boolean isEven(int x){
        boolean pari = (x % 2 == 0);
        return pari;
    }
    
}