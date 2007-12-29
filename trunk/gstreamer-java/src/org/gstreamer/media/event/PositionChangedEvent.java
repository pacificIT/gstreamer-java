/* 
 * Copyright (c) 2007 Wayne Meissner
 * 
 * This file is part of gstreamer-java.
 *
 * gstreamer-java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * gstreamer-java is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with gstreamer-java.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.gstreamer.media.event;

import org.gstreamer.Time;
import org.gstreamer.media.MediaPlayer;

/**
 *
 * @author wayne
 */
public class PositionChangedEvent extends MediaEvent {
    public final Time position;
    public final int percent;
    public PositionChangedEvent(MediaPlayer player, Time position, int percent) {
        super(player);
        this.position = position;
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public Time getPosition() {
        return position;
    }
    
    @Override
    public String toString() {
        return getClass().getName() + "[source=" + getSource() + ",position=" + position + "]";

    }
}