package org.example;

import java.util.ArrayList;
import java.util.List;

public enum ChessPiece {
    KING,
    QUEEN,
    ROOK,
    BISHOP,
    KNIGHT,
    PAWN;

    private static final int boardDimension = 8;

    private static int[][] createCleanBoard() {
        return new int[boardDimension][boardDimension];
    }

    private static boolean validRowOrColumn(int num) {
        return num >= 0 && num <= boardDimension - 1;
    }

    private static List<int[]> positionsByBoard(int[][] board) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < boardDimension; i++) {
            for (int j = 0; j < boardDimension; j++) {
                int[] currPos = new int[2];
                if (board[i][j] == 1) {
                    currPos[0] = j + 1;
                    currPos[1] = i + 1;
                    list.add(currPos);
                }
            }
        }
        return list;
    }

    public List<int[]> possiblePositions(int column, int row) {
        int[][] board = createCleanBoard();
        int boardColumn = column - 1;
        int boardRow = row - 1;
        switch (this) {
            case QUEEN:
                updateBoardColumnPositions(board, boardColumn);
                updateBoardRowPositions(board, boardRow);
                updateBoardDiagonalsPositions(board, boardColumn, boardRow);
                break;
            case ROOK:
                updateBoardColumnPositions(board, boardColumn);
                updateBoardRowPositions(board, boardRow);
                break;
            case BISHOP:
                updateBoardDiagonalsPositions(board, boardColumn, boardRow);
                break;
            case PAWN:
                updateBoardOneStepForward(board, boardColumn, boardRow);
                break;
            case KING:
                updateBoardOneStepAllSides(board, boardColumn, boardRow);
                break;
            case KNIGHT:
                updateBoardKnightPositions(board, boardColumn, boardRow);
                break;
            default:
                System.out.println("Unsupported Constant");
                break;
        }
        board[boardRow][boardColumn] = 0;
        return positionsByBoard(board);
    }

    private static void updateBoardColumnPositions(int[][] board, int column) {
        for (int i = 0; i < boardDimension; i++) {
            board[i][column] = 1;
        }
    }

    private static void updateBoardRowPositions(int[][] board, int row) {
        for (int i = 0; i < boardDimension; i++) {
            board[row][i] = 1;
        }
    }

    private static void updateBoardDiagonalsPositions(int[][] board, int column, int row) {
        for (int i = column + 1, j = 1; i < boardDimension; i++, j++) {
            if (validRowOrColumn(row + j))
                board[row + j][i] = 1;
            if (validRowOrColumn(row - j))
                board[row - j][i] = 1;
        }
        for (int i = column - 1, j = 1; i >= 1; i--, j++) {
            if (validRowOrColumn(row + j))
                board[row + j][i] = 1;
            if (validRowOrColumn(row - j))
                board[row - j][i] = 1;
        }
    }

    private static void updateBoardOneStepForward(int[][] board, int column, int row) {
        if (validRowOrColumn(row + 1))
            board[row + 1][column] = 1;
    }

    private static void updateBoardOneStepAllSides(int[][] board, int column, int row) {

        if (validRowOrColumn(row + 1))
            board[row + 1][column] = 1;
        if (validRowOrColumn(row - 1))
            board[row - 1][column] = 1;
        if (validRowOrColumn(column + 1))
            board[row][column + 1] = 1;
        if (validRowOrColumn(column - 1))
            board[row][column - 1] = 1;

        if (validRowOrColumn(column - 1) && validRowOrColumn(row - 1))
            board[row - 1][column - 1] = 1;
        if (validRowOrColumn(column - 1) && validRowOrColumn(row + 1))
            board[row + 1][column - 1] = 1;
        if (validRowOrColumn(column + 1) && validRowOrColumn(row - 1))
            board[row - 1][column + 1] = 1;
        if (validRowOrColumn(column + 1) && validRowOrColumn(row + 1))
            board[row + 1][column + 1] = 1;

    }

    private static void updateBoardKnightPositions(int[][] board, int column, int row) {

        int curColumn;
        int curRow;

        curColumn = column + 2;
        curRow = row + 1;
        if (validRowOrColumn(curRow) && validRowOrColumn(curColumn)) {
            board[curRow][curColumn] = 1;
        }

        curColumn = column + 2;
        curRow = row - 1;
        if (validRowOrColumn(curRow) && validRowOrColumn(curColumn)) {
            board[curRow][curColumn] = 1;
        }

        curColumn = column - 2;
        curRow = row + 1;
        if (validRowOrColumn(curRow) && validRowOrColumn(curColumn)) {
            board[curRow][curColumn] = 1;
        }

        curColumn = column - 2;
        curRow = row - 1;
        if (validRowOrColumn(curRow) && validRowOrColumn(curColumn)) {
            board[curRow][curColumn] = 1;
        }

        curColumn = column + 1;
        curRow = row + 2;
        if (validRowOrColumn(curRow) && validRowOrColumn(curColumn)) {
            board[curRow][curColumn] = 1;
        }

        curColumn = column - 1;
        curRow = row + 2;
        if (validRowOrColumn(curRow) && validRowOrColumn(curColumn)) {
            board[curRow][curColumn] = 1;
        }

        curColumn = column + 1;
        curRow = row - 2;
        if (validRowOrColumn(curRow) && validRowOrColumn(curColumn)) {
            board[curRow][curColumn] = 1;
        }

        curColumn = column - 1;
        curRow = row - 2;
        if (validRowOrColumn(curRow) && validRowOrColumn(curColumn)) {
            board[curRow][curColumn] = 1;
        }

    }

}
