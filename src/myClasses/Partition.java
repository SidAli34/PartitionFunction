package myClasses;

import java.util.ArrayList;

public class Partition {

	public static ArrayList<ArrayList<Integer>> partition (ArrayList<Integer> liste, Integer taille){

		ArrayList<ArrayList<Integer>> bigList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		int i=0,j=0,k=0;
		while (i<liste.size())
		{
			list.clear();
			for ( j = 0; j < taille; j++) 
			{
				if((j+i)<liste.size())
					list.add(liste.get(i+j));
			}
			bigList.add((ArrayList<Integer>) list.clone());
			i+=taille;
			k++;
		}

		return bigList;
	}


}