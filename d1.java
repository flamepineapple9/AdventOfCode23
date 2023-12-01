import java.util.ArrayList;

public class d1 {
    public static void main(String args[]){
        Input a = new Input();
        ArrayList<String> input = new ArrayList<String>();
        for(String s:a.data.split("\n")){
            input.add(s);
        }

        int sum = 0;
        ArrayList<String> copy = new ArrayList<String>();
        
        //pls dont be a shallow copy
        copy.addAll(input);
        
        for(int i = 0; i < input.size();i++){
            String first = "";
            String last = "";

            input.set(i, input.get(i).replaceAll("[^\\d.]", ""));
            first = input.get(i).substring(0,1);
            last = input.get(i).substring(input.get(i).length()-1);


            ArrayList<String> dictionary = new ArrayList<String>();
            dictionary.add("one1");
            dictionary.add("two2");
            dictionary.add("three3");
            dictionary.add("four4");
            dictionary.add("five5");
            dictionary.add("six6");
            dictionary.add("seven7");
            dictionary.add("eight8");
            dictionary.add("nine9");
            dictionary.add("zero0");

            for(int k = 0; k < dictionary.size(); k++){
                if(copy.indexOf(dictionary.get(k).subString(0, dictionary.get(k).length-1)) < copy.indexOf(first)){
                    first = dictionary.get(k).subString(0, dictionary.get(k).length-1);
                }
                if(copy.lastIndexOf(dictionary.get(k).subString(0, dictionary.get(k).length-1)) > copy.lastIndexOf(last)){
                    last = dictionary.get(k).subString(0, dictionary.get(k).length-1);
                }
            }

            for(int k = 0; k < dictionary.size(); k++){
                if(first == dictionary.get(k).substring(0, dictionary.get(k).length-1)){
                    first = dictionary.get(k).substring(dictionary.get(k).length-1, dictionary.get(k).length);
                }
                if(last == dictionary.get(k).substring(0, dictionary.get(k).length-1)){
                    last = dictionary.get(k).substring(dictionary.get(k).length-1, dictionary.get(k).length);
                }
            }
            sum += Integer.parseInt(first + last);
        }

        System.out.println(sum);
    }
}
