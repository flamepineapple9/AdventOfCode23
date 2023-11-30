import java.util.ArrayList;

public class test {
    public static void main(String args[]){
        Input i = new Input();
        ArrayList<String> input = new ArrayList<String>();
        for(String s:i.data.split("\n")){
            input.add(s);
        }
        System.out.println(input);
    }
}
