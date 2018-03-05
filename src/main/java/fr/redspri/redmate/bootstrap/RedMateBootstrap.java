package fr.redspri.redmate.bootstrap;

import fr.redspri.redmate.RedMate;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

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
public class RedMateBootstrap {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Token isn't set");
            return;
        }
        try {
            JDA jda = new JDABuilder(AccountType.BOT).setToken(args[0]).buildBlocking();
            RedMate.setRedMate(new RedMate(jda));
            RedMate.getRedMate().init();

        } catch (LoginException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
