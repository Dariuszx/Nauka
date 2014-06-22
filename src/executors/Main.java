package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Dane {

    public String nazwa;
    public int wartosc;

    public Dane( String n, int w ) {
        nazwa = n;
        wartosc = w;
    }

    public synchronized int zwieksz( ) {

        return ++wartosc;
    }

    public static void a() {
        System.out.println( "asd" );
    }
}


class Watek implements Runnable {

    private Dane dane;



    public Watek( Dane d ) {
        dane = d;
    }

    @Override
    public void run() {

        for( int i=0; i < 10; i++ ) {

            try {
                Thread.sleep( 500 );

                System.out.println(Thread.currentThread().getName() + " zwiekszam do " + dane.zwieksz() );

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}




public class Main {

    public static void main( String[] args ) {

        Dane dane = new Dane( "Nazwa", 0 );


        ExecutorService exe = Executors.newSingleThreadExecutor();


        exe.execute( new Watek( dane ));
        exe.execute( new Watek( dane ));


    }
}
