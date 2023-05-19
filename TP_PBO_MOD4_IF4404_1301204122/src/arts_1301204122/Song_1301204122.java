package arts_1301204122;
/**
 *
 * @author Lenovo
 */
import jobs_1301204122.Artist_1301204122;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Song_1301204122 {

    private String title;
    private Artist_1301204122 artist;
    private Date release;
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(Artist_1301204122 artist) {
        this.artist = artist;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public String getTitle() {
        return title;
    }

    public Artist_1301204122 getArtist() {
        return artist;
    }

    public String getRelease() throws ParseException{
        String release = "1 Maret 2021";
        SimpleDateFormat form = new SimpleDateFormat("DD-MM-YYYY");
        Date date = form.parse(release);
        System.out.println(date); 
        
        return release;
    }
    
    public Song_1301204122(String title, Artist_1301204122 artist, String release) throws ParseException{
        release = "2010 Januari 1";
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
        Date date = format.parse(release);
        System.out.println(date); 
    }
    
    public void displayInfo_1301204122(){
        System.out.println("Title: "+this.title);
        System.out.println("Artist: "+this.artist);
        System.out.println("Release: "+getRelease());
        System.out.println("Artist age is"+getAge()+"when song released");
    }    

    private String getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
