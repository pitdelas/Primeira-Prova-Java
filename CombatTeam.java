public class CombatTeam extends Leader{
    private Integer numberMembers;

    public Integer getNumberMembers() {
        return numberMembers;
    }

    public void setNumberMembers(Integer numberMembers) {
        this.numberMembers = numberMembers;
    }

    public CombatTeam(Integer numberMembers) {
        this.numberMembers = numberMembers;
    }

    public CombatTeam() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numberMembers == null) ? 0 : numberMembers.hashCode());
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
        CombatTeam other = (CombatTeam) obj;
        if (numberMembers == null) {
            if (other.numberMembers != null)
                return false;
        } else if (!numberMembers.equals(other.numberMembers))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CombatTeam [numberMembers=" + numberMembers + "]";
    }
    
}
