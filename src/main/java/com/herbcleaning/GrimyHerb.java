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

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.ItemID;

@AllArgsConstructor
@Getter
enum GrimyHerb
{
	GUAM(ItemID.GRIMY_GUAM_LEAF, 3),
	MARRENTILL(ItemID.GRIMY_MARRENTILL, 5),
	TARROMIN(ItemID.GRIMY_TARROMIN, 11),
	HARRALANDER(ItemID.GRIMY_HARRALANDER, 20),
	RANARR(ItemID.GRIMY_RANARR_WEED, 25),
	TOADFLAX(ItemID.GRIMY_TOADFLAX, 30),
	IRIT(ItemID.GRIMY_IRIT_LEAF, 40),
	AVANTOE(ItemID.GRIMY_AVANTOE, 48),
	KWUARM(ItemID.GRIMY_KWUARM, 54),
	HUASCA(ItemID.GRIMY_HUASCA, 58),
	SNAPDRAGON(ItemID.GRIMY_SNAPDRAGON, 59),
	CADANTINE(ItemID.GRIMY_CADANTINE, 65),
	LANTADYME(ItemID.GRIMY_LANTADYME, 67),
	DWARF_WEED(ItemID.GRIMY_DWARF_WEED, 70),
	TORSTOL(ItemID.GRIMY_TORSTOL, 75);

	private final int itemId;
	private final int levelRequired;

	private static final Map<Integer, GrimyHerb> HERBS;

	static
	{
		ImmutableMap.Builder<Integer, GrimyHerb> builder = ImmutableMap.builder();
		for (GrimyHerb herb : values())
		{
			builder.put(herb.getItemId(), herb);
		}
		HERBS = builder.build();
	}

	static GrimyHerb getHerb(int itemId)
	{
		return HERBS.get(itemId);
	}
}
