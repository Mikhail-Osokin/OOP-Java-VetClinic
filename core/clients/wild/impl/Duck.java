package core.clients.wild.impl;

import java.time.LocalDate;

import core.clients.Flyable;
import core.clients.Runnable;
import core.clients.Soundable;
import core.clients.Swimable;
import core.clients.owners.Owner;
import core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable, Swimable, Soundable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 15 км/ч");
        return 15;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ходит со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "охотно плавает со скоростью: 7 км/ч");
        return 7;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + "громко крякает: 2 Дб");
        return 2;
    }
}
