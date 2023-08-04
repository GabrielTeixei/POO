package aula10.E2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import aula10.E1.*;;

public class E2 {
    public static void main(String[] args) {

        // parte do exercicio 1
        HashMap<String, List<Book>> books = new HashMap<>();

        // adicionando livros
        
        books.put("Fantasia", new ArrayList<>());
        books.get("Fantasia").add(new Book("Harry Potter", "J.K. Rowling", 1998));
        books.get("Fantasia").add(new Book("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        books.get("Fantasia").add(new Book("As Crônicas de Nárnia", "C.S. Lewis", 1950));
        books.put("Drama", new ArrayList<>());
        books.get("Drama").add(new Book("O Apanhador no Campo de Centeio", "J.D. Salinger", 1951));
        books.get("Drama").add(new Book("Crime e Castigo", "Fiódor Dostoiévski", 1866));

        // fim da parte de exercicio 1

        String genre = "Fantasia";
        List<Book> genreBooks = books.get(genre);
        if (genreBooks != null && !genreBooks.isEmpty()) {
            int randomIndex = new Random().nextInt(genreBooks.size());
            Book randomBook = genreBooks.get(randomIndex);
            System.out.println("Um livro aleatório de " + genre + ": " + randomBook);
        } else {
            System.out.println("Não há livros cadastrados para o gênero " + genre);
        }

        // Alterar
        List<Book> fantasyBooks = books.get("Fantasia");
        if (fantasyBooks != null && !fantasyBooks.isEmpty()) {
            fantasyBooks.set(0, new Book("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1998));
            System.out.println(books);
        } else {
            System.out.println("Não há livros de Fantasia cadastrados");
        }

        // Remover
        books.remove("Fantasia");
        System.out.println(books);

    }
}
