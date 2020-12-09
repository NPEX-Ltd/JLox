package np.jlox.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		LoxInterpreter interpreter = new LoxInterpreter();
		if(args.length > 0) {
			interpreter.RunFile(args[0]);
		} else {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			while((line = reader.readLine()) != null) {
				interpreter.Exec(line);			}
		}
	}

}
