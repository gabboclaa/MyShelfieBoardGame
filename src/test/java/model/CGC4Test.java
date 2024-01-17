package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CGC4Test {

    CommonGoalCard cgc = new CommonGoalCard(4, 4);

    @Test
    public void checkGoal_empty() {

        Tile matr[][]=
                {{Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   },
                {Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   },
                {Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   },
                {Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   },
                {Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   },
                {Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   }};

        assertFalse(cgc.checkGoal(matr));

    }

    @Test
    void checkGoal_1() {

        Tile matr[][]=
                {{Tile.BLUE   ,Tile.BLUE   ,Tile.WHITE   ,Tile.WHITE   ,Tile.EMPTY   },
                {Tile.BLUE   ,Tile.BLUE   ,Tile.WHITE   ,Tile.WHITE   ,Tile.EMPTY   },
                {Tile.GREEN   ,Tile.GREEN   ,Tile.PINK   ,Tile.PINK   ,Tile.EMPTY   },
                {Tile.GREEN   ,Tile.GREEN   ,Tile.PINK   ,Tile.PINK   ,Tile.EMPTY   },
                {Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   },
                {Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   }};

        assertFalse(cgc.checkGoal(matr));
    }

    @Test
    void checkGoal_2() {

        Tile matr[][]=
                {{Tile.BLUE   ,Tile.BLUE   ,Tile.WHITE   ,Tile.WHITE   ,Tile.EMPTY   },
                {Tile.BLUE   ,Tile.BLUE   ,Tile.WHITE   ,Tile.WHITE   ,Tile.EMPTY   },
                {Tile.GREEN   ,Tile.GREEN   ,Tile.PINK   ,Tile.PINK   ,Tile.EMPTY   },
                {Tile.GREEN   ,Tile.GREEN   ,Tile.PINK   ,Tile.PINK   ,Tile.EMPTY   },
                {Tile.BLUE   ,Tile.BLUE   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   },
                {Tile.BLUE   ,Tile.BLUE   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   }};

        assertTrue(cgc.checkGoal(matr));
    }

    @Test
    void checkGoal_3() {

        Tile matr[][]=
                {{Tile.BLUE   ,Tile.BLUE   ,Tile.WHITE   ,Tile.WHITE   ,Tile.EMPTY   },
                {Tile.BLUE   ,Tile.BLUE   ,Tile.WHITE   ,Tile.WHITE   ,Tile.EMPTY   },
                {Tile.BLUE   ,Tile.BLUE   ,Tile.PINK   ,Tile.PINK   ,Tile.EMPTY   },
                {Tile.GREEN   ,Tile.GREEN   ,Tile.PINK   ,Tile.PINK   ,Tile.EMPTY   },
                {Tile.BLUE   ,Tile.BLUE   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   },
                {Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   ,Tile.EMPTY   }};

        assertFalse(cgc.checkGoal(matr));
    }
}