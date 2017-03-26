package udpcontrol.udpcontrol;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Second implements Runnable {
    private String messageStr;

    Second(String inMessageStr)
    {
        this.messageStr = inMessageStr;
        run();
    }
    public void run() {
        try {
            String messageStr = this.messageStr;
            int server_port = PORT_NUMBER;
            String ipAddress = IP_ADDRESS;
            DatagramSocket s = new DatagramSocket();
            InetAddress local = InetAddress.getByName(ipAddress);
            int msg_length = messageStr.length();
            byte[] message = messageStr.getBytes();
            DatagramPacket p = new DatagramPacket(message, msg_length, local,
                    server_port);
            s.send(p);
        } catch (Exception e) {
        }
    }
}