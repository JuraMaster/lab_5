package lab.rob5;

import lab.rob4.People4;

public class People5 extends Advertisement{

    public People4 people4;

    public People5(People4 people4) {
        this.people4 = people4;
    }


    @Override
    public void advertisement(int data) {
        if (people4.people3.people2.people.getAge() > 18) {
            System.out.println(" Просимо не забувати про те що потрібно мати 18 років для купівлі алкогоголю ");
        } else {
            System.out.println("Просимо не сідати за руль у стані алкогольного сп'яніння !");
        }
    }
}
