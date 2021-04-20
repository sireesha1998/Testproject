package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Batsman bts = new Batsman(18, "Virat", 120, 720);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("record.dat"));
		oos.writeObject(bts);
	}
}
