/*
 * Created by Angel Leon (@gubatron), Alden Torres (aldenml)
 * Copyright (c) 2011-2014, FrostWire(R). All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.frostwire.jlibtorrent.alerts;

import com.frostwire.jlibtorrent.swig.tracker_alert;

/**
 * This is a base class used for alerts that are associated with a
 * specific tracker. It derives from torrent_alert since a tracker
 * is also associated with a specific torrent.
 *
 * @author gubatron
 * @author aldenml
 */
public class TrackerAlert<T extends tracker_alert> extends TorrentAlert<T> {

    public TrackerAlert(T alert) {
        super(alert);
    }

    public String getUrl() {
        return alert.getUrl();
    }
}
