package com.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Helper {
    /**
     * get Input from console
     * @return number
     */
    public static int getInputNumber(){
        System.out.print("Enter number:");
        int N = Lib.scanner.nextInt();
        Lib.scanner.nextLine();
        return N;
    }

    /**
     * check if number is Palindrome
     * @param n number
     * @return whether number is palindrome
     */
    public static boolean isPalindrome(int n){
        int revert = 0;
        int copy = n;
        while (copy>0){
            revert = revert*10 + copy % 10;
            copy= copy/10;
        }
        return revert == n;
    }

    /**
     * check if number is prime
     * @param n number
     * @return whether number is prime
     */
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    /**
     * check if number is prime
     * @param numbers array number
     * @return whether number is prime
     */
    public static List<Boolean> isPrime(int[] numbers){
        List<Boolean> results = new ArrayList<>();

        for (int n: numbers ) {
            results.add(Helper.isPrime(n));
        }

        return results;
    }

    /**
     * return written form of number
     * @param n Integer
     * @return string
     */
    public static String getNumberString(int n){
        HashMap<Integer, String> numberMap = new HashMap<>();
        numberMap.put(1, "Một");
        numberMap.put(2, "Hai");
        numberMap.put(3, "Ba");
        numberMap.put(4, "Bốn");
        numberMap.put(5, "Năm");
        numberMap.put(6, "Sáu");
        numberMap.put(7, "Bảy");
        numberMap.put(8, "Tám");
        numberMap.put(9, "Chin");

        String result="";
        while (n>0){
            result = numberMap.get(n%10).concat(" ").concat(result);
            n= n/10;
        }
        return result;
    }

    /**
     * get all prime less than N
     * @return List of prime
     */
    public static List<Integer> getPrimeLessThan(int n){
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (Helper.isPrime(i))
                results.add(i);
        }

        return  results;
    }

    /**
     * Calculate sum of first N odd number
     * @param n number N
     * @return int sum of N odd number
     */
    public static int sumOfOdd(int n){
        if (n==0)
        {
            return 0;
        }
        if (n==1){
            return 1;
        }
        return n*2-1 + sumOfOdd(n-1);
    }

    /**
     * print max, min, sum and avg of series number
     */
    public static void printNumbersAttribute(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum =0;
        int n=0;
        int number;

        while (true){
            number = Lib.scanner.nextInt();
            if (number == 0) {
                break;
            }
            max = Math.max(max, number);
            min = Math.min(min, number);
            sum += number;
            n++;
        }

        System.out.println("Max: "+max+"\nMin: "+min+"\nSum: "+sum+ "\nAVG: "+ ((double)sum/(double)n));
        Lib.scanner.nextLine();
    }

    /**
     * return calculate string of byte
     * @param n
     * @return calculated byte string
     */
    public static String getCalculatedBytes(int n){
        int byteN = n % 1024;
        n = n /1024;
        String result = byteN+ " bytes";

        int kb = n % 1024;
        n = n /1024;
        if (kb !=0){
            result = kb + " kilobyte " + result;
        }

        int mb = n % 1024;
        n = n /1024;
        if (mb !=0){
            result = mb+ " Megabyte "+ result;
        }

        int gb = n % 1024;
        if (gb !=0){
            result = gb + " Gigabyte "+ result;
        }

        return result;
    }

    /**
     * return calculate string of seconds
     * @param n
     * @return calculated seconds string
     */
    public static String getCalculatedSeconds(int n){
        int seconds = n % 60;
        n = n /60;
        String result = seconds+ " giây";

        int minutes = n % 60;
        n = n /60;
        if (minutes !=0){
            result = minutes + " phút " + result;
        }

        int hours = n % 60;
        n = n /60;
        if (hours !=0){
            result = hours + " giờ "+ result;
        }

        int days = n % 24;
        n = n/24;
        if (days !=0){
            result = days+ " ngày "+ result;
        }

        int months = n % 30;
        n=n/30;
        if (months !=0){
            result = months+ " tháng "+ result;
        }

        int years = n % 12;
        n=n/12;
        if (years !=0){
            result = years+ " năm "+ result;
        }

        return result;
    }

    /**
     * get sum of S(n) = 1/2 + 1/4 + ... + 1/2n
     * @param n number
     * @return sum of S(n)
     */
    public static double getSN(int n){
        double Sum = 0;
        for(int i = 1; i <= n; i++){
            Sum += 1.0/(2d*i);
        }
        return Sum;
    }

    /**
     * count number of words in string
     * @param input string
     * @return number of words
     */
    public static int countWord(String input){

        String[] words = input.split(" ");
        return words.length;
    }

    /**
     * print analyze chars in string
     * @param input string
     *
     */
    public static void printAnalyzeChar(String input){
        HashMap<Character,Integer> charMap = new HashMap<>();

        Character character;
        for (int i = 0; i < input.length(); i++) {
            character=input.charAt(i);

            charMap.put(character, charMap.containsKey(character) ? charMap.get(character)+1 : 1);
        }

        charMap.forEach((k,v) -> System.out.println("Character "+k+" show up "+v +" times"));
    }

}
