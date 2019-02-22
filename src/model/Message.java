package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    String content;
    String author;
    LocalDateTime dateTime;

    public Message(String content, String author){
        this.content = content;
        this.author = author;
        this.dateTime = LocalDateTime.now();

    }

    @Override
    public String toString() {
        String pattern = "HH:mm:ss dd.MM.yyyy";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        //wypisujemy date w okreslonym formacie
        return "Wiadomość od: " + author + " odebrana : " + dateTime.format(dtf) + " o treści: " + content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}

