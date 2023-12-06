package com.example.proyect_fynd.Models;

public class Usuario{
        private String nombre;
        private String apellido;
        private String correo;
        private String genero;
        private String fecha_nacimiento;
        private String contrasenia;

        public Usuario(String nombre, String apellido, String correo, String genero, String fecha_nacimiento, String contrasenia) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.genero = genero;
            this.fecha_nacimiento = fecha_nacimiento;
            this.contrasenia = contrasenia;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getFecha_nacimiento() {
            return fecha_nacimiento;
        }

        public void setFecha_nacimiento(String fecha_nacimiento) {
            this.fecha_nacimiento = fecha_nacimiento;
        }

        public String getContrasenia() {
            return contrasenia;
        }

        public void setContrasenia(String contrasenia) {
            this.contrasenia = contrasenia;
        }

        public String info_usuario(){
            return "*** info usuario***\n"+
                    "\t nombre: "+this.getNombre()+"\n"+
                    "\t apellido: "+this.getApellido()+"\n"+
                    "\t correo: "+this.getCorreo()+"\n"+
                    "\t genero: "+this.getGenero()+"\n"+
                    "\t nacimiento: "+this.getFecha_nacimiento()+"\n"+
                    "\t conrseña: "+this.getContrasenia()+"\n"+
                    "\t *** fin info usuario***" ;
        }
}

