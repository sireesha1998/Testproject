package day6;

 
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;

	public class ObjectOutputStreamthreebatsman{
		public static void main(String[] args) throws FileNotFoundException, IOException {
			Batsman bts1 = new Batsman(10, "Virat", 220, 720, 45);
			Batsman bts2 = new Batsman(12, "Dhoni", 500, 200, 458);
			Batsman bts3 = new Batsman(14, "Rohit", 30, 420, 628);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
			oos.writeObject(bts1);
			oos.writeObject(bts2);
			oos.writeObject(bts3);
		}
	}


