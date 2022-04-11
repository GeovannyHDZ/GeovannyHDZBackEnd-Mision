package Semana1;

public class PruebaBicicleta {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Bicicleta biciMountain = new Bicicleta();
        biciMountain.setColor("Negra");
        biciMountain.setRodada(25);
        biciMountain.setPins(6);
        biciMountain.setVelocidad(14.4);

        String msg = "Soy una bici de montaña y mis caracteristicas son:";
        msg += "\nColor: "+biciMountain.getColor();
        msg += "\nRodada: "+biciMountain.getRodada();
        msg += "\nPins: "+biciMountain.getPins();
        msg += "\nVelocidad: "+biciMountain.getVelocidad();

        System.out.print(msg);
    }
}
