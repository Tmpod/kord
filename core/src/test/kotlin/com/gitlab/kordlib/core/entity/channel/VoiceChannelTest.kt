package com.gitlab.kordlib.core.entity.channel

import com.gitlab.kordlib.common.entity.ChannelType
import com.gitlab.kordlib.core.cache.data.ChannelData
import equality.GuildChannelEqualityTest
import io.mockk.mockk

@Suppress("DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE")
internal class VoiceChannelTest : GuildChannelEqualityTest<VoiceChannel> by GuildChannelEqualityTest({ id, guildId ->
    VoiceChannel(ChannelData(id.longValue, guildId = guildId.longValue, type = ChannelType.GuildNews), mockk())
})