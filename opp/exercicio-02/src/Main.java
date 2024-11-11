import entities.Comment;
import entities.Post;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Post post = new Post("21/06/2018 13:05:44", "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12 );
        Comment comment = new Comment("Have a nice trip");
        post.addComment(comment);
        comment = new Comment("Wow that's awesome!");
        post.addComment(comment);

        Post post1 = new Post("28/07/2018 23:14:19", "Good night guys",  "See you tomorrow", 5);
        comment = new Comment("Good night");
        post1.addComment(comment);
        comment = new Comment("May the Force be with you");
        post1.addComment(comment);

        System.out.println(post);
        System.out.print(post1);





    }
}