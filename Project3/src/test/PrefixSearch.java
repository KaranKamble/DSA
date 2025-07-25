package test;
import java.util.*;

public class PrefixSearch {

    private static List<String> getWordsWithPrefix(String[] document, String prefix) {
        List<String> result = new ArrayList<String>();

        if( document == null || prefix == null )
            return result;

        for( String word :  document){
            if( word != null && word.startsWith(prefix))
                result.add(word);
        }

        return  result;
    }

    public static void main(String[] args) {
        String[] document = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        System.out.println(getWordsWithPrefix( document, prefix ));
    }


}
