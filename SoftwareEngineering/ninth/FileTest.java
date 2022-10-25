package ninth;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws FileNotFoundException {
            String input = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                input = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("你输入的是: " + input);
            RandomAccessFile raf = new RandomAccessFile("out.txt", "rw");
            FileOutputStream fos = new FileOutputStream("out.txt");
            byte[] inputByte = input.getBytes();
            try {
                fos.write(inputByte);
                fos.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        FileInputStream fis = new FileInputStream("out.txt");
            int result = -1;
            try {
                System.out.println("文件中的内容: ");
                while ((result = fis.read()) != -1) {
                    System.out.print((char)result);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }
    }
