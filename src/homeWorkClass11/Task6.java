package homeWorkClass11;

public class Task6 {
    /*Create 2D array of countries: north america countries, south america countries,
    europe countries, asian countries, african countries.
    Then print all values from that array using 2 different loops and calculate how many total countries been stored*/
    public static void main(String[] args) {

        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                {"Ukraine", "Germany", "France", "Italy", "Poland", "Portugal", "Spain"},
                {"China", "Japan", "India", "Philippines", "Pakistan"},
                {"Nigeria", "Egypt", "Kenya", "South Africa", "Sudan", "Morocco"}};
        int sumCountries1=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++){
                System.out.print(countries[i][j]+" ");
                sumCountries1++;
            }
            System.out.println();
        }
        System.out.println(sumCountries1+" been stored in the array");
        System.out.println("********************************");
        int sumCountries2=0;
        for(String[]arr:countries){
            for(String x:arr){
                System.out.print(x+" ");
                sumCountries2++;
            }
        }
        System.out.println();
        System.out.println(sumCountries2+" been stored in the array");
    }
}