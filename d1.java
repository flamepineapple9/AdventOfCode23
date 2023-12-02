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
        
        copy.addAll(input);
        
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

        for(int i = 0; i < input.size();i++){
            String first = "";
            String last = "";

            input.set(i, input.get(i).replaceAll("[^\\d.]", ""));
            
            if(!input.get(i).isEmpty()){
                first = input.get(i).substring(0,1);
                last = input.get(i).substring(input.get(i).length()-1);
            } else {
                first = copy.get(i).substring(copy.get(i).length()-3, copy.get(i).length());
                last = copy.get(i).substring(0,1);
            }

            for(int k = 0; k < dictionary.size(); k++){
                if(copy.get(i).indexOf(dictionary.get(k).substring(0, dictionary.get(k).length()-1)) < copy.get(i).indexOf(first) && copy.get(i).indexOf(dictionary.get(k).substring(0, dictionary.get(k).length()-1)) >= 0){
                    first = dictionary.get(k).substring(0, dictionary.get(k).length()-1);
                }    
                
                
                if(copy.get(i).lastIndexOf(dictionary.get(k).substring(0, dictionary.get(k).length()-1)) > copy.get(i).lastIndexOf(last)){
                    last = dictionary.get(k).substring(0, dictionary.get(k).length()-1);
                }
            }


            for(int k = 0; k < dictionary.size(); k++){
                if(first.equals(dictionary.get(k).substring(0, dictionary.get(k).length()-1))){
                    first = dictionary.get(k).substring(dictionary.get(k).length()-1, dictionary.get(k).length());
                }
                if(last.equals(dictionary.get(k).substring(0, dictionary.get(k).length()-1))){
                    last = dictionary.get(k).substring(dictionary.get(k).length()-1, dictionary.get(k).length());
                }
            }
            sum += Integer.parseInt(first + last);
        }

        System.out.println(sum);
    }
}