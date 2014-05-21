/**
 * Created by martinsivorn on 28/03/2014.
 */
public class DeDuper {
    public static void main(String[] args) {
        System.out.println("hello...");
        FileFinder myFinder = new FileFinder();
        myFinder.setDir("/tmp/filefinder/");
        myFinder.doSearch();
    }
}
