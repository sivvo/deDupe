/**
 * Created by martinsivorn on 28/03/2014.
 */
import com.google.common.io.Files;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class FileFinder {
    // for a given location, find files...
    private String DIRNAME;
    private List<String> EXTENSIONS;
    private Integer MINSIZE = 0;
    private Integer MAXSIZE = 0;

    public void setDir(String DirNameParam) throws IllegalArgumentException {
        if (DirNameParam == null) {
            throw new IllegalArgumentException("No directory was entered");
        }
        this.DIRNAME = DirNameParam;
    }
    public void setExtension(List<String> extensions){
        this.EXTENSIONS = extensions;
    }
    public void setSizes(Integer min, Integer max){
        this.MINSIZE = min;
        this.MAXSIZE = max;
    }
    public void doSearch(){
        String files;
        Long size;
        Integer hash;
        String absoluteFilePath;

        File folder = new File(this.DIRNAME);
        File[] listOfFiles = folder.listFiles();
        ArrayList<FileMetadata> listOfFileMetadata  new FileMetadata();
        for (int i = 0; i < listOfFiles.length; i++)
        {

            if (listOfFiles[i].isFile())
            {
                files = listOfFiles[i].getName();
                size  = listOfFiles[i].length();
                hash  = listOfFiles[i].hashCode();
                absoluteFilePath = listOfFiles[i].getAbsolutePath();
                listOfFileMetadata.add(files, size, hash, absoluteFilePath);

                //Files.asByteSource()
                System.out.println(files);
                System.out.println(size);
            }
        }
    }

}
