package controller;

import model.Message;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MessageController {
    public Deque<Message> messages = new ArrayDeque<>();
    public  void addMessage(String content, String author){
        Message m = new Message(content, author);
        messages.addFirst(m);
        System.out.println("Dodano wiadomości");

    }
    public void getMessage(){
        try {
            messages.removeLast();
        }catch (NoSuchElementException);
        System.out.println(messages.getLast());
    }
    public void deleteMessage(){
        messages.removeLast();
    }
}
