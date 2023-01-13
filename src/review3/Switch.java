package review3;

public class Switch {
    public static void main(String[] args) {
        int worldCup=2018;
        switch(worldCup){
            default:
                System.out.println("Winner is unknown");
            case 2022:
                System.out.println("Winner is Argentina");
                break;
            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("Winner is Germany");
                break;
        }
    }
}
