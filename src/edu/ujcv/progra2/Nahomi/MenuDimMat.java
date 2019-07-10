package edu.ujcv.progra2.Nahomi;

import edu.ujcv.progra2.matriz.IGMatR2;
import edu.ujcv.progra2.matriz.IGMatR3;
import edu.ujcv.progra2.matriz.IGMatR4;
import edu.ujcv.progra2.vector.IGVecR4;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class MenuDimMat {
    public int opcion;
    LectorDeTecladoValidado NM = LectorDeTecladoValidado.getInstance();

    public void mostrarOpcionesR2 (){
        System.out.println("Matrices de orden 2");
        System.out.println("\n 1. suma");
        System.out.println("\n 2. resta");
        System.out.println("\n 3. Multiplicación");
        System.out.println("\n 4. Multiplicación por vector");
        System.out.println("\n 5. Multiplicación por escalar");
        System.out.println("\n 6. Rotación");
        System.out.println("\n 7. Regresar");

    }

    public int leerOpcionR2 (){
        opcion = NM.getInteger("Ingrese una opcion", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
        return opcion;
    }
    public int operandoMatR2 (int opcion){
        switch (opcion){

            case 1:
                IGMatR2 mat1 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "EL caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGMatR2 mat2 = leerMatR2("Matriz 2", "Ingrese la matriz 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGMatR2 Naho1 = mat1.suma(mat2);

                System.out.println("La suma de matrices es:");
                imprimirMatR2(Naho1);
                break;

            case 2:
                IGMatR2 mat3 = leerMatR2("Matriz 1", "Ingrese la matriz 1","El caracter que ingreso NO es válido. Por favor intente de nuevo");
                IGMatR2 mat4 = leerMatR2("Matriz 2", "Ingrese la matriz 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                 IGMatR2 Naho2 = mat3.resta(mat4);

                System.out.println("la resta de marices es: ");
                imprimirMatR2(Naho2);
                break;

                case 3:
                    IGMatR2 mat6 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                    IGMatR2 mat7 = leerMatR2("Matriz 2", "Ingrese la matriz 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                    break;
            case 4:
                double alpha = 0;
                alpha = NM.getDouble("Ingrese el escalar", "El caracter que ingreso NO es valido. Por favor vuelva a intentar");
                IGMatR2 mat8 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGMatR2 Naho3 = mat8.escalarXmat(alpha);

                System.out.println("La multiplicacion por un escalar es: ");
                imprimirMatR2(Naho3);
                break;

        }
        return opcion;
    }
    public IGMatR2 leerMatR2(String nombreMatriz, String mensaje, String mensajeError) {
        IGVecR2 col1 = new IGVecR2(1, 0);
        IGVecR2 col2 = new IGVecR2(0, 1);
        System.out.println(nombreMatriz);
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (i == 1 && j == 1)
                    col1.setX(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 2)
                    col2.setX(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 1)
                    col1.setY(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 2)
                    col2.setY(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
            }
        }
        return new IGMatR2(col1,col2);
    }

    public IGMatR3 leerMatR3 (String nombreMatriz, String mensaje, String mensajeError) {
        IGVecR3 col1 = new IGVecR3(1,0,0);
        IGVecR3 col2 = new IGVecR3(0, 1,0);
        IGVecR3 col3 = new IGVecR3(0,0,1);
        System.out.println(nombreMatriz);
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i == 1 && j == 1)
                    col1.setX(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 2)
                    col2.setX(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 3)
                    col3.setX(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 1)
                    col1.setY(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 2)
                    col2.setY(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 3)
                    col3.setY(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 1)
                    col1.setZ(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 2)
                    col2.setZ(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 3)
                    col3.setZ(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
            }
        }
        return new IGMatR3(col1,col2,col3);
    }

    public IGMatR4 leerMatR4(String nombreMatriz, String mensaje, String mensajeError) {
        IGVecR4 col1 = new IGVecR4(1,0,0,0);
        IGVecR4 col2 = new IGVecR4(0, 1,0,0);
        IGVecR4 col3 = new IGVecR4(0,0,1,0);
        IGVecR4 col4 = new IGVecR4(0,0,1,0);
        // mensaje:
        // ingrese el valor de fila %i, columna %i de matriz n
        System.out.println(nombreMatriz);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == 1 && j == 1)
                    col1.setX(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 2)
                    col2.setX(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 3)
                    col3.setX(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 4)
                    col4.setX(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 1)
                    col1.setY(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 2)
                    col2.setY(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 3)
                    col3.setY(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 4)
                    col4.setY(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 1)
                    col1.setZ(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 2)
                    col2.setZ(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 3)
                    col3.setZ(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 4)
                    col4.setZ(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 4 && j == 1)
                    col1.setW(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 4 && j == 2)
                    col2.setW(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 4 && j == 3)
                    col3.setW(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 4 && j == 4)
                    col4.setW(NM.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
            }
        }
        return new  IGMatR4(col1,col2,col3,col4);
    }

    public void imprimirMatR2(IGMatR2 a){
        System.out.println("|\t" + a.getCol1().getX() + "  " + a.getCol1().getX() + "\t|");
        System.out.println("|\t" + a.getCol1().getY() + "  " + a.getCol1().getY() + "\t|");
    }

    public void imprimirMatR3(IGMatR3 a){
        System.out.println("|\t" + a.getCol1().getX() + "  " + a.getCol2().getX() + "  " + a.getCol3().getX() + "\t|");
        System.out.println("|\t" + a.getCol1().getY() + "  " + a.getCol2().getY() + "  " + a.getCol3().getY() + "\t|");
        System.out.println("|\t" + a.getCol1().getZ() + "  " + a.getCol2().getZ() + "  " + a.getCol3().getZ() + "\t|");
    }

    public void imprimirMatR4(IGMatR4 a){
        System.out.println("|\t" + a.getCol1().getX() + "  " + a.getCol2().getX() + "  " + a.getCol3().getX() + "  "+ a.getCol4().getX() + "\t|");
        System.out.println("|\t" + a.getCol1().getY() + "  " + a.getCol2().getY() + "  " + a.getCol3().getY() + "  "+ a.getCol4().getY() + "\t|");
        System.out.println("|\t" + a.getCol1().getZ() + "  " + a.getCol2().getZ() + "  " + a.getCol3().getZ() + "  "+ a.getCol4().getZ() + "\t|");
        System.out.println("|\t" + a.getCol1().getW() + "  " + a.getCol2().getW() + "  " + a.getCol3().getW() + "  "+ a.getCol4().getW() + "\t|");
    }

}
