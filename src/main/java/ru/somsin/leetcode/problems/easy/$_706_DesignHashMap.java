package ru.somsin.leetcode.problems.easy;

public class $_706_DesignHashMap {
    class MyHashMap {
        private Integer[] data;

        public MyHashMap() {
            data = new Integer[1000001];
        }

        public void put(int key, int value) {
            data[key] = value;
        }

        public int get(int key) {
            return data[key] == null ? -1 : data[key];
        }

        public void remove(int key) {
            data[key] = null;
        }
    }
}
