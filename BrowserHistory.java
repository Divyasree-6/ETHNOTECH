class BrowserHistory {
    private static class PageNode {
        String url;
        PageNode prev;
        PageNode next;

        PageNode(String url) {
            this.url = url;
            this.prev = null;
            this.next = null;
        }
    }
    private PageNode head; 
    private PageNode tail; 
    private int totalPages; 

    public BrowserHistory() {
        this.head = null;
        this.tail = null;
        this.totalPages = 0;
    }
    public void visit(String url) {
        PageNode newPage = new PageNode(url);
        
        if (head == null) {
            head = newPage;
            tail = newPage;
        } else {
            tail.next = newPage;
            newPage.prev = tail;
            tail = newPage;
        }
        totalPages++;
        System.out.println("Visited: " + url);
    }
    public void displayHistory() {
        if (head == null) {
            System.out.println("Browser history is empty.");
            return;
        }

        System.out.println("\n--- Browsing History ---");
        PageNode current = head;
        while (current != null) {
            System.out.print("[" + current.url + "]");
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println("\n------------------------");
    }
    public boolean deletePage(String url) {
        if (head == null) {
            System.out.println("History is empty.can't delete.");
            return false;
        }
        PageNode current = head;
        while (current != null) {
            if (current.url.equals(url)) {
				//if only one node
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                }
                else if (current == head) {
                    head = head.next;
                    head.prev = null;
                }
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                 current.prev.next = current.next; //for the next of current's prev pointing to current's next
                current.next.prev = current.prev;// for the prev of current's next pointing to current's prev
                }

                totalPages--;
                System.out.println("Deleted successfully: " + url);
                return true;
            }
            current = current.next;
        }

        System.out.println("Page not found in history: " + url);
        return false;
    }
    public int getTotalPagesCount() {
        return this.totalPages;
    }
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
		//new pages
        browser.visit("ibomma.com");
        browser.visit("telsuko.com");
        browser.visit("movierulz.com");
        browser.visit("telugumatrimony.com");
        browser.displayHistory();
        System.out.println("Total visited pages: " + browser.getTotalPagesCount());
        browser.deletePage("movierulz.com");
        browser.deletePage("ibomma.com");
        browser.deletePage("telidhu.com");// not exist
        browser.displayHistory();
        System.out.println("Total visited pages: " + browser.getTotalPagesCount());
    }
}