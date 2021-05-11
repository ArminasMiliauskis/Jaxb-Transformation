package lt.eif.viko.amiliauskis.jaxb.net;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java server class used for the server side connection. This class has a main
 * function, which starts a new server on the default port. This class has an
 * XML file reference, this file can be sent to a client if a specific request
 * has been made.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class JavaServer {

    private final static int DEFAULT_PORT = 6666;
    private final static String DEFAULT_XML_IN_PATH = "ServerSolarSystem.xml";

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private OutputStream out;
    private InputStream in;
    private PrintWriter messageOut;
    private BufferedReader messageIn;

    /**
     * Starts the server and listens for messages. If the request is a correct
     * one it reads its file and sends it as a byte stream; Sends an XML
     * document if a correct request has been made, the XML doc is sent as byte
     * stream, if the request is incorrect the server prints out "Unknown
     * Message received" and closes the connection.
     *
     * @param port servers port
     */
    public void startServer(int port) {

        try {
            out = clientSocket.getOutputStream();
            in = clientSocket.getInputStream();
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            messageIn = new BufferedReader(new InputStreamReader(in));
            messageOut = new PrintWriter(out, true);
            String mesg = messageIn.readLine();

            switch (mesg) {
                case "RetrieveXmlDoc":
                    try ( FileInputStream fileInputStream = new FileInputStream(new File(DEFAULT_XML_IN_PATH))) {
                        byte[] buffer = new byte[8 * 1024];

                        int count;
                        while ((count = fileInputStream.read(buffer)) > 0) {
                            out.write(buffer, 0, count);
                        }
                    }
                    break;
                default:
                    System.out.println("Unknown message received");
                    System.out.println("Server is closing the connection...");
                    break;
            }
        } catch (IOException ex) {
            System.out.println("Exception occured : " + ex);
        } finally {
            stopServer();
        }
    }

    /**
     * Stops the server by closing all of the streams and sockets.
     */
    private void stopServer() {
        try {
            messageOut.close();
            messageIn.close();
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(JavaServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Main function. Creates a server object and starts it on default port
     *
     * @param args accepts a single argument of string type
     */
    public static void main(String[] args) {
        JavaServer server = new JavaServer();
        server.startServer(DEFAULT_PORT);
    }
}
