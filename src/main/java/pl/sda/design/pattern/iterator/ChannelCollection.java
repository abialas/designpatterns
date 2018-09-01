package pl.sda.design.pattern.iterator;

/**
 * Created by adam.
 */
public interface ChannelCollection {

    void addChannel(Channel c);

    void removeChannel(Channel c);

    ChannelIterator iterator(ChannelTypeEnum type);

}
