import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8888;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        BufferedWriter bwClient = new BufferedWriter(new FileWriter("a.txt"));
        String line = null;
        while ((line = reader.readLine()) != null) {
            bwClient.write(line);
            bwClient.newLine();
            bwClient.flush();
        }
        BufferedWriter bwServer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();
        bwClient.close();
        socket.close();
    }
}
