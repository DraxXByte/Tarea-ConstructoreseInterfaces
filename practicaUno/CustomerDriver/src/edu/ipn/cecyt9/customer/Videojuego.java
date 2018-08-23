package edu.ipn.cecyt9.customer;
public class Videojuego {
    private String titulo;
    private int precio;
    private String plataforma;
    private int clave;
//constructor-vacio    
public Videojuego ()
{
    this.precio=precio;
    this.titulo=titulo;
    this.plataforma=plataforma;
    this.clave=clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

}
