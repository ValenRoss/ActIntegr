package ActIntegr;
/*Escribir un programa en Java que permita leer desde teclado números hasta que la suma de los mismos llegue a 1000. 
Mientras tanto se debe obtener y mostrar al finalizar:

    La cantidad de números múltiplos de 6.
    La suma de los números que se encuentran entre el 1 y el 10 (incluidos).
    El Mayor y el Menor de los números ingresados y su posición de ingreso.
*/

import javax.swing.JOptionPane;

// Input --> Solicitar y leer valores brindados por el usuario contar los mismos hasta llegar a 1000
// Proceso --> Al alcanczar el numero 1000 --> interar cada valor %6 == 0
// Sumar los valores menores o iguales a 10.
// Expresar el numero mayor - menor y expresar la posicion

public class Actividad_2 {
    public static void main(String[] args) {
        int valor = 0, sumaV = 0, x = 0, div6 = 0, sumaVm = 0, vMenor = 0, vMayor = 0;
        String y, z;
        y = "Bienvenido al sistema \n Introduce el valor para continuar: " + "\n 0 - Salir";
        z = "Calculo";
        valor = jOInp(sumaV,y,z);
        System.out.println(valor);
        vMenor = valor;
        vMayor = valor;
        sumaV += valor;
        if (valor != 0) {
            while (sumaV < 1000 && valor != 0) {
                if (valor < vMenor) {
                    vMenor = valor;
                } 
                if (valor % 6 == 0) {
                    div6++;   
                }
                if (valor <= 10){
                    sumaVm += valor;
                }
                valor = jOInp(sumaV,y,z);
                if (valor > vMayor) {
                    vMayor = valor;
                }
                if (valor < vMenor) {
                    vMenor = valor;
                } 
                if (valor % 6 == 0) {
                    div6++;   
                }
                if (valor <= 10){
                    sumaVm += valor;
                }
                sumaV += valor;
                System.out.println(valor);
                System.out.println(sumaV);
            }
        }
        y = "Alcanzaste el valor de | 1000 |";
        z = "Felicitaciones";
        x = 1;
        jOshow(y + "\n La cantidad de valor multiplos de 6 son: " + div6 + "\n La suma  de  valores > 10:  " + sumaVm + "\n El  valor  menor es: " + vMenor + 
        "\n El  valor  mayor es: " + vMayor, z, x);
    
    }
    // Metodo OJInput
    public static int jOInp (int x,String y, String z){
        int valor = x;
        String texto = y, titulo = z;
        Boolean eValor = true;
        while (eValor) {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null,texto,titulo,2));
                eValor = false;
            } catch (Exception e) {
                eValor = true;
                int icon = 2;
                texto = "Error en la carga de datos...!";
                titulo = "Error";
                jOshow(texto, titulo, icon);
            }
        }
        return valor;
    }
    // Metodo OJShow
    public static void jOshow (String y, String z, int x){
        String texto = y, titulo = z;
        int icon = x;
        JOptionPane.showMessageDialog(null, texto, titulo, icon);
    }
}
