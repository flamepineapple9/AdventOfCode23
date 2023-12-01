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
        for(String s:a.data.split("\n")){
            copy.add(s);
        }
        
        for(int i = 0; i < input.size();i++){
            String first = "";
            String last = "";

            input.set(i, input.get(i).replaceAll("[^\\d.]", ""));
            if(input.size() > 0){
                first = input.get(i).substring(0,1);
                last = input.get(i).substring(input.get(i).length()-1); 
            }
            
            
            if(copy.indexOf("one") != -1 && copy.indexOf("one") < copy.indexOf(first)){
                first = "1";
            }
            if(copy.indexOf("two") != -1 && copy.indexOf("two") < copy.indexOf(first)){
                first = "2";
            }
            if(copy.indexOf("three") != -1 && copy.indexOf("three") < copy.indexOf(first)){
                first = "3";
            }
            if(copy.indexOf("four") != -1 && copy.indexOf("four") < copy.indexOf(first)){
                first = "4";
            }
            if(copy.indexOf("five") != -1 && copy.indexOf("five") < copy.indexOf(first)){
                first = "5";
            }
            if(copy.indexOf("six") != -1 && copy.indexOf("six") < copy.indexOf(first)){
                first = "6";
            }
            if(copy.indexOf("seven") != -1 && copy.indexOf("seven") < copy.indexOf(first)){
                first = "7";
            }
            if(copy.indexOf("eight") != -1 && copy.indexOf("eight") < copy.indexOf(first)){
                first = "8";
            }
            if(copy.indexOf("nine") != -1 && copy.indexOf("nine") < copy.indexOf(first)){
                first = "9";
            }
            if(copy.indexOf("zero") != -1 && copy.indexOf("zero") < copy.indexOf(first)){
                first = "0";
            }
            

            if(copy.lastIndexOf("one") != -1 && copy.lastIndexOf("one") > copy.lastIndexOf(last)){
                last = "1";
            }
            if(copy.lastIndexOf("two") != -1 && copy.lastIndexOf("two") > copy.lastIndexOf(last)){
                last = "2";
            }
            if(copy.lastIndexOf("three") != -1 && copy.lastIndexOf("three") > copy.lastIndexOf(last)){
                last = "3";
            }
            if(copy.lastIndexOf("four") != -1 && copy.lastIndexOf("four") > copy.lastIndexOf(last)){
                last = "4";
            }
            if(copy.lastIndexOf("five") != -1 && copy.lastIndexOf("five") > copy.lastIndexOf(last)){
                last = "5";
            }
            if(copy.lastIndexOf("six") != -1 && copy.lastIndexOf("six") > copy.lastIndexOf(last)){
                last = "6";
            }
            if(copy.lastIndexOf("seven") != -1 && copy.lastIndexOf("seven") > copy.lastIndexOf(last)){
                last = "7";
            }
            if(copy.lastIndexOf("eight") != -1 && copy.lastIndexOf("eight") > copy.lastIndexOf(last)){
                last = "8";
            }
            if(copy.lastIndexOf("nine") != -1 && copy.lastIndexOf("nine") > copy.lastIndexOf(last)){
                last = "9";
            }
            if(copy.lastIndexOf("zero") != -1 && copy.lastIndexOf("zero") > copy.lastIndexOf(last)){
                last = "0";
            }
            
            sum += Integer.parseInt(first + last);
        }

        System.out.println(sum);
        //indexOf() for every spelt number, find lowest one and compare to first real digit
        //lastIndexOf() and compare to last real digit
    }
}