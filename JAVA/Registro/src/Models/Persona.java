/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author S.A.P.T.
 */
public class Persona {
    int num_id;
    String nombres;
    String apellidos;
    String cel;
    String correo;

    public Persona(int num_id, String nombres, String apellidos, String cel, String correo) {
        this.num_id = num_id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cel = cel;
        this.correo = correo;
    }
    public int getNum_id() {
        return num_id;
    }

    public void setNum_id(int num_id) {
        this.num_id = num_id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
