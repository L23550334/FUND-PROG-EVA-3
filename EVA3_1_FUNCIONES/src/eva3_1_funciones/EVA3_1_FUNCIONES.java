/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_funciones;

/**
 *
 * @author invitado
 */
public class EVA3_1_FUNCIONES {
    public static void main(String[] args) {
        imprimirMensaje ("HOLA MUNDO",5);
        imprimirMensaje ("ADIOS MUNDO",6);
        imprimirMensaje ("ÉPICO",7);
    }
    public static void imprimirMensaje(String mensaje, int cant){
        //llama a funcion o procedimiento
        
        for (int i = 0; i < cant; i++) {
            System.out.print(mensaje+" ");
        }
    } 
}
