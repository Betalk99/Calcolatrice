public class Main {
    public static void main(String[] args) {
        double valUno = 10;
        double valDue = 3;
        char oper = '*';


        whatOper(valUno, valDue, oper);

        System.out.println(isEven(10));
    }

    public static boolean isEven(int x){
        boolean pari = (x % 2 == 0);
        return pari;
    }
  
    public static void whatOper(double x, double y, char oper){
        if (oper == '+'){
            sum(x,y);
        }else if(oper == '-'){
            sottrazione(x,y);
        }else if(oper == '*'){

        }else if(oper == '/'){

        }
    }
    public static double sum(double x,double y){
        return x+y;
    }
    public static double sottrazione(double x,double y){
        return x-y;
    }

    

}