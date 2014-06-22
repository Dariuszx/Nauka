package singleton;

import java.util.ArrayList;

public final class Gracz {

    private static ArrayList<Gracz> listaGraczy = new ArrayList<Gracz>( 3 );
    private static int liczbaZarejestrowanychGraczy = 0;

    private String pseudonim;
    private int liczbaPunktow;

    private Gracz(String pseudonim) {

        this.pseudonim = pseudonim;
        this.liczbaPunktow = 0;

    }

    public static Gracz getInstance( String pseudonim ) {

        Gracz newInstance = null;

        if( isCreated( pseudonim ) ) {

            for( Gracz s : listaGraczy )
                if( s.getPseudonim().equals( pseudonim ) )
                    return s;
        }

        if( liczbaZarejestrowanychGraczy < 3 ) {
            liczbaZarejestrowanychGraczy++;
            newInstance = new Gracz(pseudonim);
            listaGraczy.add(newInstance);
        }

        return newInstance;
    }

    private static boolean isCreated( String pseudonim ) {

        for ( int i=0; i < listaGraczy.size(); i++ ) {

            if ( listaGraczy.get( i ).getPseudonim().equals( pseudonim ) ) {
                return true;
            }
        }
        return false;
    }

    public int getLiczbaPunktow() { return liczbaPunktow; }

    public String getPseudonim() { return pseudonim; }

    public void setLiczbaPunktow( int l ) { liczbaPunktow = l; }


}
