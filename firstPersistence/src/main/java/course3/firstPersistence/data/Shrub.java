package course3.firstPersistence.data;

import javax.persistence.Entity;

@Entity
public class Shrub extends Plant{
    private int heightCm;
    private int widthCm;

    public Shrub(int heightCm, int widthCm) {
        this.heightCm = heightCm;
        this.widthCm = widthCm;
    }

    public Shrub() {
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWidthCm() {
        return widthCm;
    }

    public void setWidthCm(int widthCm) {
        this.widthCm = widthCm;
    }
}
