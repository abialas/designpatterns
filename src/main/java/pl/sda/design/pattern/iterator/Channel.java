package pl.sda.design.pattern.iterator;

/**
 * Created by adam.
 */
public class Channel {

    private double frequency;
    private ChannelTypeEnum type;

    public Channel(double freq, ChannelTypeEnum type) {
        this.frequency = freq;
        this.type = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Frequency=" + this.frequency + ", Type=" + this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Channel channel = (Channel) o;

        if (Double.compare(channel.frequency, frequency) != 0) return false;
        return type == channel.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(frequency);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + type.hashCode();
        return result;
    }
}
