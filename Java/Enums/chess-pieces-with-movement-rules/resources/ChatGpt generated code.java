package org.example;

import java.util.ArrayList;
import java.util.List;

public enum ChessPiece {
    KING {
        @Override
        public List<int[]> possiblePositions(int column, int row) {
            return generateMoves(column, row, new int[][]{
                    {1, 0}, {-1, 0}, {0, 1}, {0, -1},
                    {1, 1}, {-1, -1}, {1, -1}, {-1, 1}
            }, 1);
        }
    },
    QUEEN {
        @Override
        public List<int[]> possiblePositions(int column, int row) {
            List<int[]> moves = new ArrayList<>();
            moves.addAll(generateMoves(column, row, new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}, 7));
            moves.addAll(generateMoves(column, row, new int[][]{{1, 1}, {-1, -1}, {1, -1}, {-1, 1}}, 7));
            return moves;
        }
    },
    ROOK {
        @Override
        public List<int[]> possiblePositions(int column, int row) {
            return generateMoves(column, row, new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}, 7);
        }
    },
    BISHOP {
        @Override
        public List<int[]> possiblePositions(int column, int row) {
            return generateMoves(column, row, new int[][]{{1, 1}, {-1, -1}, {1, -1}, {-1, 1}}, 7);
        }
    },
    KNIGHT {
        @Override
        public List<int[]> possiblePositions(int column, int row) {
            return generateMoves(column, row, new int[][]{
                    {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                    {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
            }, 1);
        }
    },
    PAWN {
        @Override
        public List<int[]> possiblePositions(int column, int row) {
            List<int[]> moves = new ArrayList<>();
            if (row + 1 <= 8) moves.add(new int[]{column, row + 1});
            return moves;
        }
    };

    public abstract List<int[]> possiblePositions(int column, int row);

    protected List<int[]> generateMoves(int column, int row, int[][] directions, int maxSteps) {
        List<int[]> moves = new ArrayList<>();
        for (int[] direction : directions) {
            for (int step = 1; step <= maxSteps; step++) {
                int newCol = column + step * direction[0];
                int newRow = row + step * direction[1];
                if (newCol >= 1 && newCol <= 8 && newRow >= 1 && newRow <= 8) {
                    moves.add(new int[]{newCol, newRow});
                } else {
                    break; // Stop if out of bounds
                }
            }
        }
        return moves;
    }
}

Example Usage
java
Copy code

public class Main {
    public static void main(String[] args) {
        for (ChessPiece piece : ChessPiece.values()) {
            System.out.println("Moves for " + piece + " from (4,4):");
            for (int[] move : piece.possiblePositions(4, 4)) {
                System.out.println("(" + move[0] + ", " + move[1] + ")");
            }
            System.out.println();
        }
    }
}
