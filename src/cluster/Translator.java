//package cluster;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class Translator {
//  // TODO: If you have your own Premium account credentials, put them down here:
//  private static final String CLIENT_ID = "FREE_TRIAL_ACCOUNT";
//  private static final String CLIENT_SECRET = "PUBLIC_SECRET";
//  private static final String ENDPOINT = "http://api.whatsmate.net/v1/translation/translate";
//
//  public static void main(String[] args) throws Exception {
//    String fromLang = "ar";
//    String toLang = "en";
//    //String text = "Let's have some fun!";
//    String text = " اصبحت الان حياتي المؤقتة";
//    //String text = readFile();
//    //text = text.replaceAll("[\\\r\\\n]+","");
//    translate(fromLang, toLang, text);
//
//  }
//  
//  
//  public static String readFile() throws FileNotFoundException, IOException{
//      String str = null;
//        try {
//            str = new String(Files.readAllBytes(Paths.get("data.txt")));
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
// 
//        return str;
//  }
//
//  public static void translate(String fromLang, String toLang, String text) throws Exception {
//    String jsonPayload = new StringBuilder()
//      .append("{")
//      .append("\"fromLang\":\"")
//      .append(fromLang)
//      .append("\",")
//      .append("\"toLang\":\"")
//      .append(toLang)
//      .append("\",")
//      .append("\"text\":\"")
//      .append(text)
//      .append("\"")
//      .append("}")
//      .toString();
//
//    URL url = new URL(ENDPOINT);
//    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//    conn.setDoOutput(true);
//    conn.setRequestMethod("POST");
//    conn.setRequestProperty("X-WM-CLIENT-ID", CLIENT_ID);
//    conn.setRequestProperty("X-WM-CLIENT-SECRET", CLIENT_SECRET);
//    conn.setRequestProperty("Content-Type", "application/json");
//
//    OutputStream os = conn.getOutputStream();
//    os.write(jsonPayload.getBytes());
//    os.flush();
//    os.close();
//
//    int statusCode = conn.getResponseCode();
//    System.out.println("Status Code: " + statusCode);
//    BufferedReader br = new BufferedReader(new InputStreamReader(
//        (statusCode == 200) ? conn.getInputStream() : conn.getErrorStream()
//      ));
//    String output;
//    while ((output = br.readLine()) != null) {
//        System.out.println(output);
//    }
//    conn.disconnect();
//  }
//
//}
