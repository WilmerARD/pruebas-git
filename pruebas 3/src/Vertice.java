
class Vertice {

    public double x;
    public double y;

    //Constructores
    public Vertice(double xVal, double yVal) {
        this.x = xVal;
        this.y = yVal;
    }

    public Vertice(Vertice v) {
        this.x = v.x;
        this.y = v.y;
    }

    //Metodos get
    public double getX() {
        return this.x;
    }

    public double getY() {
        return -this.y;
    }

    //Metodos set
    public void setX(int xVal) {
        this.x = xVal;
    }

    public void setY(int yVal) {
        this.y = yVal;
    }

    public void setPosicion(int xVal, int yVal) {
        x = xVal;
        y = yVal;
    }

}
