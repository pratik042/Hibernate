
package demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class socks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
