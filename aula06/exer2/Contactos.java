package aula06.exer2;

import java.util.ArrayList;


public class Contactos {
    
    public static ArrayList<Contacto> contactos = new ArrayList<>();

    public static void addContacto(String nome, int telefone){
        Contacto c = new Contacto(nome, telefone);
        contactos.add(c);
    }

    
    
    public static void alterarContacto(String nome, int telefone){
        if (contactos.isEmpty()) {
            System.out.println("Não existem contactos");
            return;
        }
       
        boolean contatoEncontrado = false;
        for(Contacto c : contactos){
            if(c.getNome().contains(nome)){
                c.setTelefone(telefone);
                System.out.println("Contato " + c.getNome() + " teve o telefone alterado para " + telefone);
                contatoEncontrado = true;
            }
        }
        if(!contatoEncontrado) {
            System.out.println("Nenhum contato encontrado com o nome " + nome);
        }
    }
    

    public static void removeContacto(String nome){
        for(Contacto c : contactos){
            if(c.getNome().equals(nome)){
                contactos.remove(c);
            }
            System.out.println("Contacto removido");
        }
        if (contactos.isEmpty()) {
            System.out.println("Não existem contactos");
        }
    }

    public static void procurarContacto(String nome, int telefone){
        for(Contacto c : contactos){
            if(c.getNome().equals(nome) && c.getTelefone() == c.getTelefone()){
                System.out.println(c);

            }
        }
        if (contactos.isEmpty()) {
            System.out.println("Não existem contactos");
        }

    }

    
    public static void printContactos(){
        System.out.println("Contactos:");
        for(Contacto c : contactos){
            System.out.println(c);
        }
    }
    
}
