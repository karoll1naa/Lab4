package tests;

import Main.Game;
import Main.GameObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class canMoveTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testCanMoveWhenNoCollisions() {
        GameObject obj = new GameObject(50, 100);
        Game.objects.clear();
        Game.objects.add(obj);

        boolean canMove = obj.canMove();
        assertTrue(canMove);
    }

    @Test
    public void testCanMoveWhenCollisions() {
        GameObject obj1 = new GameObject(50, 50);
        GameObject obj2 = new GameObject(50, 50);
        Game.objects.clear();
        Game.objects.add(obj1);
        Game.objects.add(obj2);

        boolean canMove = obj1.canMove();

        assertFalse(canMove);
    }
}
