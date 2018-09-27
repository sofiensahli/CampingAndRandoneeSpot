package soft.dot.com.campingandrandoneespot.com.dot.soft.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@Entity()
public class Circuit {
    @Expose
    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    long id;
    @Expose
    @SerializedName("difficulty")
    @ColumnInfo(name = "difficulty")
    String difficulty;
    @Expose
    @SerializedName("duree")
    @ColumnInfo(name = "duree")
    long duree;
    @Expose
    @SerializedName("spots")
    @Ignore
    ArrayList<Spot> spots;
    @Expose
    @SerializedName("description")
    @ColumnInfo(name = "description")
    String description;
    @Expose
    @SerializedName("title")
    @ColumnInfo(name = "title")
    String title;

    public Circuit() {
        this.spots = new ArrayList<>();

    }

    @Ignore
    public Circuit(String difficulty, long duree, String description, String title) {
        this.difficulty = difficulty;
        this.duree = duree;
        this.description = description;
        this.title = title;
    }

    public ArrayList<Spot> getSpots() {
        return spots;
    }

    public void setSpots(ArrayList<Spot> spots) {
        this.spots = spots;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Circuit{" +
                "id=" + id +
                ", difficulty=" + difficulty +
                ", duree=" + duree +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public long getDuree() {
        return duree;
    }

    public void setDuree(long duree) {
        this.duree = duree;
    }
}
