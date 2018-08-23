package edu.ipn.cecyt9.customer;
public abstract class Videojuegoabs {
    private String titulo;
    private int precio;
    private String plataforma;
    private int clave;
    private int puntaje;
    
    
        public Videojuegoabs(int puntaje){
        this.puntaje = puntaje;
        }

    public int getPuntaje() {
        return this.puntaje;
    }
    public abstract void getName();
            
    public Videojuegoabs(int precio,String titulo){
        this.precio = precio;
        this.titulo=titulo;
        }

    public int getPrecio() {
        return this.precio;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public abstract void getpreciotitu();
    
    public Videojuegoabs(String plataforma, int clave){
    this.plataforma=plataforma;
    this.clave=clave;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getClave() {
        return clave;
    }
    
    public abstract void getclaveplata();
 
}


 