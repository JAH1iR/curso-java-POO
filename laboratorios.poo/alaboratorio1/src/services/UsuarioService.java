package services;

import Model.Administrador;
import Model.Usuario;
import java.util.Scanner;

public class UsuarioService {

    // Método para cambiar el estado (Activo/Inactivo)
    public void cambiarEstado(Usuario u, boolean nuevoEstado) {
        u.setEstado(nuevoEstado);
        String mensaje = nuevoEstado ? "ACTIVADO" : "DESACTIVADO";
        // Podemos usar getNombre() porque Usuario hereda de PersonaModel
        System.out.println("El usuario " + u.getNombre() + " ahora está " + mensaje);
    }

    // Método para validar acceso de Administrador
    public void validarAdministrador(Administrador a) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n--- LOGIN DE ADMINISTRADOR ---");
        System.out.print("Ingrese correo: ");
        String inputCorreo = sc.nextLine();
        
        System.out.print("Ingrese contraseña: ");
        String inputPass = sc.nextLine();

        // Verificamos si los datos ingresados coinciden con los del objeto
        if (inputCorreo.equals(a.getCorreo()) && inputPass.equals(a.getContraseña())) {
            System.out.println("¡Autenticación Exitosa!");
            System.out.println("Bienvenido Administrador de: " + a.getAreaResponsable());
        } else {
            System.out.println("Error: Correo o contraseña incorrectos.");
        }
    }
}