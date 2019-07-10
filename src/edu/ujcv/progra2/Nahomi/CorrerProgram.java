package edu.ujcv.progra2.Nahomi;

public class CorrerProgram {
    public void CorrerProgram() {

        MenuPrincipal menu = new MenuPrincipal();

        do {
            menu.mostrarOpciones();
            menu.Operando(menu.leerOpciones());
        }while (menu.opcion != 3);
    }
}
