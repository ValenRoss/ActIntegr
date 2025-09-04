package ActIntegr;

/*Una empresa gastronómica proporciona un bono mensual a sus trabajadores, el cual puede ser por su antigüedad (multiplicada por 500) 
o bien por el monto de su sueldo (el que tenga mayor en valor numérico), de la siguiente forma:

Cuando la antigüedad es mayor a 2 años, pero menor a 5, se otorga 20 % de su sueldo; cuando es de 5 años o más, 30 %. Ahora bien, 
el bono por concepto de sueldo, si éste es menor o igual a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a $3500, 
se otorga 15% de su sueldo, para más de $3500. 10%. Escribir un programa en Java que permita calcular los dos tipos de bono de acuerdo a lo estipulado.

*Nota: En caso que el valor numérico de la (antigüedad * 500) sea igual al valor numérico del sueldo sueldo, se tomará el bono mayor .

Utilizar JOptionPane para el ingreso de datos y salida por pantalla.

Al final hay una hoja de cálculo para verificar resultados del ejercicio. */

// Input --> Solicitar añ usuario su antiguedad expresada en años por pantalla
// Proceso --> 
//  Calculo bono --> Antiguedad * 500

// Si la misma es > 2 pero < 5 años se otorga un valor del --> 20% de su sueldo
//                         > 5 años se otorga un valor del --> 30% de su sueldo 
// Bono
// Si el bono es == $1000 --> Se otroga el 25% --> (1000*25)/100
//     =$1000 <= $3500         15% --> (1000*15)/100
// > $3500         10% --> (1000*10)/100

import javax.swing.JOptionPane;

public class Actividad_1b {
    public static void main(String[] args) {
        Float sueldoMax, bonoB, antiguedad, sueldo, bonoA,bonoMayor, bonoM;
        do {
            antiguedad = Float.parseFloat(JOptionPane.showInputDialog(null,"Bienvenido al sistema de conversion" + "\n Ingresa tu antiguedad en años: " + "| S | - Para salir",2));
            sueldo = sueldo(antiguedad);
            sueldoMax = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa tu sueldo maximo",2));
            bonoA = bonoAnt(antiguedad, sueldoMax);
            bonoB = bonoSueldo(sueldoMax);
            System.out.println(bonoA);
            System.out.println(bonoB);
            if (sueldoMax > sueldo) {
                bonoM = sueldoMax + bonoB;
                JOptionPane.showMessageDialog(null, "El bono que te corresponde es:" + "\n | Bono mas sueldo: |" + "\n" + "|"+ bonoM +"|");
            }
            if (sueldo == sueldoMax) {
                bonoMayor = bonoMayor(bonoA, bonoB);
                JOptionPane.showMessageDialog(null, "El bono que te corresponde es:" + "\n | Bono mas sueldo: |" + "\n" + "|"+ bonoMayor + sueldoMax +"|");
            }
            if (bonoA > bonoB) {
                bonoM = sueldoMax + bonoA;
                JOptionPane.showMessageDialog(null, "El bono que te corresponde es:" + "\n | Bono mas sueldo: |" + "\n" + "|"+ bonoM +"|");
            } 
            if (bonoB > bonoA){
                bonoM = sueldoMax + bonoB;
                JOptionPane.showMessageDialog(null, "El bono que te corresponde es:" + "\n | Bono mas sueldo: |" + "\n" + "|"+ bonoM +"|");
            }
        } while (antiguedad != 0 || sueldoMax != 0);

    }
    




    // Calculo Bono x Sueldo
    static public Float bonoSueldo (Float x){
        Float sueldo = x, bonoB = 0f;
        if(sueldo <= 1000){
            bonoB = (25*sueldo) / 100;
        }
        if(sueldo > 1000 && sueldo <= 3500){
            bonoB = (15*sueldo) / 100;
        }
        if(sueldo > 3500){
            bonoB = (10*sueldo) / 100;
        }
        return bonoB;
    }
    // Calculo Antiguedad vs Bono
    static public float bonoMayor (float x, float y){
        Float bonoA = x, bonoB = y, bonoM = 0f;
        if (bonoA > bonoB) {
            bonoM = bonoA;     
        } else bonoM = bonoA;
        return bonoM;
    }

    // Calculo Bono x Antiguedad
    static public Float bonoAnt (Float x, Float y){
        Float ant = x, bonoA = 0f, sueldoMax = y;
        if(ant > 2 && ant < 5){
            bonoA = (20*sueldoMax) / 100;
        }
        if(ant >= 5){
            bonoA = (30*sueldoMax) / 100;
        }
        return bonoA;
    }

    // Metodo sueldo
    static public Float sueldo(Float x) {
        Float sueldo = x;
        sueldo *= 500;
        return sueldo;
    }

}
