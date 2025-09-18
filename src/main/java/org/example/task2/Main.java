package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(new Item[10]);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(9);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        //Box test

        int length=20;
        int width=22;
        int height=10;

        System.out.println("\n\nBox: length: "+length+", width: "+width+",height: "+height);

        Box box = new Box(length,width,height);
        System.out.println("\t Surface area = "+box.surfaceArea());
        System.out.println("\t Lateral surface area = "+box.lateralSurfaceArea());
        System.out.println("\t Volume = "+box.volume());

        //IntStack test

        IntStack stack = new IntStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\n\nStack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("New top element: " + stack.peek());
        System.out.println("Stack size after pop: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.clean();
        System.out.println("Stack cleared. Size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());

    }

    }