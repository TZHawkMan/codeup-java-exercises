package shapes;


public class Square extends Rectangle {


    public Square(double side) {
        super(side, side);
    }

    public double getArea(){
        System.out.println("Square Method used");
        double side = this.width;
        return side * side;
    }

    public double getPerimeter(){
        System.out.println("Square Method used");
        double side = this.width;
        return side * 4;
    }


}