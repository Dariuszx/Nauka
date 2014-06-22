package FlyWeight;


class Picture implements GraphicObject { // ConcreteFlyweight2

    String fileName;
    int width,height;

    public Picture( String fileName, int width, int height ) {

        this.fileName= fileName;
        this.width = width;
        this.height = height;
    }

    public void printAtPosition(int x, int y) {

        System.out.printf( "Printing '%s' scaled to %dx%d at position %d:%d.\n", fileName, width, height, x, y );

    }
}