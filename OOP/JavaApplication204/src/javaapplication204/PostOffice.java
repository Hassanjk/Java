
package javaapplication204;


public class PostOffice {
    String name;

    public PostOffice(String name) {
        this.name = name;
    }
    
    void send(Post post){
        String sendInfo = String.format("content: %s sent  from %s  to %s %s",, post.message, post.source, post.destination);
        System.out.println(sendInfo);
    }
    
    void receive(Post post){
                String sendInfo = String.format("content: %s sent  from %s  received by %s", post.message, post.source, post.destination);
        System.out.println(sendInfo);
    }
}
