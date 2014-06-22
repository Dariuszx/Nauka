package FlyWeight;


class GraphicChar implements GraphicObject { // ConcreteFlyweight1

    char c;
    String fontFace;

    public GraphicChar( char c, String fontFace ) {
        this.c = c;
        this.fontFace = fontFace;
    }


    public void printAtPosition( int x, int y ) {

        System.out.printf( "Printing '%c' in '%s' at position %d:%d.\n", c, fontFace, x, y );
    }

}
