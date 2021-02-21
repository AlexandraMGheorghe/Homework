package Curs11;

import java.util.Objects;

public class Speaker {
    private int maxVolume;
    private int crtVolume;

    public Speaker(int maxVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = maxVolume/4;
    }
    public Speaker(int maxVolume, int crtVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    public boolean increaseVolume(){
        if(this.crtVolume < this.maxVolume){
            System.out.println("Volume increased.");
            crtVolume++;
            return true;
        }
        System.out.println("Volume is at maximum");
        return false;
    }

    public boolean decreaseVolume(){
        if (this.crtVolume > 0){
            System.out.println("Volume decreased.");
            crtVolume--;
            return true;
        }
        System.out.println("Volume is at minimum");
        return false;
    }

    public void setSilenceMode(){
        System.out.println("Volume is set at Silence Mode");
        this.crtVolume = 0;
    }

    @Override
    public String toString() {
        return "Speaker: maxVolume " + maxVolume + ", Current volume " + crtVolume;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Speaker speakerObj = (Speaker) obj;
        return  ((super.equals(speakerObj)) && this.maxVolume == speakerObj.maxVolume
                && this.crtVolume == speakerObj.crtVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxVolume, crtVolume);
    }
}

