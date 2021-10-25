package Dictionaries;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Dictionaries {
    private HashMap<String, Dictionary> dictionaries;
    public List<Dictionary> getAsList(){
        return dictionaries.entrySet()
                .stream()
                .map(dictionary -> dictionary.getValue())
                .collect(Collectors.toList());
    }
    public Boolean isDictionaryAvailable(String dictionaryName){
        return dictionaries.containsKey(dictionaryName);
    }

    public void addWordToDictionary(String dictionaryLanguage, String wordToAdd){
        List<String> wordsInDictionary = dictionaries.get(dictionaryLanguage).words;
        wordsInDictionary.add(wordToAdd);
    }
    public void createDictionary(String dictionaryLanguage){
        Dictionary newDictionary = new Dictionary();
        newDictionary.language = dictionaryLanguage;
        dictionaries.put(dictionaryLanguage,newDictionary);
    }
}
