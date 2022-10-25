import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String ip = "127.0.0.1";
        int port = 8888;
        Socket socket = new Socket(ip, port);

        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line = null;
        while ((line = bReader.readLine()) != null) {
            bWriter.write(line);
            bWriter.newLine();
            bWriter.flush();
        }
        socket.shutdownOutput();
        BufferedReader brClient = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        String client = brClient.readLine();
        System.out.println(client);
        bReader.close();
        socket.close();
    }
}