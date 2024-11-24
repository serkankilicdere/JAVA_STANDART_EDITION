package InstagramPostConstructor;

public class InstagramPost {
    public Long postId;
    public String postTitle;
    public String postDescription;
    public String postAuthor;
    public String postDate;
    public String postComment;
    public int postLikeCount;
    public int postCommentCount;

    public InstagramPost() {
        System.out.println("default constructor calisti");

    }

    public InstagramPost(String postTitle, String postDescription, String postAuthor, String postDate, String postComment) {

        this.postTitle = postTitle;
        this.postDescription = postDescription;
        this.postAuthor = postAuthor;
        this.postDate = postDate;

    }

}
