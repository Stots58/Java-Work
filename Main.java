
/*
Java FizzBuzz program
*/

public class Main {
    public static void main(String[] args) {
    int x = 3;
    int y = 5;
    int z = 15;
    int randNum = 10;
    
    if (x % 15 == 0 ){
        System.out.println("fizzbuzz");}
    else if (x % 5 == 0){
        System.out.println("buzz");}
    else if (x % 3 == 0){
        System.out.println("fizz");}
    else{
        System.out.println("not one of 3,5, or 15.");}
    
/* ------ */
    if (y % 15 == 0 ){
        System.out.println("fizzbuzz");}
    else if (y % 5 == 0){
        System.out.println("buzz");}
    else if (y % 3 == 0){
        System.out.println("fizz");}
    else{
        System.out.println("not one of 3,5, or 15.");}
    
/* ------ */
    if (z % 15 == 0 ){
        System.out.println("fizzbuzz");}
    else if (z % 5 == 0){
        System.out.println("buzz");}
    else if (z % 3 == 0){
        System.out.println("fizz");}
    else{
        System.out.println("not one of 3,5, or 15.");}
    
/* ------ */
    if (randNum % 15 == 0 ){
        System.out.println("fizzbuzz");}
    else if (randNum % 5 == 0){
        System.out.println("buzz");}
    else if (randNum % 3 == 0){
        System.out.println("fizz");}
    else{
        System.out.println("not one of 3,5, or 15.");}
    }
}

