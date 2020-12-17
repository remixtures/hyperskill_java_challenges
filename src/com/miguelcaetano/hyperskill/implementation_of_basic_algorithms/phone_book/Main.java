package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.phone_book;

import java.util.Scanner;

public class Main {
    private static class TableEntry<T> {
        private final int key;
        private final T value;
        private boolean removed;

        public TableEntry(int key, T value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public T getValue() {
            return value;
        }

        public void remove() {
            removed = true;
        }

        public boolean isRemoved() {
            return removed;
        }
    }

    private static class HashTable<T> {
        private int size;
        private TableEntry[] table;

        public HashTable(int size) {
            this.size = size;
            table = new TableEntry[size];
        }

        public boolean put(int key, T value) {
            int hash = findKey(key);
            if (hash == -1) {
                return false;
            }
            table[hash] = new TableEntry(key, value);
            return true;
        }

        public T get(int key) {
            int hash = findKey(key);
            if (hash == -1) {
                return null;
            }
            TableEntry entry = table[hash];
            if (entry != null && !entry.isRemoved()) {
                return (T) entry.getValue();
            } else {
                return null;
            }
        }

        public void remove(int key) {
            int hash = findKey(key);
            if (hash != -1) {
                table[hash] = null;
            }
        }

        private int findKey(int key) {
            int hash = key % size;
            while (!(table[hash] == null || table[hash].getKey() == key)) {
                hash = (hash + 1) % size;
                if (hash == key % size) {
                    return -1;
                }
            }
            return hash;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        HashTable<String> table = new HashTable<>(size);
        for (int i = 0; i < size; i++) {
            String command = input.next();
            switch (command) {
                case "put":
                    table.put(input.nextInt(), input.next());
                    break;
                case "get":
                    String value = table.get(input.nextInt());
                    System.out.println(value != null ? value : -1);
                    break;
                case "remove":
                    table.remove(input.nextInt());
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}