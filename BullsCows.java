/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bullsandcows;
import java.util.ArrayList;
import java.util.HashMap;


public class BullsandCows {
	public static int[] getBullsAndCows(String A, String B) {
		int bulls = 0;
		int cows = 0;
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
		A = A.toLowerCase();
		B = B.toLowerCase();
		for(int i=0; i<A.length(); i++) {
			int a = A.charAt(i);
			if(!hm.containsKey(a)) {
				ArrayList<Integer> array = new ArrayList<>();
				array.add(i);
				hm.put(a, array);
			}
			else {
				ArrayList<Integer> array = hm.get(a);
				array.add(i);
				hm.put(a, array);
			}
		}
		for(int i=0; i<B.length(); i++) {
			int b = B.charAt(i);
			if(hm.containsKey(b)) {
				ArrayList<Integer> array = hm.get(b);
				if(array.contains(i)) {
					bulls++;
				}
				else {
					cows++;
				}
			}
		}
		int res[] = new int[2];
		res[0] = bulls;
		res[1] = cows;
		return res;
	}
	public static void main(String args[]) {
		int array[] = getBullsAndCows("Picture", "epic");
		System.out.println("Bulls = " + array[0] + "," + "Cows =" + array[1]);
	}
}
