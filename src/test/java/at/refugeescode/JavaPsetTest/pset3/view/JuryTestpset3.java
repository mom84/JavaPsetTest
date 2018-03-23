package at.refugeescode.JavaPsetTest.pset3.view;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import at.refugeescode.JavaPsetTest.pset3.model.Move;
import at.refugeescode.JavaPsetTest.pset3.model.Paper;
import at.refugeescode.JavaPsetTest.pset3.model.Rock;
import at.refugeescode.JavaPsetTest.pset3.model.Scissors;
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
//        Mockito.mock(Paper.class);
//        Mockito.mock(Scissors.class);
//        Mockito.mock(Rock.class);

    }

    @Test
    public void testMove1wins() {

        //when( (Mockito.mock(Paper.class).getName()).equalsIgnoreCase(Mockito.mock(Scissors.class).getName())).thenReturn(true);
        when(move1.wins(move2)).thenReturn(true);
        String result = jury.sayResult(move1, move2);
        assertEquals(result,"Player1 Win");

    }

    @Test
    public void testMove2wins() {
        when(move2.wins(move1)).thenReturn(true);
        String result = jury.sayResult(move1, move2);
        assertEquals(result,"Player2 Win");
    }

    @Test
    public void testNobodyWins() {
        when(move1.wins(move2)).thenReturn(false);
        when(move2.wins(move1)).thenReturn(false);
        String result = jury.sayResult(move1, move2);
        assertEquals(result,"No Body Win");
    }

}