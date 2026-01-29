import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Exception40
{
	static void connectToFile() throws FileNotFoundException, IOException
	{
			FileInputStream fis = new FileInputStream("D:\\java\\Exception\\SourceFile.txt");
			fis.read();
	}
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		System.out.println("Start");
		connectToFile();
		System.out.println("Stop");
	}
}

// public FileInputStream(String pathofFile)
// public int read() throws java.io.IOException;          

// The "throws" keyword can generate different types of exception as well as, it can also throw multiple exception at one point of time.
