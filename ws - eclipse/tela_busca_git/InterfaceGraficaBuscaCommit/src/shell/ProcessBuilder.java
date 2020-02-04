package shell;

import java.io.*;

public class ProcessBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessBuilder processBuilder = new ProcessBuilder();
        // Windows
        processBuilder.command("cmd.exe", "cd '\'", "ping -n 3 google.com");

        try {

            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

	private Process start() {
		// TODO Auto-generated method stub
		return null;
	}

	private void command(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

}