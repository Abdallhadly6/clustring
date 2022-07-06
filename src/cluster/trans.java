
package cluster;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class trans {
    public static void main(String[] args) throws IOException, InterruptedException{
        TransToEn();
        TimeUnit.SECONDS.sleep(4);
        TransToAr();
    }
    
    public static void TransToEn() throws IOException{
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("cmd /c transtoen.py");
    }
    
    public static void TransToAr() throws IOException{
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("cmd /c transtoar.py");
    }
}
