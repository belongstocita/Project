package tp_pbo_mod4_if4404_1301204122;

import jobs_1301204122.Artist_1301204122;
import arts_1301204122.Song_1301204122;
import java.text.ParseException;

/**
 *
 * @author Lenovo
 */
public class DriverSong_1301204122 {
    public void main(String[] args) throws ParseException{
        Artist_1301204122 a1 = new Artist_1301204122("a1: Budi Doremi,","1984-09-19");
        Artist_1301204122 a2 = new Artist_1301204122("a1: Ed Sheeran", "1991-02-17");
        System.out.println(displayInfoArtist());
        
        Song_1301204122 song1 = new Song_1301204122("song1: Melukis Senja", a1, "2020-06-29");
        Song_1301204122 song2 = new Song_1301204122("song2: Photograph", a2, "2015-05-10");
        System.out.println(displayInfo_1301204122());
    }

    private boolean displayInfoArtist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean displayInfo_1301204122() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}




/**/
