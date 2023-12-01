import java.util.ArrayList;

public class d1 {
    public static void main(String args[]){
        Input a = new Input();
        ArrayList<String> input = new ArrayList<String>();
        for(String s:a.data.split("\n")){
            input.add(s);
        }

        int sum = 0;
        for(int i = 0; i < input.size();i++){
            input.set(i, input.get(i).replaceAll("[^\\d.]", ""));
            sum += Integer.parseInt(input.get(i).substring(0,1) + input.get(i).substring(input.get(i).length()-1,input.get(i).length()));
        }

        System.out.println(sum);
    }
}
