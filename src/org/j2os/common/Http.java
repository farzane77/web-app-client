package org.j2os.common;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Http {
    private Http() {
    }

    public static String get(String request) throws Exception {
        URL url = new URL(request);
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        int ascii = inputStream.read();
        String content = "";
        while (ascii != -1) {
            content += (char) ascii;
            ascii = inputStream.read();
        }
        inputStream.close();
        return content;
    }
}
