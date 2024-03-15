import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Map<String,Boolean> componentHarmfulMap = Map.of("果糖ブドウ糖液糖",false,"ぶどう果実",false,"エストラジオール",true);
    public static void main(String[] args) {
        for(String s : args) {
            Boolean isHarmful = componentHarmfulMap.get(s);
            if(isHarmful) {
                System.out.println("有害です");
                return;
            }
        }
        System.out.println("無害です");
    }
}