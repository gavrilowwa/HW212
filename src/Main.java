public class Main {
    public static void main (String[] args){
       long count = 100;
       long income = 1200;

       if(income>1000) {
           count = count+income+(income/100);
       }
       else {
           count=count+income;
       }

        System.out.println(count);
    }
}
