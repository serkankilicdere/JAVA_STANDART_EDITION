package InstagramPostConstructor;

public class RunnerInstagramPost {
    public static void main(String[] args) {

        InstagramPost post = new InstagramPost();
        System.out.println(post.postTitle);
        System.out.println(post.postDescription);

        InstagramPost post2=new InstagramPost
                ("merhaba","hello","serkan","bugün","guzel");
        System.out.println(post2.postTitle);
        System.out.println(post2.postDescription);

    }
}
