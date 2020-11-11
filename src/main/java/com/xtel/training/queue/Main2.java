package com.xtel.training.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(4);
        System.out.println("Queue: " + numbers);

        int acessNumber = numbers.peek();
        System.out.println("Truy cap phan tu: " + acessNumber);
        int removedNumber = numbers.poll();
        System.out.println("Loai bo phan tu: " + removedNumber);

        System.out.println("Cap nhat queue " + numbers);
    }
}
