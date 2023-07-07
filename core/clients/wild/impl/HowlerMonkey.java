package core.clients.wild.impl;

import java.time.LocalDate;

import core.clients.Runnable;
import core.clients.Soundable;
import core.clients.Swimable;
import core.clients.owners.Owner;
import core.clients.wild.WildAnimal;

public class HowlerMonkey extends WildAnimal implements Runnable, Soundable, Swimable{
    public HowlerMonkey() {
    }
    public HowlerMonkey(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public int run() {
        System.out.println(CLASS_NAME + "перемещается по земле со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "охотно плавает со скоростью: 3 км/ч");
        return 3;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + "издает громкие звуки: 10 Дб");
        return 10;
    }
}
