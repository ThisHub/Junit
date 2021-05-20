import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeeJay extends Staff{

    private int amountSongsANight;
    private List<Genre> genres = new ArrayList<>();


    public DeeJay(String name, int amountSongsANight, List<Genre> genres) {
        super(name);
        this.amountSongsANight = amountSongsANight;
        this.genres = genres;
    }

    public int getAmountSongsANight() {
        return amountSongsANight;
    }

    public void setAmountSongsANight(int amountSongsANight) {
        this.amountSongsANight = amountSongsANight;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }


//By Jens
    public String playASong(){
        String returnValue;
        //randomize the genres on your list(no need to junit this random part)
        Collections.shuffle(genres);
        //Just make sure you add +1 to amountSongsEachNight
        returnValue = "playing: " + genres.get(amountSongsANight).toString();
        amountSongsANight += 1;
        //You can't ever exceed 7 songs each night, otherwise it returns the
        //underlying phrase
        if (amountSongsANight > 7)
            returnValue = "No more songs to play";
        return returnValue;

    }

    public void playARequest(Genre genre) throws NoSuchGenreException{

        if (!genres.contains(genre))
            throw new NoSuchGenreException("There is no such song");
        else{
            genres.add(amountSongsANight,genre);
            System.out.println("Now playing: " + genres.get(amountSongsANight).toString());
            amountSongsANight += 1;
        }

        //throws an exception if this genre is
        //not in the genres of this Deejay
        //else, just play the genre and add one to the amountEachNight
    }




}
