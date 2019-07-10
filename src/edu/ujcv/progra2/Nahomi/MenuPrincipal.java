package edu.ujcv.progra2.Nahomi;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.NMTOKENDatatypeValidator;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class MenuPrincipal {
    MenuVectores MenVec = new MenuVectores();
    MenuMatrices MenMat = new MenuMatrices();
public int opcion;

    public void mostrarOpciones (){

    System.out.println("\t Calculadora de Algebra Lineal");
    System.out.println("\n 1. Vectores");
    System.out.println("\n 2.  Matrices");
    System.out.println("\n 3. Salir");
}
   public int leerOpciones(){
    opcion = NM.getInteger("ingrese una opcion", "Usted ingreso una opcion no valida");
    return opcion;
}

   public void Operando (int opcion){
     switch (opcion){
         case 1:
            MenVec.presentarOpciones();
            MenVec.procesarOpcion(MenVec.leerOpciones());
            break;

         case 2:
             MenMat.mostrarOpciones();
             MenMat.procesarOpcion(MenMat.leerOpciones());
             break;

         case 3:
             System.out.println("Gracias por utilizar la calculadora");
             break;
}

}
    LectorDeTecladoValidado NM = LectorDeTecladoValidado.getInstance();
}
