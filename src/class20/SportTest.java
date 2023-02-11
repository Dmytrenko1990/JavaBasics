package class20;

public class SportTest {
    public static void main(String[] args) {
        Cricket crick=new Cricket("Cricket","Pakistan","bring helmet");
        crick.display();

        Soccer soc=new Soccer("Soccer","Argentina","Oliver's",12);
        soc.display();
        soc.displayTeam();
    }
}
