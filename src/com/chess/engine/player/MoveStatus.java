/**
 *  Created by Thomas Marsh on 24/10/2019
 *  Using this tutorial -> https://www.youtube.com/playlist?list=PLOJzCFLZdG4zk5d-1_ah2B4kqZSeIlWtt
 */

package com.chess.engine.player;

public enum MoveStatus {
    DONE {
        @Override
        boolean isDone() {
            return true;
        }
    },
    ILLEGAL_MOVE {
        @Override
        boolean isDone() {
            return false;
        }
    },
    LEAVES_PLAYER_IN_CHECK {
        @Override
        boolean isDone() {
            return false;
        }
    };
    abstract boolean isDone();
}
