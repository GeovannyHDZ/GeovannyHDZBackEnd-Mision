package Semana1.Viernes;

class Animal2{
    void eat(){
        System.out.println("Comiendo...");
    }
}
class Perro extends animal {
    void eat(){
        System.out.println("Comiendo Croquetas");
    }
}
class Chachorro extends animal{
    void eat(){
        System.out.println("Tomando agua");
    }
}
public class Polimorfismo2 {
    public static void main(String[] args) {
        animal dander;
        dander = new animal();
        dander.eat();
        dander = new Perro();
        dander.eat();
        dander = new Chachorro();
        dander.eat();
    }
}
