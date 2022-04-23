package Semana2.Hilos;

public class HilosT extends Thread {

    @Override //Runnable
    public synchronized void start() { //¿Qué quieres que haga?
        System.out.println("El hilo se está ejecutando");
    }
    /*
    public void start(){  }

     */

    public static void main(String[] args) {
        HilosT hilos = new HilosT(); //Entra al estado state new
        hilos.start(); //Manda a llamar al metodo Start()
    }
}
