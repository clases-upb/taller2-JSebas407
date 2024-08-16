/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
            System.out.println (Calcular_saldo (2000000, 500000, 1000000));
            System.out.println (Calcular_tip (100));
            System.out.println (Obtener_puntos (3, 2, 1));
            System.out.println (Calcular_definitiva (4, 4, 4, 4, 4, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
            System.out.println (Calcular_para_ganar (3, 3, 3, 3, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
            System.out.println (Calcular_salario (40, 10, 5, 20000));
            System.out.println (Calcular_area_triangulo(10, 5));
            System.out.println (Calcular_perimetro_cuadrado(5));
            System.out.println (Calcular_volumen_cilindro(5, 10));
            System.out.println (Calcular_area_circulo(5));
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */

    public static int Calcular_saldo (int base_din, int tot_rec, int tot_ret){
        try {
            if (base_din!=2000000){
                return -1;
            }
            else{
                int saldo_taquilla;
                saldo_taquilla = base_din + tot_rec - tot_ret;
                return saldo_taquilla;
            }
        } 
        catch (Exception e) {
            return -1;
        }
    }


    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */

    public static String Calcular_tip (float valor_consumo){
        try {
            if (valor_consumo>0){
                final float valor_propina = 0.10f;
                final float impuesto_consumo = 0.08f;
                float propina;
                float impuesto;
                float total_a_pagar;
                propina = valor_consumo * valor_propina;
                impuesto = valor_consumo * impuesto_consumo;
                total_a_pagar = valor_consumo + propina + impuesto;
                String total = "Valor comida: " + valor_consumo + ", Valor propina: " + propina + ", Valor ipoconsumo: " + impuesto + ", Total a pagar: " + total_a_pagar;
                return total;
            } 
            else{
                return "Error calculando consumo";
            }
        } 
        catch (Exception e) {
            return "Error en la funcion Calcular_tip";
        }
    }



    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */

    public static int Obtener_puntos (int ganados, int perdidos, int empatados){
        try {
            if (ganados<0 || perdidos<0 || empatados<0) {
                return -1;
            }
            else{
                int total_puntos;
                int puntos_ganados = ganados * 3;
                int puntos_perdidos = perdidos * 0; 
                int puntos_empatados = empatados; 
                total_puntos = puntos_ganados + puntos_perdidos + puntos_empatados;
                return total_puntos;
            }
        } 
        catch (Exception e) {
            return -1;
        } 
            
    }


    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */

    public static float Calcular_definitiva (float nota1, float nota2, float nota3, float nota4, float nota5, float porcen1, float porcen2, float porcen3, float porcen4, float porcen5){
        try {
            if (porcen1+porcen2+porcen3+porcen4+porcen5!=1){
                return -1;
            }
            else{
                float nota_definitiva;
                nota_definitiva = nota1*porcen1 + nota2*porcen2 + nota3*porcen3 + nota4*porcen4 + nota5*porcen5;
                return nota_definitiva;
            }           
        } 
        catch (Exception e) {
            return -1;
        }
    }


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */

    public static float Calcular_para_ganar (float nota1, float nota2, float nota3, float nota4, float por1, float por2, float por3, float por4, float por5){
        try {
            float promedio_actual;
            float nota_faltante;
            final byte puntaje_minimo = 3;
            float nota_para_ganar;
            promedio_actual = (nota1*por1 + nota2*por2 + nota3*por3 + nota4*por4);
            nota_faltante = puntaje_minimo - promedio_actual;
            nota_para_ganar = nota_faltante/por5;
            return nota_para_ganar;
        } 
        catch (Exception e) {
            return -1;
        }
    }


    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_salario (int horas_normales, int horas_extra_d, int horas_extra_n, int valor_hora_normal){
        try {
            if (valor_hora_normal>0){
                float salario_horas_normales = horas_normales * valor_hora_normal;
                final float recargo_adicional_d = 0.15f;
                final float recargo_adicional_n = 0.35f;
                float valor_extra_d = valor_hora_normal * recargo_adicional_d;
                float salario_extra_d = horas_extra_d * valor_extra_d;
                float valor_extra_n = valor_hora_normal * recargo_adicional_n;
                float salario_extra_n = horas_extra_n * valor_extra_n;
                float salario_total = salario_horas_normales + salario_extra_d + salario_extra_n;
                return salario_total;
            }
            else{
                return -1;
            }
        } 
        catch (Exception e) {
            return -1;
        }
    }




    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_area_triangulo (float base, float altura){
        try {
            if (base>0 && altura>0){
                float area;
                area = (base * altura)/2;
                return area;
            }
            else{
                return -1;
            }
        } 
        catch (Exception e) {
            return -1;
        }
    }



    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_perimetro_cuadrado (float lado){
        try {
            if (lado>0){
                float perimetro;
                perimetro = lado * 4;
                return perimetro;
            }
            else{
                return -1;
            }
        } 
        catch (Exception e) {
            return -1;
        }
    }



    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_volumen_cilindro (float radio_base, float altura){
        try {
            if(radio_base>0 && altura>0){
                float volumen;
                volumen = (float)Math.PI * radio_base * radio_base * altura;
                return volumen;
            }
            else{
                return -1;
            }
        } 
        catch (Exception e) {
            return -1;
        }
    }


    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_area_circulo (float radio){
        try {
            if(radio>0){
                float area;
                area = (float)Math.PI * radio * radio;
                return area;
            }
            else{
                return -1;
            }
            
        } 
        catch (Exception e) {
            return -1;
        }
    }




}
