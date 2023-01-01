//import java arraylist
import java.util.ArrayList;


//class is PrimeDirective
class PrimeDirective {

//    method will return true if number is prime
    public boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
//    this method will create an arraylist
//    and accept the array as a parameter and run for each loop on that
//    will call the isPrime method and check for the boolean value
//    if returned value is true then add the integer into an arraylist
//    return the arraylist
    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int number : numbers){
            if (isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }
    public static void main(String[] args){
        PrimeDirective pd = new PrimeDirective();
        int[] numbers =  {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.onlyPrimes(numbers));
    }

}
