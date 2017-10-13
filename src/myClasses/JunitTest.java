package myClasses;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class JunitTest {

	@Test
	public void testPartition() {
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}
                ArrayList<ArrayList<Integer>> testList = new ArrayList<ArrayList<Integer>> ();
                testList.add(new ArrayList<Integer>(Arrays.asList((Integer)1,(Integer)2)));
                testList.add(new ArrayList<Integer>(Arrays.asList((Integer)3,(Integer)4)));
                testList.add(new ArrayList<Integer>(Arrays.asList((Integer)5)));
		assertEquals(testList, Partition.partition(list, 2));
	}

}



