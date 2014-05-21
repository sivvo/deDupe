/**
 * Created by martinsivorn on 28/03/2014.
 */
public class FileMetadata {
    public String filename;
    public Long size;
    public Integer filehash;
    public String absoluteFilePath;
    public void FileMetadata(String filename, String absoluteFilePath, Long size, Integer hash){
        this.filename = filename;
        this.size = size;
        this.absoluteFilePath = absoluteFilePath;
        this.filehash = hash;
    }

}
