package com.firejq.websocket.handshake;

/**
 * @program: MultiClientWebChat
 * @description:
 * @author: syx
 * @create: 2019-07-31 16:31
 **/
public class Test {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("org.springframework.web.servlet.DispatcherServlet");
            System.out.println("hhh");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
