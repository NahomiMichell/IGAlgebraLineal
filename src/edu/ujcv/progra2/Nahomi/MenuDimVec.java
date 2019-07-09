package edu.ujcv.progra2.Nahomi;

import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class MenuDimVec {
    LectorDeTecladoValidado NM = LectorDeTecladoValidado.getInstance();
    public int opcion;

    public void mostrarOpcionR2() {
        System.out.println("\t Vectores en dos dimensiones ");
        System.out.println("\n 1. Suma");
        System.out.println("\n 2. Resta");
        System.out.println("\n 3. Multiplicacion por un escalar");
        System.out.println("\n 4. Producto Punto");
        System.out.println("\n 5. Magnitud");
        System.out.println("\n 6. Angulo");
    }

    public int LeeropcionR2() {
        opcion = NM.getInteger("Ingrese una opción", "Intente de nuevo");
        return opcion;
    }

    public int operandoR2(int opcion) {
        switch (opcion) {
            case 1:
                IGVecR2 A1 = LeerVectorR2()

        }

    }

   public IGVecR2 LeerVectorR2 (String nombreVec, String mensaje, String mensajeError) {
       IGVecR2 A = new IGVecR2(1.0, 1.1);

       A.setX(NM.getDouble("Ingrese el primer vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));
       A.setY(NM.getDouble("Ingrese el segundo vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar "));

       return new IGVecR2(A);
   }
   public IGVecR3 LeerVectorR3 (String nombreVec, String mensaje, String mensajeError){
      IGVecR3 A = new IGVecR3(1.0, 1.1, 0.3);

      A.setX(NM.getDouble("Ingrese el primer vector", "El caracter que ingreso no es válido. Por Favor vueleva a intentar"));
      A.setY(NM.getDouble("Ingrese el segundo vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));
      A.setZ(NM.getDouble("Ingrese el tercer vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar "));

      return new IGVecR3(A);
       }
    public IGVecR4 LeerVectorR4 (String nombreVec, String mensaje, String mesajeError){
        IGVecR4 A = new IGVecR4(1.0, 1.1, 0.3, );
    }

}

