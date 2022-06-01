package by.itstep.vikvik.javalessons.lesson41;

import java.io.*;

public class BinaryWorker {
    public static void write(String fileName) {
        OutputStream stream = null;

        try {
            stream = new FileOutputStream(fileName);

            for (int i = 0; i < 1000; i++) {
                stream.write(i);
            }

            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }
    }

    public static String read(String fileName) {
        InputStream stream = null;
        StringBuilder builder = new StringBuilder();

        try {
            stream = new FileInputStream(fileName);

            if (stream.available() != 0) {
                int temp;
                while ((temp = stream.read()) != -1) {
                    builder.append(temp).append(" ");
                }
            }

        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }

        return "" + builder;
    }
}