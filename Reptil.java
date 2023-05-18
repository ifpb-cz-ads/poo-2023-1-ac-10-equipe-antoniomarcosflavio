public class Reptil extends Animal {
    @Override
    public void dormir() {
        this.sono++;
    }
    @Override
    public void comer() {
        this.fome++;
    }
    @Override
    public void fazerBarulho() {
        System.out.println("PSSSSSS");
    }
    @Override
    public void brincar() {
        this.felicidade += 1/2;
    }
}