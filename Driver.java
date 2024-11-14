import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");
        chapters.add("Chapter 3");

        BookShallowCopy originalShallow = new BookShallowCopy("Ray Tracing", "Kevin Suffern", chapters);
        BookShallowCopy clonedShallow = originalShallow.clone();

        originalShallow.getChapters().set(0, "Introduction");

        System.out.println("Original Book - Shallow Copy: " + originalShallow);
        System.out.println("Cloned Book - Shallow Copy: " + clonedShallow);

        BookDeepCopy originalDeep = new BookDeepCopy("Ray Tracing", "Kevin Suffern", chapters);
        BookDeepCopy clonedDeep = originalDeep.clone();

        originalDeep.getChapters().set(0, "Contents");

        System.out.println("Original Book - Deep Copy: " + originalDeep);
        System.out.println("Cloned Book - Deep Copy: " + clonedDeep);
    }
}
