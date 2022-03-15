/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author José Sebastian López Ibarra & Sebastian Emilio Murillo Andrade
 */
class Contraseña{
    private String usuario, contraseña;

    public void setUsuario(String usuario) {
    this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
    }

    public Contraseña(){
    usuario = "Jugo de tomate";
    contraseña = "Girasol";
    }

    public Contraseña(String usuario, String contraseña) {
    this.usuario = usuario;
    this.contraseña = contraseña;
    }

    public void verificarAcceso(String usuario, String contraseña){
        if(this.usuario.equals(usuario)){
            if(this.contraseña.equals(contraseña)){
                System.out.println("TRUE\n");
            } else {
                System.out.println("FALSE\n");
            }
        } else{
            System.out.println("FALSE\n");
        }
    }
}