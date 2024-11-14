import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy extends Book {
    public BookDeepCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public BookDeepCopy clone() {
        List<String> clonedChapters = new ArrayList<>(this.getChapters());
        return new BookDeepCopy(this.getTitle(), this.getAuthor(), clonedChapters);
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Chapters: " + getChapters();
    }
}
