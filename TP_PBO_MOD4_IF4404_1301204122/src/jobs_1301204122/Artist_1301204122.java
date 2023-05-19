package jobs_1301204122;

/**
 *
 * @author Lenovo
 */
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Artist_1301204122 {

    private String name;
    private Date birthdate;
    private int age;
    
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() throws ParseException{
        String birthdate = "1 Maret 2021";
        SimpleDateFormat form = new SimpleDateFormat("DD-MM-YYYY");
        Date date = form.parse(birthdate);
        System.out.println(date); 
        
        return birthdate;
    }

    public int getAge() {
        return age;
    }
            
    public Artist_1301204122(String name, String birthdate) throws ParseException{
        birthdate = "2010 Januari 1";
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
        Date date = format.parse(birthdate);
        System.out.println(date); 
    }
    
     public void displayInfoArtist(){
        System.out.println("Artist name: "+this.name);
        System.out.println("Birthdate: "+getBirthdate());
        System.out.println("Age: "+this.age);
    }
        
}
