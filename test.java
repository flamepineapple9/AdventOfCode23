public class test {
    public static void main(String args[]){
        String input = """

                """;
        
        int highest = 0;
        int current = 0;
        for(String S : input.split("\n")){
            if(!S.isEmpty()){
                current += Integer.parseInt(S);
            } else {
                current = 0;
            }
            if(current > highest){
                highest = current;
            }
        }
        System.out.println(highest);
    }
}