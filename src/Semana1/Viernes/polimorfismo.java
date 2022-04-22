package Semana1.Viernes;
class Bike2{
    void run(){
        System.out.println("Running………");
    }
}
public class polimorfismo extends Bike2 {
    @Override
    void run() {
        System.out.println("Running safely at 60 miles per hour");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new polimorfismo();
        bike2.run();
    }
}
