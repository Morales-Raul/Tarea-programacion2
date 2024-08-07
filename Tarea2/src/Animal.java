public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract void hacerSonido();
    public void dormir(){
        System.out.println("El animal duerme");
    }
    public void comer() {
        System.out.println("El animal come");
    }
    public void beber(){
        System.out.println("El animal bebe");
 }
}