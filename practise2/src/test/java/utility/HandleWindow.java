package utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import ltim.practise2.BaseTest;

public class HandleWindow extends BaseTest {

	
	//it will add all the window in arralList
	public static ArrayList<String> handleWindow(Set<String> allwindow) {
		ArrayList<String> arr = new ArrayList<String>();
		Iterator<String> it = allwindow.iterator();

		while (it.hasNext()) {
			arr.add(it.next());
		}

		return arr;
	}

	//It will return second window
	public static String handleTwoWindow(Set<String> allwindow, String parentid) {
		for (String abc : allwindow) {
			if (parentid != abc) {
				return abc;
			}
		}

		return null;
	}

	//It will return second window
	public static String handleThreeWindow(Set<String> allwindow, String parentid, String otherWinId) {
		for (String abc : allwindow) {
			if ((parentid != abc) && (otherWinId != abc)) {
				return abc;
			}
		}

		return null;
	}

	public static ArrayList<String> handleWindowUsingArray(Set<String> allwindow) {
		ArrayList<String> arr = new ArrayList<String>(allwindow);
		return arr;
	}

}
