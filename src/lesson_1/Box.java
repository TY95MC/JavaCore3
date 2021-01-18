package lesson_1;

import java.util.ArrayList;

public class Box<Fruit> {

    private ArrayList<Fruit> list = new ArrayList<>();
    private float totalWeight;
    public float getTotalWeight() {
        for (int i = 0; i < list.size(); i++) {
            totalWeight = totalWeight; /* + list.get(i).getWeight*/; /*тут мне не хватает смекалки понять
            почему оно не хочет у элемента списка вызвать метод getWeight из классов
             Apple и Orange, наследующих Fruit*/

        }
        return totalWeight;
    }
    public void addSomeFruit(Fruit fruit, int quantity){
        for (int i = 0; i < quantity; i++) {
            list.add(fruit);
        }
    }

//    public Box(T fruit) {
//        this.fruit = fruit;
//    }
//
//    private T fruit;
//
//    public T getFruit() {
//        return fruit;
//    }
}
