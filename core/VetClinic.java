package core;

import core.clients.Animal;
import core.clients.Flyable;
import core.clients.Runnable;
import core.clients.Soundable;
import core.clients.Swimable;

public class VetClinic extends Animal implements Flyable, Runnable, Swimable, Soundable {
    public void sort(){
        run();
        fly();
        swim();
        sound();
        System.out.println(CLASS_NAME + "рассортированы");
    }

    @Override
    public int sound() {
        return 4;
    }

    @Override
    public int swim() {
        return 3;
    }

    @Override
    public int run() {
        return 1;
    }

    @Override
    public int fly() {
        return 2;
    }
}
