package com.umiitkose.structural.flyweight.tetris;

public class Main {
    //https://metinalniacik.medium.com/flyweight-design-pattern-tasar%C4%B1m-%C3%B6r%C3%BCnt%C3%BCs%C3%BC-3d04eb2d2251 --> Örneğinden kod alınmıştır.
    //https://refactoring.guru/design-patterns/flyweight/java/example
    public static void main(String[] args) {

        Piece piece = null;

        for (int i = 1; i < 100000; i++) {

            int a = i % 3;

            if (a == 0) {
                piece = PieceFactory.getPiece("I");
                piece.create("red", i * 3, true);
            } else if (a == 1) {
                piece = PieceFactory.getPiece("T");
                piece.create("green", i * 3, true);
            }
        }
    }
}
