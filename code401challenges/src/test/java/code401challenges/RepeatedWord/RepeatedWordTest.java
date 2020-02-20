package code401challenges.RepeatedWord;

import org.junit.Test;

import static code401challenges.RepeatedWord.RepeatedWord.firstRepeatedWord;
import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void testFirstRepeatedWord() {
        String testString = "Once upon a time, there was a brave princess who...";
        String actual = firstRepeatedWord(testString);
        assertEquals("a", actual);
    }

    @Test
    public void testFirstRepeatedWord_LongerString() {
        String testString = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String actual = firstRepeatedWord(testString);
        assertEquals("it", actual);
    }

    @Test
    public void testFirstRepeatedWord_anotherString() {
        String testString = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String actual = firstRepeatedWord(testString);
        assertEquals("summer", actual);
    }

    @Test
    public void testForNull(){
        String actual = firstRepeatedWord("");
        assertNull(actual);
    }

    @Test
    public void testForOneWordString(){
        String actual = firstRepeatedWord("BOB");
        assertNull(actual);
    }

    @Test
    public void testForNoRepeatedWords(){
        String actual = firstRepeatedWord("BOB is cool");
        assertNull(actual);
    }
}