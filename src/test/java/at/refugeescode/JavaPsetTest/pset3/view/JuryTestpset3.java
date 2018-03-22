package at.refugeescode.JavaPsetTest.pset3.view;
import static org.junit.Assert.*;
import at.refugeescode.JavaPsetTest.pset3.model.Move;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class JuryTestpset3 {
    Jury jury = new Jury();
    private Move move1;
    private Move move2;

    @Before
    public void before(){
        move1 = Mockito.mock(Move.class);
        move2 = Mockito.mock(Move.class);
    }

    @Test
    public void testMove1wins() {

        Mockito.when(move1.wins(move2)).thenReturn(true);
        String result = jury.sayResult(move1, move2);
        assertEquals(result,"Player1 Win");

    }

    @Test
    public void testMove2wins() {
        Mockito.when(move2.wins(move1)).thenReturn(true);
        String result = jury.sayResult(move1, move2);
        assertEquals(result,"Player2 Win");
    }

    @Test
    public void testNobodyWins() {
        Mockito.when(move1.wins(move2)).thenReturn(false);
        Mockito.when(move2.wins(move1)).thenReturn(false);
        String result = jury.sayResult(move1, move2);
        assertEquals(result,"No Body Win");


    }

}