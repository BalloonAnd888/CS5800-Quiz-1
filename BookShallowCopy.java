import java.util.List;

public class BookShallowCopy extends Book {
    public BookShallowCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public BookShallowCopy clone() {
        return new BookShallowCopy(this.getTitle(), this.getAuthor(), this.getChapters());
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Chapters: " + getChapters();
    }
}
