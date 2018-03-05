package fr.redspri.redmate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.dv8tion.jda.core.JDA;

/*
 *     This file is part of RedMate.
 *
 *     Foobar is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Foobar is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
@Data
public class RedMate {
    @Getter
    @Setter
    public static RedMate redMate;
    private JDA jda;
    private boolean init = false;

    public RedMate(JDA jda) {
        this.jda = jda;
    }

    public void init() {
        jda.setAutoReconnect(true);
    }

}
