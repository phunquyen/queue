package com.xtel.training.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Queue " + numbers);

        int accessNumber = numbers.element();
        System.out.println("Truy cap phan tu: " + accessNumber);

        int removedNumber = numbers.remove();
        System.out.println("Loai bo phan tu: " + removedNumber);

        System.out.println("Cap nhat queue: " + numbers);
    }
}
