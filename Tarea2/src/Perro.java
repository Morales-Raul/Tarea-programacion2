public class Perro extends Animal{
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }
    public void comer() {
        System.out.println("El animal come");
    }
    public void beber(){
        System.out.println("El animal bebe");
    }
}
