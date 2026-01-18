/*
 * Copyright (c) 2024
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.herbcleaning;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("herbcleaning")
public interface HerbCleaningConfig extends Config
{
	@Alpha
	@ConfigItem(
		keyName = "canCleanColor",
		name = "Can Clean Color",
		description = "Color for herbs you can clean",
		position = 1
	)
	default Color canCleanColor()
	{
		return Color.GREEN;
	}

	@Alpha
	@ConfigItem(
		keyName = "cannotCleanColor",
		name = "Cannot Clean Color",
		description = "Color for herbs you cannot clean",
		position = 2
	)
	default Color cannotCleanColor()
	{
		return Color.RED;
	}

	@ConfigItem(
		keyName = "showCanClean",
		name = "Highlight Cleanable",
		description = "Show outline on herbs you can clean",
		position = 3
	)
	default boolean showCanClean()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showCannotClean",
		name = "Highlight Uncleanable",
		description = "Show outline on herbs you cannot clean",
		position = 4
	)
	default boolean showCannotClean()
	{
		return true;
	}
}
