package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;

public class IGMatR2 {

    //double x1,y1;
    //double x2,y2;

    // double[][] m;

    IGVecR2 f1;
    IGVecR2 f2;

    IGVecR2 col1;
    IGVecR2 col2;

    public IGMatR2 (){
       col1 = new IGVecR2(1,0);
       col2 = new IGVecR2(0,1);
    }

    public IGMatR2( IGVecR2 col1, IGVecR2 col2){
      this.col1 = new IGVecR2(col1);
      this.col2 = new IGVecR2(col2);
    }

    public IGMatR2 (IGMatR2 b){
        this.col1 = new IGVecR2(b.col1);
        this.col2 = new IGVecR2(b.col2);
    }

    public IGMatR2 suma (IGMatR2 b){
        IGMatR2 retval = new IGMatR2();
        retval.setCol1 (this.col1.suma(b.col1));
        retval.setCol2 (this.col2.suma(b.col2));
         return retval;
    }

    public IGMatR2 resta (IGMatR2 b){
        IGMatR2 retval = new IGMatR2();
        retval.setCol1(this.col1.resta(b.col1));
        retval.setCol2(this.col2.resta(b.col2));
        return retval;
    }

  // public IGMatR2 mul(IGMatR2 b){
  // }

 //public IGVecR2 colXMat(IGVecR2 col){}


  // public IGMatR2 escalarXmat(double escalar){}

 // public static IGVecR2 rotacion (double angulo, IGVecR2 vector){}


    public IGVecR2 getCol1() {
        return col1;
    }

    public void setCol1 (IGVecR2 col1){
        this.col1 = col1;
   }

    public IGVecR2 getCol2() {
        return col2;
    }

    public void setCol2(IGVecR2 col2) {
        this.col2 = col2;
    }
}
