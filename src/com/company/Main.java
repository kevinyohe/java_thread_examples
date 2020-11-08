package com.company;


public class Main {

    public static void main(String[] args) {
	    (new BlinkyThingy()).start();
	    (new BlinkyThingy()).start();
	    (new BlinkyThingy()).start();
	    System.out.println("started three blinky thingies");
    }


    public static class BlinkyThingy extends Thread{
        public void run(){
            int min = 100;
            int max = 2500;
            double a = Math.random()*(max-min-1)+min;
            try {
                System.out.println("Sleeping for " + a + " ms...");
                sleep((long)a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from thread");
        }
    }
}
