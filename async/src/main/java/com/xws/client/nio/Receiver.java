package com.xws.client.nio;

import io.netty.channel.ChannelFuture;

import java.nio.ByteBuffer;

/**
 * Created by junjie on 8/19/15.
 */
public abstract class Receiver<T extends CharSequence> {
    public Receiver() {
    }

    public abstract void onReceive(final T s);
}
