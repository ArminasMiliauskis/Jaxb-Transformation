package lt.eif.viko.amiliauskis.jaxb.net;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java client class used for client side connection with the server class
 * through sockets. This class has three methods for starting the connection,
 * sending a file request and closing the connection. This class operates
 * through loop back IP address.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class JavaClient {

    private final static String DEFAULT_IP = "127.0.0.1";
    private final static int DEFAULT_PORT = 6666;
    private final static String DEFAULT_XML_PATH = "SolarSystem.xml";

    private Socket clientSocket;
    private OutputStream out;
    private InputStream in;
    private PrintWriter messengerOut;

    /**
     * Starts the client side connection to the server. Opens the Input, Output
     * and PrintWriter Streams
     *
     * @param ip IP address of server
     * @param port servers port
     * @throws IOException Exception occurred while reading/writing to file
     */
    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = clientSocket.getOutputStream();
        in = clientSocket.getInputStream();
        messengerOut = new PrintWriter(out, true);
    }

    /**
     * Used for requesting a file from the server. Sends a request message and
     * expects to receive a stream of bytes, writes the received byte stream
     * into default output path
     *
     * @param msg request message 
     * @throws IOException Exception occurred while reading/writing to file
     */
    public void sendFileRequest(String msg) throws IOException {
        messengerOut.println(msg);
        try ( FileOutputStream fileOutputStream = new FileOutputStream(DEFAULT_XML_PATH)) {
            byte[] buffer = new byte[8 * 1024];

            int count;
            while ((count = in.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, count);
            }
        }
    }

    /**
     * Stops the client side connection by closing all of the Streams
     */
    private void stopConnection() {
        try {
            messengerOut.close();
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(JavaClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
