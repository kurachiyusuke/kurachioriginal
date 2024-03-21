import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Map<String,Boolean> componentHarmfulMap = new HashMap<>();
    public static void main(String[] args) {
        componentHarmfulMap.put("果糖ブドウ糖液糖",false);
        componentHarmfulMap.put("ぶどう果実",false);
        componentHarmfulMap.put("エストラジオール",true);
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(componentHarmfulMap.containsKey(name)){
            hantei(name);
        }
        else{
            String harmfulOrNot = sc.next();
            if(harmfulOrNot.equals("有害")){
                componentHarmfulMap.put(name,true);
                hantei(name);
            }
            if(harmfulOrNot.equals("無害")){
                componentHarmfulMap.put(name,false);
                hantei(name);
            }
        }
    }
    private static void hantei(String name){
            Boolean isHarmful = componentHarmfulMap.get(name);
            if(isHarmful) {
                System.out.println("有害です");
            }
            else{
                System.out.println("無害です");
            }
    }
}