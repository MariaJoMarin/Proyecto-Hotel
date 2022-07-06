

package hotel;


public class DatosReserva {
//Atributos
    
private float precio;
public float total;
public int reservar,disponible,dias;


    //Metodos

    public DatosReserva(float precio, float total, int reservar, int disponible, int dias) {
        
        this.precio=precio;
        this.total=total;
        this.disponible=disponible;
        this.dias=dias;
        this.reservar=reservar;
                       
    }
    
    //metodos getters con argumentos y operaciones
    public float getTotal(float total, int dias, float precio,int reservar)  {
        //se multiplica las noches que el usuario se va a ospedar por el precio de la habitacion seleccionada
        total=(int)dias*precio*reservar;
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
    
    public int getDias(int dias,float precio){
        //calcularDias calcular = new calcularDias();   
        //se multplica el precio de las noches que se queda hospedado el usuario
        dias=(int)((int)dias*precio);
        return dias;
    }
    
}
