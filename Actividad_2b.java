package ActIntegr;

import javax.swing.JOptionPane;

public class Actividad_2b {
    public static void main(String[] args) {
        String texto = "| Bienvenido al sistema de calculo |" + "\n | Iniciamos? |" + "\n | SI | - | NO |",
                titulo = "Calulo", pregunta = "";
        int valor = 3, sumaV = 0, icon = 0, vMenor = 0, div6 = 0, sumaVm = 0,vMayor = 0;
        pregunta = joInpStr(texto, titulo, valor);
        vMenor = valor;
        while (pregunta.equalsIgnoreCase("Si") && valor != 0 && sumaV < 1000) {
            texto = "| Sistema de calculo |" + "\n Introduce el valor para continuar:";
            titulo = "calculo";
            icon = 2;
            valor = joInpInt(texto, titulo, icon);
            sumaV += valor;
            if (valor > vMayor) {
                    vMayor = valor;
                }
            if (valor < vMenor) {
                vMenor = valor;
            }
            if (valor % 6 == 0) {
                div6++;
            }
            if (valor <= 10) {
                sumaVm += valor;
            }
        }
        joShow("Se finaliza el codigo" + "\n La cantidad de valor multiplos de 6 son: " + div6 + "\n La suma  de  valores > 10:  " + sumaVm + "\n El  valor  menor es: " + vMenor + 
        "\n El  valor  mayor es: " + vMayor," | Codigo Finalizado |", icon);
    }

    // Metodo OJInputStr
    public static String joInpStr(String x, String y, int z) {
        int valor = z;
        String texto = x, titulo = y, pregunta = "";
        Boolean ePregunta = true;
        while (ePregunta) {
            try {
                pregunta = JOptionPane.showInputDialog(null, texto, titulo, valor);
                ePregunta = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la carga de datos", "| Error |", valor);
                ePregunta = true;
            }
        }
        return pregunta;
    }

    // Metodo OJInputInt
    public static int joInpInt(String x, String y, int z) {
        int valor = z;
        String texto = x, titulo = y;
        Boolean eValor = true;
        while (eValor) {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, texto, titulo, valor));
                eValor = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la carga de datos", "| Error |", valor);
                eValor = true;
            }
        }
        return valor;
    }

    // Metodo OJShow
    public static void joShow(String x, String y, int z) {
        int valor = z;
        String texto = x, titulo = y;
        JOptionPane.showMessageDialog(null, texto, titulo, valor);
    }

    /*--------------------------------------Fin-----------------------------------------------------*/
}
