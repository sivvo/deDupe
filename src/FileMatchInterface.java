/**
 * Created by martinsivorn on 28/03/2014.
 */
public interface FileMatchInterface {
    Integer MATCHES=0;
    Boolean ERRORS = Boolean.FALSE;

    /* this will be abstracted with types of matches
     */
    void doMatch();
    void processList();
    void saveMatches();

}
