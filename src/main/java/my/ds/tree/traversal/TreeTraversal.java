/**
 * 
 */
package my.ds.tree.traversal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author tejpal
 *
 */
public class TreeTraversal {

	public static void main(String[] args) throws IOException {
		System.out.println("Howdy!!");
		generateCSV();		
	}
	
	public static void generateCSV() throws IOException {
		FileWriter csWritter = new FileWriter("src/events"+System.currentTimeMillis()+".csv");		
		new Timer().schedule(new TimerTask() {
			public void run () {
				System.exit(0);
			}			
		}, new Date(System.currentTimeMillis()+4000));
		
		int i = 10;
		while(i> 0) {
			csWritter.append("20000,");
			csWritter.append("20000,");
			csWritter.append("\n");
		}
		csWritter.flush();
		csWritter.close();		
	}
}
