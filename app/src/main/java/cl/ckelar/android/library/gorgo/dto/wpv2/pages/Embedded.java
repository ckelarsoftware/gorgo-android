
package cl.ckelar.android.library.gorgo.dto.wpv2.pages;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Embedded {

    @SerializedName("author")
    @Expose
    private List<Author_> author = null;

    public List<Author_> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author_> author) {
        this.author = author;
    }

}
