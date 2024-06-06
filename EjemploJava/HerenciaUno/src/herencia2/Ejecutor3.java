/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        boolean estado = true;

        System.out.println("Ingrese la opcion que desea realizar");
        System.out.println("1: Ingresar estudiante a distancia");
        System.out.println("2: Ingresar estudiante presencial");
     
        op = sc.nextInt();

        if (op == 1) {
            EstudianteDistancia();
        } else if (op == 2) {
            EstudiantePresencial();
        }

    }

    public static void EstudianteDistancia() {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese nombres");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese número de asignaturas");
        int asignaturas = entrada.nextInt();
        System.out.println("Ingrese costo asignatura");
        double costoAsignatura = entrada.nextDouble();
        EstudianteDistancia estudiante = new EstudianteDistancia();

        estudiante.establecerNombresEstudiante(nombres);
        estudiante.establecerApellidoEstudiante(apellidos);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerIdentificacionEstudiante(identificacion);
        estudiante.establecerNumeroAsginaturas(asignaturas);
        estudiante.establecerCostoAsignatura(costoAsignatura);
        estudiante.calcularMatriculaDistancia();

        System.out.printf("%s\n", estudiante);

    }

    public static void EstudiantePresencial() {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese nombres");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese número de créditos");
        int creditos = entrada.nextInt();
        System.out.println("Ingrese costo de creditos");
        double costoCredito = entrada.nextDouble();
        EstudiantePresencial estudiante = new EstudiantePresencial();

        estudiante.establecerNombresEstudiante(nombres);
        estudiante.establecerApellidoEstudiante(apellidos);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerIdentificacionEstudiante(identificacion);
        estudiante.establecerNumeroCreditos(creditos);
        estudiante.establecerCostoCredito(costoCredito);
        estudiante.calcularMatriculaPresencial();

        System.out.printf("%s\n", estudiante);

    }
}
