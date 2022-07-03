
package hotel;


public class DatosReserva {
//Atributos
    
private float precio;
public float total;
public int reservar,disponible,noches;

    //Metodos

    public DatosReserva(float precio, float total, int reservar, int disponible, int noches) {
        
        this.precio=precio;
        this.total=total;
        this.disponible=disponible;
        this.noches=noches;
        this.reservar=reservar;
                       
    }
    
    //metodos getters con argumentos y operaciones
    public float getTotal(float total, int noches, float precio,int reservar)  {
        //se multiplica las noches que el usuario se va a ospedar por el precio de la habitacion seleccionada
        total=(int)noches*precio*reservar;
        return total;   
    }
    public int getReservar(int reservar) {
        return reservar;
    }
    //variable del nombre del usuario
    public String getNombreU(String NombreU) {
        return NombreU;
    }
    //se multiplica la reserva por el precio
    public float getPrecio(float precio, int reservar) {
        precio=reservar*precio;
        return precio;
    }
    
    public int getDisponioble(int disponible,int Nhabitaciones,int reservar){
        //para mirar cuantas habitaciones disponiobles quedan despues de la reservacion
        disponible=Nhabitaciones-reservar;
        return disponible;
    }
    
    public int getNoches(int noches,float precio){
        //se multplica el precio de las noches que se queda hospedado el usuario
        noches=(int)((int)noches*precio);
        return noches;
    }
    
}
