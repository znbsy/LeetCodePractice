public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] seperated = s.split(" ");
        String result = "";
        for(int j = 0; j < seperated.length; j++){
            for (int i = seperated[j].length() - 1; i >= 0; i--){
                result += seperated[j].substring(i, i + 1);
            }
            if (j != seperated.length - 1){
                result += " ";
            }
        }
        return result;
    }
}
