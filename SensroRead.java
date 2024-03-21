import java.time.LocalDateTime;

public class SensroRead {
    private Float value;
    private LocalDateTime date;
    public Float getValue() {
        return value;
    }
    public void setValue(Float value) {
        this.value = value;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public SensroRead(Float value, LocalDateTime date) {
        this.value = value;
        this.date = date;
    }
    public SensroRead() {
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
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
        SensroRead other = (SensroRead) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "SensroRead [value=" + value + ", date=" + date + "]";
    }

    
}
