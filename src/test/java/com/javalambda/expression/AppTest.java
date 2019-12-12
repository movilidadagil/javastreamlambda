package com.javalambda.expression;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldLearnLambda(){
        // count the number of names starting with alphabet A in list

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Abhijeet");
        nombres.add("Don");
        nombres.add("Ali");
        nombres.add("Alexia");
        nombres.add("Meryem Duru");
        nombres.add("Berrin");
        nombres.add("Adam");
        int count=0;
        for(int i=0;i<nombres.size();i++){
            String actual = nombres.get(i);
            if(actual.startsWith("A")){
                count++;
            }

        }

        System.out.println(count);
    }

    @Test
    public void streamFilter(){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Abhijeet");
        nombres.add("Don");
        nombres.add("Ali");
        nombres.add("Alexia");
        nombres.add("Meryem Duru");
        nombres.add("Berrin");
        nombres.add("Adam");
        Long count=nombres.stream().filter(s-> s.startsWith("A")).count();
        System.out.println(count);


    }

    @Test
    public void streamCollection(){

       Long count= Stream.of("Hasan","Meryem Duru","Berrin","Abhii","Ali").filter(s->
        {
            s.startsWith("A");
            return true;
        }).count();

        System.out.println(count);
    }
    @Test
    public void streamForEachAction(){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Hasan");
        nombres.add("Meryem Duru");
        nombres.add("Berrin");
        nombres.add("Abhii");
        nombres.add("Ali");

        nombres.stream().filter(s->s.startsWith("A")).forEach(s-> System.out.println(s));


    }

    @Test
    public void streamMap(){
        // son harfi i olan isimleri uppercase olarak ekrana yazdırma
        Stream.of("Hasan","Meryem Duru","Berrin","Abhii","Ali").
                filter(s -> s.endsWith("i")).map(s->s.toUpperCase())
                .forEach(s-> System.out.println(s));
    }

    @Test
    public void streamSortedMap(){
        // son harfi i olan isimleri uppercase olarak ekrana yazdırma
        Stream.of("Hasan","Meryem Duru","Berrin","Abhii","Ali").
                filter(s -> s.endsWith("i")).sorted().map(s->s.toUpperCase())
                .forEach(s-> System.out.println(s));
    }
}
