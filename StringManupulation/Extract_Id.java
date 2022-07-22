package StringManupulation;

public class Extract_Id {
    public static void main(String[] args) {
        String html_body="<html>"+
                "<title>Test</title>\n"+
                "<body>\n"+
                "Your trnx is successful. Trnx Id is: TXN123456"+
                "</body>"+
                "</html>";
        int pos=html_body.indexOf("TXN");
        String txnid=html_body.substring(pos,pos+9);
        System.out.println(txnid);
    }

}
