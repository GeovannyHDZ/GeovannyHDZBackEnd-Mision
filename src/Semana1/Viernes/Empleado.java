package Semana1.Viernes;

public class Empleado {
    double salario = 4000;
}

class programadora extends Empleado{
    int bono = 1000;

    public void main(){
        programadora Angel = new programadora();
        System.out.println("El salario es:" + Angel.salario);
        System.out.println("El bono es de: "+Angel.bono);
    }
    void mensaje(){
        System.out.println("Soy programador");
        main();
    }
}

class Web extends programadora{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}
