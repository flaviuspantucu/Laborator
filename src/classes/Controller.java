package classes;
import java.util.ArrayList;

public class Controller {
    public static int contor = 0;

    public static class Carte implements Comparable<Carte> {
        private String titlu, autor;
        private int an_aparitie, nr_pagini;

        public Carte(String title, String author, int year, int number) {
            this.titlu = title;
            this.autor = author;
            this.an_aparitie = year;
            this.nr_pagini = number;
        }
        public int getPages(){
            return this.nr_pagini;
        }
        @Override
        public String toString() {
            String out = this.titlu + " - " + this.autor + " publicata in anul " + String.valueOf(this.an_aparitie);
            return out;
        }
        @Override
        public int compareTo(Carte o)
        {
           if(this.nr_pagini > o.nr_pagini){
                return 1;
           }
           else if(this.nr_pagini < o.nr_pagini) {
               return -1;
           }
           else{
               return 0;
           }
        }
    }

    public static class Biblioteca {
        private ArrayList<Carte> list;
        public Biblioteca(){
            list = new ArrayList<Carte>();
        }
        @Override
        public String toString() {
            StringBuilder out = new StringBuilder();
            for (Carte carte : list) {
                out.append(carte.titlu + carte.autor + "publicata in anul" + String.valueOf(carte.an_aparitie) + "\n");
            }
            return out.toString();
        }

        public void addCarte(Carte carte) {
            this.list.add(carte);
        }

        public void addCarte(Biblioteca biblioteca) {
            for (Carte carte : biblioteca.list) {
                this.addCarte(carte);
            }
        }
    }

    public interface Task {
        public void execute();
    }

    public static class OutTask implements Task{
        String message;
        public OutTask(String message) {
            this.message = message;
        }
        public void execute(){
            System.out.println(this.message);
        }
    }

    public static class RandomOutTask implements Task{
        double number;
        public RandomOutTask() {
            this.number  = Math.random();
        }
        public void execute(){
            System.out.println(this.number);
        }
    }

    public static class CounterOutTask implements Task{

        public void execute(){
            contor++;
            System.out.println(contor);
        }
    }

    public static class MyThread extends Thread{
        public void run(){
            Thread thread = Thread.currentThread();
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
        }
    }
    public static class MyRunning extends Thread{
        public void run(){
            Thread thread = Thread.currentThread();
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
        }
    }
}


