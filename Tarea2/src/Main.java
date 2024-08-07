public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("FIFI",02);
        Gato gato = new Gato("RUFINO",14);

        System.out.println("Nombre: " + perro.getName()  + " edad: " + perro.getAge());
        perro.comer();
        perro.hacerSonido();
        perro.dormir();

        System.out.println("Nombre: " + gato.getName()  + " edad: " + gato.getAge());
        gato.hacerSonido();
        gato.comer();
        gato.beber();
        gato.dormir();
    }
}
