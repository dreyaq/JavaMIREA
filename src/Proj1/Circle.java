package Proj1;

public class Circle {
    private Point point;
    private int r;

    public Circle(int x, int y, int r) {
        this.point = new Point (x,y);
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public int getR() {
        return r;
    }

    public void setPoint(int x, int y) {
        this.point = new Point(x,y);
    }

    public void setR(int r) {
        this.r = r;
    }
    public double area(){
        return Math.PI*r*r;
    }
    public double length(){
        return 2*Math.PI*r;
    }
    public String match(Circle circle){
        if (this.r>circle.r)  return "Основной круг больше";
        else{
            if (this.r==circle.r) return "Круги одинаковые";
            else return "Сравниваемый круг больше";}
    }
}
