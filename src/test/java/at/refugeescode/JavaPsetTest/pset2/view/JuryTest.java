package at.refugeescode.JavaPsetTest.pset2.view;
import at.refugeescode.JavaPsetTest.pset2.model.Movement;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest

class JuryTest {


    private Jury jury = new Jury();

    // We fake one move with a "Mockito"
    private Movement move1;
    private Movement move2;

    JuryTest(){
        move1.getMoveName();
        move2.getMoveName();
    }

    @Test
    void TestMove1(){

        String result = jury.sayResult(move1,move2);
        System.out.println(result);
        assertEquals("ggg",result);
    }




}