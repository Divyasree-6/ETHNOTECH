// Social media feed navigation system for timelines
class FeedNode {
    String content;
    FeedNode nextNode;
    FeedNode prevNode;

    public FeedNode(String content) {
        this.content = content;
        this.nextNode = null;
        this.prevNode = null;
    }
}

class UserTimeline {
    private FeedNode firstPost;
    private FeedNode lastPost;

    public UserTimeline() {
        this.firstPost = null;
        this.lastPost = null;
    }

    // Adds a new post to the front of the feed
    public void publishPost(String content) {
        FeedNode freshNode = new FeedNode(content);
        
        if (firstPost == null && lastPost == null) {
            firstPost = freshNode;
            lastPost = freshNode;
            return;
        }
        
        freshNode.nextNode = firstPost;
        firstPost.prevNode = freshNode;
        firstPost = freshNode;
    }

    // Removes a specific post by its content string
    public void removePost(String content) {
        if (firstPost == null) {
            System.out.println("Timeline is currently empty.");
            return;
        }

        if (firstPost.content.equals(content)) {
            firstPost = firstPost.nextNode;
            if (firstPost != null) {
                firstPost.prevNode = null;
            }
            return;
        }

        FeedNode current = firstPost;
        FeedNode prior = null;

        while (current != null && !current.content.equals(content)) {
            prior = current;
            current = current.nextNode;
        }

        if (current == null) {
            System.out.println("Requested post not found.");
            return;
        }

        current = current.nextNode;
        prior.nextNode = current;
        if (current != null) {
            current.prevNode = prior;
        }
    }

    // Inserts an advertisement or sponsored content at a specific index
    public void injectSponsoredPost(int index, String content) {
        if (index < 0) {
            System.out.println("Invalid index placement for advertisement.");
            return;
        }

        FeedNode freshNode = new FeedNode(content);

        if (index == 0) {
            firstPost.prevNode = freshNode;
            freshNode.nextNode = firstPost;
            firstPost = freshNode;
            System.out.println("Ad campaign pinned to top successfully.");
            return;
        }

        FeedNode current = firstPost;
        FeedNode prior = null;
        int stepCount = 0;

        while (current != null && stepCount < index) {
            stepCount++;
            prior = current;
            current = current.nextNode;
        }

        freshNode.nextNode = current;
        freshNode.prevNode = prior;
        
        if (prior != null) {
            prior.nextNode = freshNode;
        }
        if (current != null) {
            current.prevNode = freshNode;
        }

        System.out.println("Ad campaign injected successfully.");
    }

    // Prints the feed from newest to oldest
    public void printForward() {
        FeedNode current = firstPost;
        System.out.print("START <--> ");
        while (current != null) {
            System.out.print("[" + current.content + "] <--> ");
            current = current.nextNode;
        }
        System.out.println("END");
    }

    // Prints the feed from oldest to newest
    public void printBackward() {
        FeedNode current = lastPost;
        System.out.print("END <--> ");
        while (current != null) {
            System.out.print("[" + current.content + "] <--> ");
            current = current.prevNode;
        }
        System.out.println("START");
    }
}

public class SocialMediaFeedNavigation {
    public static void main(String[] args) {
        UserTimeline instagramFeed = new UserTimeline();
        
        instagramFeed.publishPost("thassadiya song from MIB");
        instagramFeed.publishPost("thelidhu update");
        instagramFeed.publishPost("prank video");
        instagramFeed.publishPost("samantha new's post");
        
        instagramFeed.injectSponsoredPost(2, "amazon ad");
        instagramFeed.printForward();
        
        instagramFeed.removePost("prank video");
        instagramFeed.printBackward();
    }
}