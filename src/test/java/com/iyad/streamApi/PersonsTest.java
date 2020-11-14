package com.iyad.streamApi;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

import org.junit.Test;

public class PersonsTest {

	@Test
	public void AnswerTest() {
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("Jan","Veenendaal", LocalDate.of(1992,Month.OCTOBER,5)));
		persons.add(new Person("Willem","Amsterdam", LocalDate.of(2012, Month.APRIL, 29)));
		persons.add(new Person("Marie","Ede",LocalDate.now().minusYears(19)));
		
		Stream<String> user = Answer.Filter(persons);
		

		String [] correct = {"Marie","Jan"};
		Iterator<String> ui = user.iterator();
		int i;
		for (i = 0; i < correct.length && ui.hasNext(); i++ )
		{
			assertEquals(correct[i],ui.next());
		}
		assertEquals(i,correct.length);
		assertFalse(ui.hasNext());
		
	}

}
