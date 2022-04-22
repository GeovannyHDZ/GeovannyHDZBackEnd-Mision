package Semana2;

abstract class Hola{
    void saludar(){
        //Como lo hace
        System.out.println("Hola, ¿Cómo te va?");
    }
    abstract void saludo();
}

interface Mostrar{
    //Que hace
    void show();
    abstract void despide();
}



public class SaludosCordiales implements Mostrar {
    @Override
    public void show() {
        System.out.println("Hola, ¿Cómo estás?, espero no del todo mal...");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
    }

    @Override
    public void despide() {
        System.out.println("Adios...");
    }
}
