package core.personal;

import core.clients.Animal;

public abstract class Doctor extends Animal {
    public void toHeal(){
        System.out.println(CLASS_NAME + "вылечен");
    }
}
