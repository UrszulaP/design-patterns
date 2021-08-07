import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorEverydayDemo {

	public static void main(String args []) throws Exception {
		File file = new File("./output.txt");
		file.createNewFile();

		OutputStream oStream = new FileOutputStream(file);
		
		DataOutputStream doStream = new DataOutputStream(oStream);
		doStream.writeChars("text");
		
		doStream.close();
		oStream.close();
	}
}
// OutputStream - base Decorator, FileOutputStream - instance of a concrete Decorator
// OutputStream - nie wie jak pisać do pliku, FileOutputStream - wie jak pisać do pliku, ale nie wie jak zapisywać dane, DataOutputStream - wie jak zapisywać dane
// DataOutputStream - goes through FileOutputStream - goes through OutputStream
