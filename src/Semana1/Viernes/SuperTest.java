package Semana1.Viernes;


class animal {
    //Caso 1 - Variables
    String color = "Blanco";
    //Caso2 - Metodos
    void eat(){
        System.out.println("Esta comiendo");
    }
    //Caso 3 - Constructores
    animal(){
        System.out.println("Se crea un animal");
    }
}
class gato extends animal {
    //Caso 1
    String color = "Cafe";
    void printColor(){
        System.out.println("Color de la clase gato: " + color);
        System.out.println("Color de la clase animal: " + super.color);
    }

    //Caso2
    void eat(){
        System.out.println("Come atun");
    }
    void dormir(){
        System.out.println("Duerme");
    }
    void call(){
        super.eat();
        dormir();
    }

    //Caso 3
    gato(){
        super();
        System.out.println("Se ha creado un gato");
    }

}
public class SuperTest {
    public static void main(String[] args) {
        //Caso 1
        new gato().printColor();

        //Caso 2
        new gato().call();

        //Caso 3
        new gato();
    }
}
