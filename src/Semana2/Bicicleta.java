package Semana2;

abstract class Mountain{
    Mountain(){
        System.out.println("Se ha creado una bicicleta de montaña");
    }
    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando a color rojo");
    }
}

class Magistroni extends Mountain{
    @Override
    void cambiarVelocidad() {
        System.out.println("se debe modificar las perillas el manibrio primero");
    }
}

public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("girar la perilla");
    }

    public static void main(String[] args) {
        Mountain bicicleta1 = new Magistroni();  //Se ha creado una bicicleta de montaña
        bicicleta1.cambiarVelocidad(); // se debe modificar las perillas el manibrio primero
        bicicleta1.cambiarColor(); //Cambiando a color rojo
    }
}
