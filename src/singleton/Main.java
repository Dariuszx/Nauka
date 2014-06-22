package singleton;


public class Main {

    public static void main( String[] args ) {

        Gracz gracz1 = Gracz.getInstance("marazmad");
        Gracz gracz2 = Gracz.getInstance("dybkad  ");
        Gracz gracz3 = Gracz.getInstance("dariuszx");
        Gracz gracz4 = Gracz.getInstance("hacker");



        System.out.println( gracz1.getPseudonim() );
        System.out.println( gracz2.getPseudonim() );
        System.out.println( gracz3.getPseudonim() );
        System.out.println( gracz4.getPseudonim() );
    }

}
