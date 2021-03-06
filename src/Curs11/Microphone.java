package Curs11;

import java.util.Objects;

public class Microphone {
    private int maxVolume;
    private int crtVolume;

    public Microphone(int maxVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = maxVolume/4;
    }
    public Microphone(int maxVolume, int crtVolume) {
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

    public void muteMicrophone(){
        System.out.println("Volume is set at Silence Mode");
        this.crtVolume = 0;
    }

    @Override
    public String toString() {
        return "Microphone: maxVolume " + maxVolume + ", Current volume " + crtVolume;

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
        Microphone microphoneObj = (Microphone) obj;
        return  ((super.equals(microphoneObj)) && this.maxVolume == microphoneObj.maxVolume
                && this.crtVolume == microphoneObj.crtVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxVolume, crtVolume);
    }
}

