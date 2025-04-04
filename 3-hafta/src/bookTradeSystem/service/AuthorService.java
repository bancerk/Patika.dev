package bookTradeSystem.service;

import bookTradeSystem.model.Author;
import bookTradeSystem.model.enums.Gender;

import java.util.HashMap;
import java.util.Map;

public class AuthorService {

    private static Map<String,Author> authors = new HashMap();

    public Author create(String name, String surname,Gender gender){
        Author author = new Author(name,surname,gender);
        authors.put(author.getName(),author);
        return author;
    }

    public Author findAuthor(String name){
        return authors.get(name);
    }

}
