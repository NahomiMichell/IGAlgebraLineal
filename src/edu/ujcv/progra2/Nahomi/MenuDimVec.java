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
        opcion = NM.getInteger("Ingrese una opción", "Ingreso una opción no valida. Intente de nuevo");
        return opcion;
    }

    public int operandoR2(int opcion) {
        switch (opcion) {
            case 1:

                IGVecR2 A1 = LeerVectorR2("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 B1 = LeerVectorR2("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar" );
                IGVecR2 Nahomi1 = A1.suma(B1);

                System.out.println("La suma de vectores es: \n");
                imprimirIGVecR2 (Nahomi1);
                break;

            case 2:
                IGVecR2 A2 = LeerVectorR2( "Vector 1","Ingrese el vector 1","El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 B2 = LeerVectorR2("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 Nahomi2 = A2.resta(B2);

                System.out.println("La resta de vectores es; \n");
                imprimirIGVecR2(Nahomi2);
                break;

            case 3:
                double alpha = 0;
                alpha = NM.getDouble("Ingrese el valor del escalar", "El caracter que ingreso NO es válido. Por Favor vuelva a intentar");
                IGVecR2 A3 = LeerVectorR2("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 Nahomi3 = A3.escalarPorVector(alpha);

                System.out.println("La multiplicación por un escalar es: \n");
                imprimirIGVecR2(Nahomi3);
                break;

            case 4:
                IGVecR2 A4 = LeerVectorR2("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 B4 = LeerVectorR2("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double Nahomi4 = A4.productoPunto(B4);

                System.out.println("El restultado del producto punto es: " + Nahomi4);
                break;

            case 5:
                IGVecR2 A5 = LeerVectorR2("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 B5 = LeerVectorR2("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double Nahomi5 = A5.magnitud(B5);

                System.out.println("El resultado de la magnitud vectorial es: " + Nahomi5);
                break;

            case 6:
                IGVecR2 A6 = LeerVectorR2("Vector 1","Ingrese el vector 1","El caracter que ingreso NO es válido. Por favor vuelva a intentar" );
                IGVecR2 B6 = LeerVectorR2("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double Nahomi6 = A6.angulo(A6,B6);

                System.out.println("El angulo entre dos vectores es: " + Nahomi6);
                break;


        }

    }

   public IGVecR2 LeerVectorR2 (String nombreVec, String mensaje, String mensajeError) {
       IGVecR2 A = new IGVecR2(1.0, 1.1);

       A.setX(NM.getDouble("Ingrese el primer vector", "El caracter que ingreso no es válido. Por favor vuelva a intentar"));
       A.setY(NM.getDouble("Ingrese el segundo vector", "El caracter que ingreso no es válido. Por favor vuelva a intentar "));

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
        IGVecR4 A = new IGVecR4 (1.0, 1.1, 0.3, 0.5);

        A.setX(NM.getDouble("Ingrese el primer vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));
        A.setY(NM.getDouble("Ingrese el segundo vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));
        A.setZ(NM.getDouble("Ingrese el tercer vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));
        A.setW(NM.getDouble("Ingrese el cuarto vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));

        return new IGVecR4(A);
    }

    public void imprimirIGVecR2 (IGVecR2 a){
        System.out.println("(" + a.getX() +","+ a.getY()+ ")");
    }

    public void imprimirIGVecR3(IGVecR3 a){

        System.out.println("(" + a.getX() +","+ a.getY() +","+ a.getZ()+")");
    }

    public void imprimirVecR4 (IGVecR4 a){
        System.out.println("(" + a.getX() +","+ a.getY() +","+ a.getZ() +","+ a.getW()+")");
    }

}

