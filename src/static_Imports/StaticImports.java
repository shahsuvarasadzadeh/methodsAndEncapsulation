package static_Imports;

/*Import ona görə əlverişlidir ki, biz hər dəfə kod daxilində hansısa classın adını istifadə edəndə
onu paket adı ilə tam formada yazmayaq, paketi import edək, qısa class adından istifadə edək.
Static import adi importdan fərqli olaraq classları deyil, ancaq classın static member`lərini
import etmək üçündür.*/

import java.util.List;
import static java.util.Arrays.asList; // static import

public class StaticImports {
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // without Arrays
    }

    /*Əgər biz static_Imports.StaticImports classında asList() adlı yeni metod yaratsaq, import olunmuş metodla
class daxilindəki metod adı eyni olacaq və bu zaman java öncəlik sırasını class daxilində
yaradılmış metoda verəcək.*/

}
