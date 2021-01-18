package lesson_1;


public class lesson_1 {
    public static void main(String[] args){

        Orange orange = new Orange();
        Apple apple = new Apple();

//        ArrayList<Orange> list1 = new ArrayList();
//        ArrayList<Apple> list2 = new ArrayList<>();
//        Orange orange1 = new Orange();
//        Orange orange2 = new Orange();
//        Orange orange3 = new Orange();
//        Orange orange4 = new Orange();
//
//        Apple apple1 = new Apple();
//        Apple apple2 = new Apple();
//        Apple apple3 = new Apple();
//        Apple apple4 = new Apple();
//
//        list1.add(0, orange1);
//        list1.add(1, orange2);
//        list1.add(2, orange3);
//        list1.add(3, orange4);
//
//        list2.add(0, apple1);
//        list2.add(1, apple2);
//        list2.add(2, apple3);
//        list2.add(3, apple4);
        Box<Orange> box1 = new Box<Orange>();
        Box<Apple> box2 = new Box<Apple>();

        box1.addSomeFruit(orange, 8);
        box2.addSomeFruit(apple, 6);

        System.out.println(box1.getTotalWeight());
        System.out.println(box2.getTotalWeight());
        }
        // с compare не разобрался по нехватке времени, не понял как именно пересыпать из коробки в коробку
    //(копирование из одного ArrayList  в другой?) долго разбирался с применением Arraylist((
}