package edu.ipn.cecyt9.customer;

public class CustomerDriver {

    public static void main(String[] args) {
        // Define a reference and creates a new Customer object
       /* Customer customer;
//        customer = new Customer();
        //aqui defino que quiero instaciar mi objeto utilizando el constructor 
//        que recibe un parametro 
//        los paramnetros se los puedo pasar directamente por ejemplo
//         customer = new Customer("Default Customer");
//        o desde consola como lo haremos a continuacion
//          customer = new Customer(args[0]);
            //aqui defino que quiero instaciar mi objeto utilizando el constructor 
//        que recibe dos parametros desde consola
//          customer = new Customer(args[0], args[1]);
            //aqui defino que quiero instaciar mi objeto utilizando el constructor 
//        que recibe tres parametros desde consola
          customer = new Customer(args[0], args[1], args[2]);
        System.out.println(customer.toString());
        */
        
        Videojuego juegito = new Videojuego();
        juegito.setClave(1);
        juegito.setPlataforma("Steam");
        juegito.setPrecio(1000);
        juegito.setTitulo("Juego1");
        System.out.print(juegito.getClave() + "\n");
        System.out.print(juegito.getPlataforma() + "\n");
        System.out.print(juegito.getPrecio()+ "\n");
        System.out.print(juegito.getTitulo()+ "\n");
        
    }
 
    
}

