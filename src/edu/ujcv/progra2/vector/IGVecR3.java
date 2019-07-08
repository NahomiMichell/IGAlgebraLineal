package edu.ujcv.progra2.vector;

public class IGVecR3 {

    double x;
    double y;
    double z;

    public IGVecR3 (){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public IGVecR3 (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public IGVecR3 (IGVecR3 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
    }

    public IGVecR3 suma(IGVecR3 b){
        IGVecR3 retval = new IGVecR3();
        retval.x = (x + b.x);
        retval.y = (y + b.y);
        retval.z = (z + b.z);
        return retval;
    }

    public IGVecR3 resta(IGVecR3 b){
        IGVecR3 retval = new IGVecR3();
        retval.x = (x - b.x);
        retval.y = (y - b.y);
        retval.z = (z - b.z);
        return retval;
    }

    //producto.
    public  IGVecR3 escalarPorVector(double alpha){
        IGVecR3 retval = new IGVecR3();
        retval.x = (alpha * x);
        retval.y = (alpha * y);
        retval.z = (alpha * z);
        return retval;
    }

    public double productoPunto(IGVecR3 b){
        double retval;
        retval = (x * b.x) + (y * b.y) + (z * b.z);
        return retval;
    }


    public IGVecR3 productoCruz(IGVecR3 b){
        IGVecR3 retval = new IGVecR3();
         retval.x = ((y * b.z) - (z * b.y));
         retval.y =((x * b.z) - (z * b.x));
         retval.z = ((x * b.y)-(y - b.x));
        return retval;
    }


    public double magnitud(IGVecR3 b){

        return Math.sqrt((Math.pow(b.x,2)+ Math.pow(b.y,2)+ Math.pow(b.z,2)));
    }

    public double angulo(IGVecR3 a, IGVecR3 b){
        double retval;
        retval = Math.cos(a.productoPunto(b)/(magnitud(a)* magnitud(b)));
        return Math.toDegrees(retval);
    }

    public double getX (){
        return x;
    }

    public void setX (double x){
        this.x = x;
    }

    public double getY (){
        return y;
    }

    public void setY (double y){
        this.y = y;
    }

    public double getZ (){
        return z;
    }

    public void setZ (double z) {
        this.z = z;
    }
}
