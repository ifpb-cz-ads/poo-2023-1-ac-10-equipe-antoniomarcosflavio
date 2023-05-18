public class Gato extends Mamifero {
    @Override
    public void dormir() {
        this.sono+=2;
        this.felicidade++;
    }
    @Override
    public void comer() {
        this.fome++;
        this.peso++;
    }
    @Override
    public void fazerBarulho() {
        System.out.println("MIAAUUU");
    }
    @Override
    public void brincar() {
        this.felicidade +=2;
    }
}