package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
	StringChecker helper1  = new StringChecker() ; 
	
	
	
	
   @Test
   public void testString() {	  
      assertEquals(true,helper1.areFirstAndLast2CharsTheSame("AABBAA"));
      assertEquals(true,helper1.areFirstAndLast2CharsTheSame("CABCA"));
      assertEquals(false,helper1.areFirstAndLast2CharsTheSame("DLALDD"));
      assertEquals(true,helper1.areFirstAndLast2CharsTheSame("ababab"));
      assertEquals(true,helper1.areFirstAndLast2CharsTheSame("azaz"));
      assertEquals(false,helper1.areFirstAndLast2CharsTheSame("here"));
      assertEquals(false,helper1.areFirstAndLast2CharsTheSame("abcabc"));
      assertEquals(false,helper1.areFirstAndLast2CharsTheSame("rbcdbcdr"));
      assertEquals(false,helper1.areFirstAndLast2CharsTheSame("MyName"));
      assertEquals(true,helper1.areFirstAndLast2CharsTheSame("davfvfvfvsda"));
      assertEquals(false,helper1.areFirstAndLast2CharsTheSame("Egypt"));
   }
}