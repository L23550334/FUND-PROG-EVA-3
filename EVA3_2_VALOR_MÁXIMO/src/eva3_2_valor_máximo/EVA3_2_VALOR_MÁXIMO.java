/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_valor_máximo;

/**
 *
 * @author mac
 */
public class EVA3_2_VALOR_MÁXIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamada a funcion (invocar funcion)
       
        //utilizar el valor directamente de la funcion
        System.out.println(buscarMaximo(100, 200));
        
        //guardar el valor y usarlo despues
        int resu = buscarMaximo(300, 200);
        System.out.println(resu);
       
        //llamar a la funcion e ignorar el resultado
        buscarMaximo(100, 200);
    }

    public static int buscarMaximo(int valor1, int valor2) {

        /*if(valor1 > valor2)
            return valor1;
        else
            return valor2;*/
        int resultado;

        if (valor1 > valor2) {
            resultado = valor1;
        } else {
            resultado = valor2;
        }

        return resultado;

    }
}
