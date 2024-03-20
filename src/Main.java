import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Map<String,Boolean> componentHarmfulMap = Map.of("果糖ブドウ糖液糖",false,"ぶどう果実",false,"エストラジオール",true);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(componentHarmfulMap.containsKey(name)){
            hantei(args);
        }
        else{
            String harmfulOrNot = sc.next();
            if(harmfulOrNot.equals("有害")){
                componentHarmfulMap.put(name,true);
                hantei(args);
            }
            if(harmfulOrNot.equals("無害")){
                componentHarmfulMap.put(name,false);
                hantei(args);
            }
        }
    }
    public static void hantei(String[] args2){
        for(String s : args2) {
            Boolean isHarmful = componentHarmfulMap.get(s);
            if(isHarmful) {
                System.out.println("有害です");
                return;
            }
        }
        System.out.println("無害です");
    }
}