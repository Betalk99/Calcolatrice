public class Main {
    public static void main(String[] args) {
        double valUno = 3;
        double valDue = 1;
        char oper = '/';
        double base = 10;
        double espon = 3;

        whatOper(valUno, valDue, oper);

        System.out.println(isEven(10));

        calcPotenza(base, espon);
    }

    public static boolean isEven(int x){
        boolean pari = (x % 2 == 0);
        return pari;
    }
  
    public static void whatOper(double x, double y, char oper){
        if (oper == '+'){
            System.out.println(sum(x,y));
        }else if(oper == '-'){
            System.out.println(sottrazione(x,y));
        }else if(oper == '*'){
            System.out.println(multi(x,y));
        }else if(oper == '/'){
            divisione(x,y);
        }
    }
    public static double sum(double x,double y){
        return x+y;
    }
    public static double sottrazione(double x,double y){
        return x-y;
    }

    public static double multi(double x, double y){
        return x*y; //risultato moltiplicazione
    }
    public static void divisione(double x, double y){
        System.out.println("Quoziente: " + x / y); //quoziente
        System.out.println("Resto: " +  x % y); //resto
    }

    public static void calcPotenza(double base, double espon){
        double result = base;
        for(int i=1; i<espon; i++){
            //System.out.println(result);
            result = result * base;
        }

        System.out.println("Il risultato della potenza è: " + result);
    }


}