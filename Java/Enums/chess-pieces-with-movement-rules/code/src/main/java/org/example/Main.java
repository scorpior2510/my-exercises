package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void printMoves(List<int[]> list) {
        if (list.isEmpty()) {
            System.out.println("Piece Can't Move");
            return;
        }
        for (int[] move : list) {
            System.out.print("(" + move[0] + "," + move[1] + ") ");
        }
        System.out.println();

    }

    private static void testPiecePositions(ChessPiece piece, int posColumn, int posRow) {
        System.out.println("------------");
        System.out.println("Testing Piece " + piece + ", Column: " + posColumn + ", Row: " + posRow);
        List<int[]> list = piece.possiblePositions(posColumn, posRow);
        printMoves(list);
    }

    private static void testAllPiecePositions(ChessPiece piece) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                testPiecePositions(piece, i, j);
            }
        }
    }

    private static void testPiece(ChessPiece piece) {
        System.out.println("-----------------------------------------------");
        System.out.println("Testing Piece: " + piece);
        testAllPiecePositions(piece);
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {
        testPiece(ChessPiece.PAWN);
        testPiece(ChessPiece.KNIGHT);
        testPiece(ChessPiece.KING);
        testPiece(ChessPiece.ROOK);
        testPiece(ChessPiece.QUEEN);
        testPiece(ChessPiece.BISHOP);
    }
}