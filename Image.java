import java.time.LocalDateTime;

public class Image extends FireSpot {
    private String filename;
    private LocalDateTime date;
    private String satelliteName;
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public String getSatelliteName() {
        return satelliteName;
    }
    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }
    public Image(String filename, LocalDateTime date, String satelliteName) {
        this.filename = filename;
        this.date = date;
        this.satelliteName = satelliteName;
    }
    public Image() {
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((filename == null) ? 0 : filename.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((satelliteName == null) ? 0 : satelliteName.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Image other = (Image) obj;
        if (filename == null) {
            if (other.filename != null)
                return false;
        } else if (!filename.equals(other.filename))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (satelliteName == null) {
            if (other.satelliteName != null)
                return false;
        } else if (!satelliteName.equals(other.satelliteName))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Image [filename=" + filename + ", date=" + date + ", satelliteName=" + satelliteName + "]";
    }
    
}
