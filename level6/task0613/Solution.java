package level6.task0613;

public class Solution {
    public static void main(String[] args) {
        Cat[] cat = new Cat[10];
        for (int i = 0; i < 10; i++) {
            cat[i] = new Cat();
        }
        System.out.println("Кол-во котов: " + Cat.catCount);
    }

    public static class Cat {
        public static int catCount;

        public Cat() {
            Cat.catCount++;
        }
    }
}
