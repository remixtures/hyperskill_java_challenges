package com.miguelcaetano.hyperskill.object_oriented_programming.christmas_tree;

class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    // create method putTreeTopper()
    public void putTreeTopper(String color) {
        ChristmasTree christmasTree = new ChristmasTree("green");
        ChristmasTree.TreeTopper treeTopper = christmasTree.new TreeTopper("silver");
        treeTopper.sparkle();
    }

    class TreeTopper {

        private String color;

        public TreeTopper(String color) {
            this.color = color;
        }

        // create method sparkle()
        public void sparkle() {
            System.out.println("Sparkling " + this.color + " tree topper looks stunning with "
                    + ChristmasTree.this.color + " Christmas tree!");
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}
