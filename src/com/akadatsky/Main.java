package com.galinachitakV.Fruits2701.src.com.akadatsky;

public class Main {

    /*
        Lemon: 24.90, 198г
        Banana: 31.30, 198г (again 198)
        RedApple: 14.90, 228г
        GreenApple: 23.90, 232г
     */
    public static void main(String[] args) {

        Fruit lemon = new Fruit(Fruit.FruitType.LEMON, Fruit.Color.YELLOW, 24.90, 198);
        Fruit banana = new Fruit(Fruit.FruitType.LEMON, Fruit.Color.YELLOW, 24.90, 190);

        CashMachine cashMachine = new CashMachine();
        cashMachine.add(lemon);
        cashMachine.add(banana);
        cashMachine.printBill();

    }
}
