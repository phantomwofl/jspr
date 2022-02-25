package ru.netology;

import java.io.InputStream;

public class Request {
    String method;
    String header;
    InputStream body;

    Request (String method, String header, InputStream body) {
        this.method = method;
        this.header = header;
        this.body = body;
    }


}
