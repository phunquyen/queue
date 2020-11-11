package com.xtel.training.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main3 {
    public static void main(String[] args) {
        Queue<Integer> numbers = new ArrayDeque<>();
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(4);
        System.out.println("Queue " + numbers);

        int accessNumber = numbers.peek();
        System.out.println("Truy cap phan tu: " + accessNumber);
        int removeNumber = numbers.poll();
        System.out.println("Loai bo phan tu: " + removeNumber);
        System.out.println("Cap nhat queue" + numbers);
    }
}
