package com.miguelcaetano.hyperskill.implementation_of_basic_algorithms.removing;

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
                rehash();
            }
            hash = findKey(key);
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
            if (hash != -1 && table[hash] != null) {
                table[hash].remove();
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

        private void rehash() {
            TableEntry[] originalTable = table;
            size *= 2;
            table = new TableEntry[size];
            for (TableEntry entry : originalTable) {
                int hash = findKey(entry.getKey());
                table[hash] = entry;
            }
        }

        @Override
        public String toString() {
            StringBuilder tableStringBuilder = new StringBuilder();

            for (int i = 0; i < table.length; i++) {
                if (table[i] == null) {
                    tableStringBuilder.append(i + ": null");
                } else {
                    tableStringBuilder.append(i + ": key=" + table[i].getKey()
                            + ", value=" + table[i].getValue()
                            + ", removed=" + table[i].isRemoved());
                }

                if (i < table.length - 1) {
                    tableStringBuilder.append("\n");
                }
            }

            return tableStringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPuts = scanner.nextInt();
        int numberOfRemoves = scanner.nextInt();
        HashTable<String> hashTable = new HashTable<>(5);
        for (int i = 0; i < numberOfPuts; i++) {
            int key = scanner.nextInt();
            String value = scanner.nextLine().trim();
            hashTable.put(key, value);
        }
        for (int i = 0; i < numberOfRemoves; i++) {
            int key = scanner.nextInt();
            hashTable.remove(key);
        }
        System.out.println(hashTable);
    }
}