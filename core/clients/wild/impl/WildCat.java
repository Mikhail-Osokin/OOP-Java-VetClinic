package core.clients.wild.impl;

import core.clients.Runnable;
import core.clients.Soundable;
import core.clients.Swimable;
import core.clients.owners.Owner;
import core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable, Soundable, Swimable{
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public int run() {
        System.out.println(CLASS_NAME+ "бегает со скоростью: 15 км/ч");
        return 15;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME+ "мяукает громко: 3 Дб");
        return 3;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME+ "плавает неахтно: 1 км/ч");
        return 1;
    }
}
