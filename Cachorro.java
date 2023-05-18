public class Cachorro extends Mamifero {
    @Override
    public void dormir() {
        this.sono++;
        this.felicidade-= 1/2;
    }
    @Override
    public void comer() {
        this.fome+=2;
        this.peso++;
    }
    @Override
    public void fazerBarulho() {
        System.out.println("AU AU AU");
    }
    @Override
    public void brincar() {
        this.felicidade +=5;
        this.fazerBarulho();
    }

}