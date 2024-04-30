 import java.util.HashMap;
import java.util.Map;
public class mapinterJava {
public static void main(String[] args) {
Map<String, String> SId = new HashMap<>();
SId.put("sampath", "511");
SId.put("bala", "527");
SId.put("praveen", "548");
SId.put("upendra", "528");
for (Map.Entry<String, String> entry : SId.entrySet()) {
String name = entry.getKey();
String Id = entry.getValue();
System.out.println(name + " ID: " + Id);
}
System.out.println("\n");
System.out.println("Changing -> sampath : 511 - 511");
SId.put("sampath", "501");
System.out.println("Removing -> bala : 527");
SId.remove("bala");
boolean sidd = SId.containsKey("praveen");
System.out.println("Is there any Student Id with praveen ? --> " + sidd);
System.out.println("\n");
for (Map.Entry<String, String> entry : SId.entrySet()) {
String name = entry.getKey();
String Id = entry.getValue();
System.out.println(name + " ID: " + Id);
}
}
}


