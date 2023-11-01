package com.entertainment;

import java.util.Objects;

public class Television {
    // instance variables "properties"
    private String brand;
    private int volume;

    private final Tuner tuner = new Tuner();

    // constructors
    public Television() {
    }

    public Television(String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    // business "action" methods
    public int getCurrentChannel() {
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    // accessor "getter/setter" methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;
        Television that = (Television) obj;

        return getVolume() == that.getVolume() && Objects.equals(getBrand(), that.getBrand());
    }
     */

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getVolume());
    }

    /*@Override
    public int hashCode() {
        // return getBrand().length() + getVolume();
        return Objects.hash(getBrand(), getVolume());
    }
     */

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        // proceed only if "obj" is referencing a Television object
        if (obj instanceof Television) {

            // safely downcast "obj" to more specific reference Television
            Television other = (Television) obj;

            // do the checks: business equality is defined by brand, volume being the same
            // is the brand the same as the other brands?
            // is the volume the same as the other volumes?
            result = Objects.equals(getBrand(), other.getBrand()) &&
                    this.getVolume() == other.getVolume();
        }
        return result;
    }

    // toString()
    @Override
    public String toString() {
        return String.format("%s [brand= %s, volume= %d, currentChannel=%d]",
                getClass().getSimpleName(), getBrand(), getVolume(), getCurrentChannel());
    }
}