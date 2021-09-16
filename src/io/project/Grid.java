package io.project;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Grid {

    private int gridSize;
    private char[][] contents = new char[gridSize][gridSize];

    public Grid(int gridSize) {
        this.gridSize = gridSize;
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                contents[i][j] = '_';
            }
        }
    }

    public void fillGrid(List<String> words) {
        for (String word: words) {
            int x = ThreadLocalRandom.current().nextInt(0, gridSize);
            int y = ThreadLocalRandom.current().nextInt(0, gridSize);
            contents[x][y] = word.charAt(0);
        }
    }

    public void displayGrid() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                System.out.print(contents[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
