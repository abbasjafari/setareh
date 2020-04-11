/**
 * Created by star on 4/9/2020.
 */
public class Operation {
    public static void main(String[] args) {
        int i= 10;
        int j= 2;
        Operation.add(i,j);
        Operation.zarb(i,j);
        Operation.taghsim(i,j);
        Operation.mines(i,j);

    }
    public static void add(int i,int j){

        int k= i+j;
        System.out.println("add i and j = "+k);

    }
    public static void  zarb(int i, int j){

        int s= i*j;
        System.out.println("zarb i and j =" +s);
    }
    public static void taghsim(int i,int j){
        int a =i/j;
        System.out.println("taghsim i bar j=" +a);
        System.out.println("abbas");

    }
    public static void mines (int i, int j){
        int b = i-j;
        System.out.println("mines i az j="+b);
    }
}
