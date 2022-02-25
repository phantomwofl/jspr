package ru.netology;

import java.io.BufferedOutputStream;

public class Main {

    public static void main(String[] args) {

        final var server = new Server();
        server.start();

        server.addHandler("GET", "/messages", new Handler() {
            @Override
            public void handle(Request request, BufferedOutputStream responseStream) {
                //todo
            }
        });

        server.addHandler("POST", "/messages", new Handler() {
            @Override
            public void handle(Request request, BufferedOutputStream responseStream) {
                //todo
            }
        });

        }
}
