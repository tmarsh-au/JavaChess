/**
 *  Created by Thomas Marsh on 23/10/2019
 *  Using this tutorial -> https://www.youtube.com/playlist?list=PLOJzCFLZdG4zk5d-1_ah2B4kqZSeIlWtt
 */

package com.chess.engine;

import com.chess.engine.board.Board;

public class JChess {

    public static void main(String[] args) {
        Board board = Board.createStandardBoard();

        System.out.println(board);
    }
}
