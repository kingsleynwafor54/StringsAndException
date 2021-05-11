import ChapterFive.GlobalWarmingFactsQuiz;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlobalWarmingFactsQuizTest {
    GlobalWarmingFactsQuiz globalWarmingFactsQuiz;

    @BeforeEach
    void setUp() {
       globalWarmingFactsQuiz =new GlobalWarmingFactsQuiz();
    }

    @AfterEach
    void tearDown() {
       globalWarmingFactsQuiz=null;

    }
@Test
    void setGlobalWarmingFactsQuizMethodTest(){
      //  assertEquals("A",globalWarmingFactsQui z.askQuestions(1));
}

@Test
    void globalWarmingFactsQuizCheckForPerformance(){
        assertEquals("Excellent",GlobalWarmingFactsQuiz.score(5));
        assertEquals("Very Good",GlobalWarmingFactsQuiz.score(4));
        assertEquals("nice try",GlobalWarmingFactsQuiz.score(3));
        assertEquals("You need to speed up on your current-affairs",GlobalWarmingFactsQuiz.score(2));
}


}
