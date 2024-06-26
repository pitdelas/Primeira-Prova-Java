import java.time.LocalDateTime;

public class   FireSpot{
   private LocalDateTime start;
   private LocalDateTime end;
   private String cause;
   private Status status;
   private Identification identification;
   private Intensity intensity;
public LocalDateTime getStart() {
    return start;
}
public void setStart(LocalDateTime start) {
    this.start = start;
}
public LocalDateTime getEnd() {
    return end;
}
public void setEnd(LocalDateTime end) {
    this.end = end;
}
public String getCause() {
    return cause;
}
public void setCause(String cause) {
    this.cause = cause;
}
public Status getStatus() {
    return status;
}
public void setStatus(Status status) {
    this.status = status;
}
public Identification getIdentification() {
    return identification;
}
public void setIdentification(Identification identification) {
    this.identification = identification;
}
public Intensity getIntensity() {
    return intensity;
}
public void setIntensity(Intensity intensity) {
    this.intensity = intensity;
}
public FireSpot(LocalDateTime start, LocalDateTime end, String cause, Status status, Identification identification,
        Intensity intensity) {
    this.start = start;
    this.end = end;
    this.cause = cause;
    this.status = status;
    this.identification = identification;
    this.intensity = intensity;
}
public FireSpot() {
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((start == null) ? 0 : start.hashCode());
    result = prime * result + ((end == null) ? 0 : end.hashCode());
    result = prime * result + ((cause == null) ? 0 : cause.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + ((identification == null) ? 0 : identification.hashCode());
    result = prime * result + ((intensity == null) ? 0 : intensity.hashCode());
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
    FireSpot other = (FireSpot) obj;
    if (start == null) {
        if (other.start != null)
            return false;
    } else if (!start.equals(other.start))
        return false;
    if (end == null) {
        if (other.end != null)
            return false;
    } else if (!end.equals(other.end))
        return false;
    if (cause == null) {
        if (other.cause != null)
            return false;
    } else if (!cause.equals(other.cause))
        return false;
    if (status != other.status)
        return false;
    if (identification != other.identification)
        return false;
    if (intensity != other.intensity)
        return false;
    return true;
}
@Override
public String toString() {
    return "FireSpot [start=" + start + ", end=" + end + ", cause=" + cause + ", status=" + status + ", identification="
            + identification + ", intensity=" + intensity + "]";
}

}