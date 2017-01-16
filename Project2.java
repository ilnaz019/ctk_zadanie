import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by ikadyrov on 16/01/2017.
 */
public class Project2 {
    public static void main(String[] args) {
        try {
            Map<String, String> hashMap = new HashMap<>();
            ArrayList<String> list = new ArrayList();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            hashMap.put("+8 800 2000 500", "Иванов И.И.");
            hashMap.put("+8 800 2000 600", "Иванов И.И.");
            hashMap.put("+8 800 2000 700", "Петров П.П.");
            hashMap.put("+8 800 2000 800", "Сидоров С.С.");
            hashMap.put("+8 800 2000 900", "Сидоров С.С.");
            hashMap.put("+8 800 2000 000", "Сидоров С.С.");

            Set<Map.Entry<String, String>> set = hashMap.entrySet();
            for (Map.Entry<String, String> me : set) {
                if (line.equals(me.getValue())) {
                    list.add(me.getKey());
                }
            }
            int i=1;
            if (list.size() > 0) {
                for (String phone : list) {
                    System.out.println(i + ". " + phone);
                    i++;
                }
            } else {
                System.out.println("Этого ФИО нет в базе");
            }
        }catch (IOException e){
            e.printStackTrace();}
    }
}