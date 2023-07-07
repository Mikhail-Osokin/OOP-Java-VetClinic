package core.clients.wild.impl;

import java.time.LocalDate;

import core.clients.Runnable;
import core.clients.Soundable;
import core.clients.Swimable;
import core.clients.owners.Owner;
import core.clients.wild.WildAnimal;

public class Platypus extends WildAnimal implements Runnable, Soundable, Swimable {
    public Platypus() {
    }
    public Platypus(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ползает медленно со скоростью: 1 км/ч");
        return 1;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "охотно плавает со скоростью: 9 км/ч");
        return 9;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + "издает противные звуки: 4 Дб");
        return 4;
    }
}
