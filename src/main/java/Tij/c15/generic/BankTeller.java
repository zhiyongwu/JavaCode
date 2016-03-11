package Tij.c15.generic;

import Tij.c15.generic.gene.Generator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class BankTeller {
    public static void serve(Customer c,Teller t){
        System.out.println(t + " serve " + t);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> queue = new LinkedList<>();

    }
}

class Customer {
    private static long counter = 0;
    private final long id = counter++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer " + id;
    }

    public Generator<Customer> generator(){
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller{
    private static long counter = 0;
    private final long id = counter++;
    private Teller(){}

    @Override
    public String toString() {
        return "Teller " + id;
    }

    public static Generator<Teller> generator(){
        return new Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }
}
