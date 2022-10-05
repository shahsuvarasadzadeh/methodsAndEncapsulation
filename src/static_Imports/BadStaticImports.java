package static_Imports;
// import static java.util.Arrays; // line1, DOES NOT COMPILE

import static java.util.Arrays.asList;
// static import java.util.Arrays.*; // line2, DOES NOT COMPILE

public class BadStaticImports {

    public static void main(String[] args) {

        // Arrays.asList("one"); // line3, DOES NOT COMPILE

        /*
        *line1 – class static açar sözü ilə import edilə bilməz, static import ancaq static member`ləri
import edir;
* line2 – ardıcıllıq sırası pozulub, static sözü həmişə import sözündən sonra gəlməlidir;
*line3 – biz line2`də ancaq Arrays classının asList() metodunu import etmişik, Arrays
classının özünü yox.*/

        /**
         * Eyniadlı 2 static metodu və ya 2 static dəyişəni static import etdikdə kompayl xətası baş verir:
         * import static statics.A.TYPE;
         * import static statics.B.TYPE; // DOES NOT COMPILE
         * */
    }
}
