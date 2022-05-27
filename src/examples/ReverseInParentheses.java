package examples;

public class ReverseInParentheses {

public ReverseInParentheses(){
    System.out.println(solution("foo(bar(baz))blim"));    
}

String solution(String inputString) {
    String subString = "";
for(int i = 0; i < inputString.length(); i++){
    if(inputString.charAt(i) == '('){
        for(int j = i+1; j < inputString.length(); j++){
            if(inputString.charAt(j) == ')'){
                for(int k = j-1; k > i; k--){
                    subString = subString + inputString.charAt(k);
                }
                inputString = inputString.substring(0, i) + subString + inputString.substring(j+1);
                subString = "";
                break;
            }
            if(inputString.charAt(j) == '('){
                inputString = inputString.substring(0, i) + inputString.substring(j+1, inputString.indexOf(')')) + inputString.substring(i, j) + inputString.substring(inputString.indexOf(')') + 1);
                System.out.println(inputString);
                if(inputString.contains("("))
                i = 0;
                break;
            }
        }
    }
}
return inputString;
}

    
public static void main(String args[]){
    new ReverseInParentheses();
}

}
