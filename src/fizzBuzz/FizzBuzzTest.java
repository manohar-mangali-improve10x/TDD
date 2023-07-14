package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void nothing(){

    }
    /*input 6 divisible by 3 then print fizz
    input 10 divisible by 5 then print buzz
    input 15 divisible by 3 and 5 then print fizzbuzz*/

    @Test
    public void givenSix_returnFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
         String name = fizzBuzz.find(6);
         assertEquals("Fizz",name);
    }

    @Test
    public void givenTen_returnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String name = fizzBuzz.find(10);
        assertEquals("Buzz",name);
    }

    @Test
    public void givenFifteen_returnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String name = fizzBuzz.find(15);
        assertEquals("FizzBuzz",name);
    }
}
