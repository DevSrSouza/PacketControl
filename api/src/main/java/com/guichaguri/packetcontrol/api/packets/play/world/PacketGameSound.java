package com.guichaguri.packetcontrol.api.packets.play.world;

import com.guichaguri.packetcontrol.api.Packet;
import com.guichaguri.packetcontrol.api.util.Positionable3d;
import org.spongepowered.api.effect.sound.SoundCategory;
import org.spongepowered.api.effect.sound.SoundType;

/**
 * A packet that makes a client play a vanilla sound.
 *
 * For custom sounds, see {@link PacketCustomSound}
 *
 * @author Guichaguri
 */
public interface PacketGameSound extends Packet, Positionable3d {

    SoundType getSound();

    void setSound(SoundType type);

    SoundCategory getCategory();

    void setCategory(SoundCategory category);

    float getVolume();

    void setVolume(float volume);

    float getPitch();

    void setPitch(float pitch);

}
