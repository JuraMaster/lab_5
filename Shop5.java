package lab.rob5;

import lab.rob4.Shop4;

public class Shop5 extends Advertisement{

    public Shop4 shop4;

    public Shop5(Shop4 shop4) {
        this.shop4 = shop4;
    }


    @Override
    public void advertisement(int data) {
        if (data < 1) {
            System.out.println("Дотримуйтеся карантиних норм !\n    Потрібно стояти в черзі на 1 метри один від одного");
        } else {
            System.out.println("Не забувайте про карантинні норми !");
        }
    }
}
