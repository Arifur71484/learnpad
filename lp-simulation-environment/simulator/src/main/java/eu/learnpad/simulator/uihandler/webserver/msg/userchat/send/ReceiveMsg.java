/**
 *
 */
package eu.learnpad.simulator.uihandler.webserver.msg.userchat.send;

import eu.learnpad.simulator.uihandler.webserver.msg.userchat.IChatMsg;

/*
 * #%L
 * LearnPAd Simulator
 * %%
 * Copyright (C) 2014 - 2015 Linagora
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

/**
 * @author Tom Jorquera - Linagora
 *
 */
public class ReceiveMsg implements IChatMsg {

	public String channel;
	public String sender;
	public String content;

	public ReceiveMsg() {

	}

	public ReceiveMsg(String channel, String sender, String content) {
		super();
		this.channel = channel;
		this.sender = sender;
		this.content = content;
	}

	@Override
	public TYPE getType() {
		return TYPE.RECEIVE_MSG;
	}

}
