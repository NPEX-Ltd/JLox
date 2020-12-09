package np.jlox.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LoxInterpreter {
	public void RunFile(String filePath) throws IOException {
		BufferedReader reader = new BufferedReader(
				new FileReader(filePath)
		);
		
		String line = "";
		StringBuffer buffer = new StringBuffer();
		while((line = reader.readLine()) != null) {
			buffer.append(line+"\n");
		}		
		
		reader.close();
		
		LoxScanner scanner = new LoxScanner();
		List<Token> scanner.ScanForTokens(buffer.toString());
	}
	
	public void Exec(String line) {
		
	}
	
} 
