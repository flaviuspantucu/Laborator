import classes.Controller;

import java.util.ArrayList;

public class lab02 {
    public static void main(String[] args) {
        Controller.Carte hp = new Controller.Carte("Harry Potter and the Deathly Hallows", "J.K. Rowlings", 2007, 607);
        Controller.Carte tw = new Controller.Carte("The Witcher", "Andrzej Sapkowski", 2017, 1125);
        Controller.Carte got = new Controller.Carte("Game of thrones", "R.R. Martin", 2015, 755);
        Controller.Biblioteca biblioteca = new Controller.Biblioteca();
        biblioteca.addCarte(hp);
        biblioteca.addCarte(tw);
        biblioteca.addCarte(got);

        ArrayList<Controller.Task> tasks = new ArrayList<Controller.Task>();
        tasks.add(new Controller.OutTask("Salut"));
        tasks.add(new Controller.OutTask("Mesaj"));
        tasks.add(new Controller.RandomOutTask());
        tasks.add(new Controller.CounterOutTask());
        tasks.add(new Controller.CounterOutTask());
        for(Controller.Task j:tasks)
            j.execute();

        Controller.MyThread thread1 = new Controller.MyThread();
        thread1.start();
        Controller.MyRunning thread2 = new Controller.MyRunning();
        thread2.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName);
            }
        }).start();



        Thread thread = Thread.currentThread();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        for (int i = 0; i <10; i++){
            Thread thr = new Thread(String.valueOf(i+1));
            System.out.println("Thread "+ String.valueOf(i+1) +" : ");
        }
    }
}