package edu.eci.cvds.patterns.shapes;

public class ShapeFactory() {
    public static Shape create(RegularShapeType type){
        Shape s = null;
        switch (type) {
            case Triangle:{
                s = new Triangle();
                break;
            }
            case Quadrilateral:{
                s = new Quadrilateral();
                break;
            }
            case Hexagon:{
                s = new Hexagon();
                break;
            }
            case Pentagon:{
                s = new Pentagon();
                break;
            }

            default:
                break;
        }
        return s;
}

