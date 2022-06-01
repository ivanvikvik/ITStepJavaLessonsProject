package by.itstep.vikvik.javalessons.lesson41;

import java.io.*;

public class CharWorker {
    public static void write(String fileName) {

        try (Writer stream = new FileWriter(fileName)) {
            for (int i = 0; i < 1000; i++) {
                stream.write(i);
            }

            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static String read(String fileName) {
        StringBuilder builder = new StringBuilder();

        try(Reader stream = new FileReader(fileName)) {
            if (stream.ready()) {
                int temp;
                while ((temp = stream.read()) != -1) {
                    builder.append((char) temp).append(" ");
                }
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }

        return "" + builder;
    }
}