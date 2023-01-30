package review5;

public class PrimeNum {
    public static void main(String[] args) {
        //write program to check a given number is prime or not?
        int given=3;
        boolean isPrime=true;
        if(given>1) {
            for (int i = 2; i < given; i++) {
                if (given % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        else{isPrime=false;
        }
        System.out.println(isPrime);
        }
    }

