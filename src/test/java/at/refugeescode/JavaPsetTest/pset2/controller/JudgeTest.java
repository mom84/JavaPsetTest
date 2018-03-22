 package at.refugeescode.JavaPsetTest.pset2.controller;
import at.refugeescode.JavaPsetTest.pset2.model.Result;
import at.refugeescode.JavaPsetTest.pset2.model.move.Move;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;


public class JudgeTest {
    private Judge judge = new Judge();

    private Move move1;
    private Move move2;

    @Before
    public void before(){
        move1 = Mockito.mock(Move.class);
        move2 = Mockito.mock(Move.class);
    }

    @Test
    public void testMove1wins() {

        Mockito.when(move1.defeats(move2)).thenReturn(true);
        Result result = judge.getResult(move1, move2);
        assertEquals("Player 1 wins",result.getWinner());

    }

    @Test
    public void testMove2wins() {
        Mockito.when(move2.defeats(move1)).thenReturn(true);
        Result result = judge.getResult(move1, move2);
        assertEquals("Player 2 wins",result.getWinner());
    }

    @Test
    public void testNobodyWins() {
        Result result = judge.getResult(move1, move2);
        assertEquals("Nobody wins",result.getWinner());
    }

}