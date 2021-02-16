public class MessageSevice {
    private String ip;
    private String message;

    private String userName;
    private String ipAddress;
    private java.net.Socket socket = null;

    public MessageService (String userName, String ipAddress, java.net.Socket socket)
    {
        this.userName = userName;
        this.ipAddress = ipAddress;
        this.socket = socket;
    }

    public java.net.Socket getSocket()
    {
        return this.socket;
    }
    

    public boolean sendmsg (String  message , String ipAddress)
    {
        java.net.Socket socket = ipAddress.getSocket();
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        try{
            bw.write(message);
            bw.flush();
        }
        catch(exception e){
            System.out.println("den stalthike to munima")
        }
    }