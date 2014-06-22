package FlyWeight;

import java.util.ArrayList;
import java.util.HashMap;

class GraphicObjectFactory {

    HashMap<String, GraphicObject> pool = new HashMap<String, GraphicObject>();


    public int getNum() {
        return pool.size();
    }

    public String toString() {

        return "coś tam";
    }

    public GraphicObject get( Character c, String fontFace ) {

            GraphicObject go;
            String key = "C: " + c.toString() + "@" + fontFace;

            if ((go = pool.get(key)) == null) {
                go = new GraphicChar(c, fontFace);
                pool.put(key, go );
            }
            return go;
    }

    public GraphicObject get( String fileName, int width, int height ) {

        GraphicObject go;
        String key = "P: " + fileName + "@" + width + "x" + height;
        if ((go = pool.get(key)) == null) {
            go = new Picture(fileName,width,height);
            pool.put(key, go );
        }
        return go;

    }
}


public class Main {

    public static void main( String[] args ) {

        GraphicObjectFactory gof = new GraphicObjectFactory();
        ArrayList<GraphicObject> document = new ArrayList<GraphicObject>();

        document.add( gof.get("smile.jpg", 100, 100) );
        document.add( gof.get(' ', "Times") );

        int x=0, y=0;
        for (GraphicObject c : document) {
            c.printAtPosition( x++, y);
        }
    }
}
