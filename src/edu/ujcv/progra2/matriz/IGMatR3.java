package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR3;

public class IGMatR3 {

    private IGVecR3 colx;
    private IGVecR3 coly;
    private IGVecR3 colz;

    private IGVecR3 filx;
    private IGVecR3 fily;
    private IGVecR3 filz;

    public IGMatR3 (){
        colx = new IGVecR3(1,0,0);
        coly = new IGVecR3(0,1,0);
        colz = new IGVecR3(0,0,1);
    }

    public IGMatR3(IGVecR3 colx, IGVecR3 coly, IGVecR3 colz){
      this.colx = new IGVecR3(colx);
      this.coly = new IGVecR3(coly);
      this.colz = new IGVecR3(colz);
    }

    public IGMatR3 (IGMatR3 b){
        this.colx = new IGVecR3(b.colx);
        this.coly = new IGVecR3(b.coly);
        this.colz = new IGVecR3(b.colz);
    }


    // public static IGVecR2 rotacionZ (double angulo, IGVecR2 vector){
//
//    }

    // public static IGVecR2 rotacionX (double angulo, IGVecR2 vector){
//
//    }

    // public static IGVecR2 rotacionY (double angulo, IGVecR2 vector){
//
//    }

}
