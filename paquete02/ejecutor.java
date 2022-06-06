package paquete02;
import java.util.Locale;

import paquete1.Ciudad;
import paquete1.Doctor;
import paquete1.Enfermero;
import paquete1.Hospital;

import java.util.Scanner;
public class ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String nombre, nombreHospital, provincia, ciudad, especialidad, tipo, direccion;
        double sueldo;
        int especialidades;
        System.out.println("Ingrese el nombre del Hospital");
        nombreHospital = sc.nextLine();
        System.out.println("Ingrese la Provincia del Hospital");
        provincia = sc.nextLine();
        System.out.println("Ingrese la ciudad del Hospital");
        ciudad = sc.nextLine();
        System.out.println("Ingrese el numero de especialidades del Hospital");
        especialidades = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la direccion del Hospital");
        direccion = sc.nextLine();
        Ciudad c = new Ciudad(ciudad, provincia);
        int n, m;
        System.out.println("Ingrese cuantos doctores tiene el hospital");
        n = sc.nextInt();
        sc.nextLine();
        Doctor[] d = new Doctor[n];
        for (int i = 0; i < d.length; i++) {
            System.out.printf("Ingrese el nombre del doctor %d\n", i + 1);
            nombre = sc.nextLine();
            System.out.printf("Ingrese la especialidad del doctor %d\n", i + 1);
            especialidad = sc.nextLine();
            System.out.printf("Ingrese el sueldo del doctor %d\n", i + 1);
            sueldo = sc.nextDouble();
            sc.nextLine();
            d[i] = new Doctor(nombre, especialidad, sueldo);
        }
        System.out.println("Ingrese cuantos enfermeros tiene el hospital");
        m = sc.nextInt();
        sc.nextLine();
        Enfermero[] e = new Enfermero[m];
        for (int i = 0; i < e.length; i++) {
            System.out.printf("Ingrese el nombre del enfermero %d\n", i + 1);
            nombre = sc.nextLine();
            System.out.printf("Ingrese el tipo de contrato del enfermero %d\n", i + 1);
            tipo = sc.nextLine();
            System.out.printf("Ingrese el sueldo del enfermero %d\n", i + 1);
            sueldo = sc.nextDouble();
            sc.nextLine();
            e[i] = new Enfermero(nombre, tipo, sueldo);
        }

        Hospital h = new Hospital(nombreHospital, c, especialidades, d, e, direccion);
        System.out.printf("%s", h);

    }
}
