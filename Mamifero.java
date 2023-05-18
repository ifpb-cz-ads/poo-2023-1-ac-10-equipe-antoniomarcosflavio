public class Mamifero extends Animal {
    @Override
    public void dormir() {
        this.sono++;
        this.felicidade--;
    }
    @Override
    public void comer() {
        this.fome++;
        this.peso++;
    }
    @Override
    public void fazerBarulho() {
        System.out.println("RUAAAWWW");
    }
}