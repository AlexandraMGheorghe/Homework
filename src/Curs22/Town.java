package Curs22;

import java.util.Objects;

public class Town implements Comparable<Town> {

    private String nameTown;
    private int distanceTown;

    public Town(String nameTown, int distanceTown) {
        this.nameTown = nameTown;
        this.distanceTown = distanceTown;
    }
    public int compareTo(Town town2) {
        if(town2 == null){
            throw new NullPointerException();
        }

        if (town2.distanceTown == 0){
            return -1;
        }
        if (this.distanceTown > town2.distanceTown){
            return 1;
        }else{
            return -1;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return distanceTown == town.distanceTown && Objects.equals(nameTown, town.nameTown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameTown, distanceTown);
    }

    @Override
    public String toString() {
        return nameTown+ " " + distanceTown ;

    }
}
