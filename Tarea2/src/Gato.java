public  class Gato extends Animal{
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("MIAU");
    }
    public void comer() {
        System.out.println("El animal come");
    }
    public void beber(){
        System.out.println("El animal bebe");
  }
}