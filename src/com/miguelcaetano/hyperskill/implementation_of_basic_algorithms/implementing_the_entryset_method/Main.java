package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.implementing_the_entryset_method;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfQueries = input.nextInt();
        HashTable<String> table = new HashTable<>(numberOfQueries);
        for (int i = 0; i < numberOfQueries; i++) {
            int key = input.nextInt();
            String value = input.nextLine();
            table.put(key, value);
        }

        for (TableEntry<String> entry : table.entrySet()) {
            System.out.printf("%d: %s%n", entry.getKey(), entry.getValue());
        }
    }

    private static class TableEntry<T> {
        private final int key;
        private final T value;

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
            if (key == -1) {
                return false;
            }
            if (table[hash] == null) {
                table[hash] = new TableEntry(key, value);
            } else {
                TableEntry entry = table[hash];
                table[hash] = new TableEntry(key, entry.getValue() + " " + value);
            }
            return true;
        }

        public T get(int key) {
            int hash = findKey(key);
            if (hash == -1) {
                return null;
            }
            return (T) table[hash].getValue();
        }

        public Set<TableEntry<T>> entrySet() {
            HashSet<TableEntry<T>> set = new HashSet<>();
            for (TableEntry tableEntry : table) {
                if (tableEntry != null) {
                    set.add(tableEntry);
                }
            }
            return set;
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

        private void rehash() {
            this.size = this.size * 2;
            this.table = Arrays.copyOf(this.table, this.size);
        }
    }
}
