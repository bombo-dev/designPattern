package strategy;


import org.junit.jupiter.api.Test;
import strategy.quiz.Axe;
import strategy.quiz.Character;
import strategy.quiz.King;

public class QuizTest {

    @Test
    public void 퀴즈(){
        Character character = new King();
        character.fight();
        character.setWeapon(new Axe());
        character.fight();
    }
}
