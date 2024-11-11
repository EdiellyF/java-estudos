package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    //Composição
    private final List<Comment> text = new ArrayList<>();

    public Post(){

    }

    public Post(String moment, String title, String content, Integer likes) {
        setMoment(moment);
        setTitle(title);
        setContent(content);
        setLikes(likes);
    }

    public Date getMoment() {
        return moment;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMoment(String moment) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            this.moment = formato.parse(moment);
        }catch (ParseException e){
            System.out.println("Formato de data e hora inválido: " + e.getMessage());
        }
    }

    public List<Comment> getText() {
        return text;
    }

    public void addComment(Comment comment) {
        text.add(comment);
    }

    public void removeComment(Comment comment) {
        text.remove(comment);
    }

    @Override
    public String toString() {

        StringBuilder tx = new StringBuilder();

         tx.append(title + "\n" +
                 likes + " Likes - "+ this.moment + "\n" +
                content + "\n"+
                "Comments:"+ "\n"
               );

         text.forEach(c -> tx.append(c.getText() + "\n"));


        return  tx.toString();

    }
}
