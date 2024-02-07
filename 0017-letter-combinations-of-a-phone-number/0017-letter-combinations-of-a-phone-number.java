class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> output=new ArrayList<>();
        String[] buttonsMap={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0){
            return Collections.emptyList();
        }
        backtrack("",digits,buttonsMap,output);
        return output;
        
    }
    
    private void backtrack(String combination,String next_digit,String[] buttonsMap,List<String> output){
        if(next_digit.length()==0){
            output.add(combination);
        }else{
            String alpha=buttonsMap[next_digit.charAt(0)-'2'];
            for(char letter:alpha.toCharArray()){
                backtrack(combination+letter,next_digit.substring(1),buttonsMap,output);
            }
        }
    }
}