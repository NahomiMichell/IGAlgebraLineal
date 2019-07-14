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

    public void mostrarOpcionesMatR2 (){
        System.out.println("Matrices de orden 2");
        System.out.println("\n 1. suma");
        System.out.println("\n 2. resta");
        System.out.println("\n 3. Multiplicación");
        System.out.println("\n 4. Multiplicación por vector");
        System.out.println("\n 5. Multiplicación por escalar");
        System.out.println("\n 6. Rotación");
        System.out.println("\n 7. Regresar");

    }

    public int leerOpcionMatR2 (){
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
                    IGMatR2 Naho3 = mat6.mul(mat7);

                    System.out.println("La multiplicacion de matrices es: ");
                    imprimirMatR2(Naho3);
                    break;
            case 4:
                IGMatR2 mat8 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGVecR2 v = new IGVecR2(0,1);
                v.setX(NM.getDouble("Ingrese el primer numero vector","Error! Ha ingresado un caracter no valido"));
                v.setY(NM.getDouble("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                IGVecR2 Naho4 = mat8.multvector(v);

                System.out.println("La multiplicacion de matriz por vector es \n" );
                System.out.println("|\t"+ Naho4.getX()+"\t|");
                System.out.println("|\t"+ Naho4.getY()+"\t|");
                break;

            case 5:
                double alpha = 0;
                alpha = NM.getDouble("Ingrese el escalar", "El caracter que ingreso NO es valido. Por favor vuelva a intentar");
                IGMatR2 mat9 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGMatR2 Naho5 = mat9.escalarXmat(alpha);

                System.out.println("La multiplicacion por un escalar es:\n ");
                imprimirMatR2(Naho5);
                break;
            case 6:
                double angulo = 0;
                angulo = NM.getDouble("Ingrese un angulo", "El caracter que ingreso NO es válido. Por Favor vuelva a intentar");

                IGVecR2 ve = new IGVecR2();
                ve.setX(NM.getDouble("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido"));
                ve.setY(NM.getDouble("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido"));
                IGMatR2 Naho6 = new IGMatR2();
                MenuDimVec mv = new MenuDimVec();

                IGVecR2 NAH1 = Naho6.rotacion(angulo,ve);
                mv.imprimirIGVecR2(NAH1);

                break;

            case 7:
                System.out.println("Estas de vuelta en el menu principal \n");
                break;
        }
        return opcion;
    }
    public void mostrarOpcionesMatR3() {
        System.out.println("\t Matrices de orden 3");
        System.out.println("\n 1.Suma");
        System.out.println("\n 2.Resta");
        System.out.println("\n 3. Multiplicacion por un escalar");
        System.out.println("\n 4. Multiplicacion por un vector");
        System.out.println("\n 5. Multiplicacion por una matriz");
        System.out.println("\n 6. Rotación en X");
        System.out.println("\n 7. Rotación en Y");
        System.out.println("\n 8. Rotación en Z");
        System.out.println("\n 9. Regresar");
    }

    public int leerOpcionesMatR3() {
        opcion = NM.getInteger("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcionMatR3(int opcion) {
        switch (opcion) {
            case 1:
                IGMatR3 mat1 = leerMatR3("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGMatR3 mat2 = leerMatR3("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                IGMatR3 naho1 = mat1.suma(mat2);

                System.out.println("La suma de matrices es \n");
                imprimirMatR3(naho1);
                break;

            case 2:
                IGMatR3 mat3 = leerMatR3("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGMatR3 mat4 = leerMatR3("Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                IGMatR3 naho2 = mat3.resta(mat4);
                System.out.println("La resta de matrices es \n");
                imprimirMatR3(naho2);
                break;
            case 3:
                double alpha = 0;
                alpha = NM.getDouble("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                IGMatR3 mat5 = leerMatR3("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGMatR3 res3 = mat5.escalarXmat(alpha);
                System.out.println("La multiplicacion de una matriz por un escalar es \n");
                imprimirMatR3(res3);
                break;

            case 4:

                IGMatR3 mat6 = leerMatR3 ("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGVecR3 v = new IGVecR3(0,1,0);
                v.setX(NM.getDouble("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido"));
                v.setY(NM.getDouble("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido"));
                v.setZ(NM.getDouble("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido"));
                IGVecR3 naho4 = mat6.multvector(v);

                System.out.println("La multiplicacion de matriz por vector es \n" );
                System.out.println("|\t"+ naho4.getX()+"\t|");
                System.out.println("|\t"+ naho4.getY()+"\t|");
                System.out.println("|\t"+ naho4.getZ()+"\t|");
                break;

            case 5:

                IGMatR3 mat7 = leerMatR3("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGMatR3 mat8 = leerMatR3("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                IGMatR3 naho5 = mat7.mul(mat8);

                System.out.println("La multiplicacion de matrices es \n");
                imprimirMatR3(naho5);
                break;

            case 6:
                double angulo;
                angulo = NM.getDouble("Ingrese un angulo", "Error! Ha ingresados un caracter no valido. Por favor vuelva a intentar");
                IGVecR3 vec = new IGVecR3();
                IGMatR3 mat = new IGMatR3();
                MenuDimVec mv = new MenuDimVec();
                vec.setX(NM.getDouble("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido"));
                vec.setY(NM.getDouble("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido"));
                vec.setZ(NM.getDouble("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido"));

                IGVecR3 naho6 = mat.rotX(angulo,vec);
                mv.imprimirIGVecR3(naho6);
                break;

            case 7:
                double angulo1;
                angulo1 = NM.getDouble("Ingrese un angulo", "Error! Ha ingresados un caracter no valido. Por favor vuelva a intentar");
                IGVecR3 vec1 = new IGVecR3();
                IGMatR3 per = new IGMatR3();
                MenuDimVec MV = new MenuDimVec();
                vec1.setX(NM.getDouble("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido"));
                vec1.setY(NM.getDouble("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido"));
                vec1.setZ(NM.getDouble("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido"));

                IGVecR3 naho7 = per.rotY(angulo1,vec1);
                MV.imprimirIGVecR3(naho7);
                break;

            case 8:
                double ang2;
                ang2 = NM.getDouble("Ingrese un angulo", "Error! Ha ingresados un caracter no valido. Por favor vuelva a intentar");
                IGVecR3 v14 = new IGVecR3();
                IGMatR3 est = new IGMatR3();
                MenuDimVec MD = new MenuDimVec();
                v14.setX(NM.getDouble("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido"));
                v14.setY(NM.getDouble("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido"));
                v14.setZ(NM.getDouble("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido"));

                IGVecR3 coffy = est.rotZ(ang2,v14);
                MD.imprimirIGVecR3(coffy);
                break;

            case 9:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
        return opcion;
    }

    public void mostrarOpcionesMatR4() {
        System.out.println("\t \t \t \t Matrices de orden 4");
        System.out.println("\n 1.Suma");
        System.out.println("\n 2.Resta");
        System.out.println("\n 3.Multiplicacion por un escalar");
        System.out.println("\n 4. Multiplicacion por un vector");
        System.out.println("\n 5. Multiplicacion por una matriz");
        System.out.println("\n 6. Regresar al menu principal");
    }

    public int leerOpcionesMatR4() {
        opcion = NM.getInteger("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcionMatR4(int opcion) {
        switch (opcion) {
            case 1:
                IGMatR4 mat1 = leerMatR4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGMatR4 mat2 = leerMatR4("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                IGMatR4 naho1 = mat1.suma(mat2);

                System.out.println("La suma de matrices es \n");
                imprimirMatR4(naho1);
                break;

            case 2:
                IGMatR4 mat3 = leerMatR4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGMatR4 mat4 = leerMatR4("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                IGMatR4 res2 = mat3.suma(mat4);
                System.out.println("La suma de matrices es \n");
                imprimirMatR4(res2);
                break;

            case 3:
                double alpha = 0;
                alpha = NM.getDouble("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                IGMatR4 mat5 = leerMatR4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGMatR4 res3 = mat5.mulEscalar(alpha);

                System.out.println("La multiplicacion de una matriz por un escalar es \n");
                imprimirMatR4(res3);
                break;

            case 4:
                IGMatR4 mat6 = leerMatR4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGVecR4 v = new IGVecR4(0, 1, 0, 0);
                v.setX(NM.getDouble("Ingrese el primer numero del vector", "Error! Ha ingresado un caracter no valido"));
                v.setY(NM.getDouble("Ingrese el segundo numero del vector", "Error! Ha ingresado un caracter no valido"));
                v.setZ(NM.getDouble("Ingrese el tercer numero del vector", "Error! Ha ingresado un caracter no valido"));
                v.setW(NM.getDouble("Ingrese el tercer numero del vector", "Error! Ha ingresado un caracter no valido"));
                IGVecR4 res4 = mat6.mulVector(v);

                System.out.println("La multiplicacion de matriz por vector es \n");
                System.out.println("|\t" + res4.getX() + "\t|");
                System.out.println("|\t" + res4.getY() + "\t|");
                System.out.println("|\t" + res4.getZ() + "\t|");
                System.out.println("|\t" + res4.getW() + "\t|");
                break;

            case 5:
               IGMatR4 mat7 = leerMatR4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
               IGMatR4 mat8 = leerMatR4("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
               IGMatR4 res5 = mat7.mul(mat8);

                System.out.println("La multiplicacion de matrices es \n");
                imprimirMatR4(res5);
                break;

            case 6:
                System.out.println("Has regresado al menu principal \n \n");
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
