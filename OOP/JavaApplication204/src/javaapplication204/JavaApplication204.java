package javaapplication204;

public class JavaApplication204 {

    public static void main(String[] args) {
        Post post = new Post("post 1", "ankara", "istanbul");
       PostOffice po1 = new PostOffice("ankara ptt");
       PostOffice po2 = new PostOffice("istanbul ptt");
       po1.send(post);
       po1.receive(post);
    }

}
