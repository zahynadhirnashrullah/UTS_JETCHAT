/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.compose.jetchat.data

import com.example.compose.jetchat.R
import com.example.compose.jetchat.conversation.ConversationUiState
import com.example.compose.jetchat.conversation.Message
import com.example.compose.jetchat.data.EMOJIS.EMOJI_CLOUDS
import com.example.compose.jetchat.data.EMOJIS.EMOJI_FLAMINGO
import com.example.compose.jetchat.data.EMOJIS.EMOJI_MELTING
import com.example.compose.jetchat.data.EMOJIS.EMOJI_PINK_HEART
import com.example.compose.jetchat.data.EMOJIS.EMOJI_POINTS
import com.example.compose.jetchat.profile.ProfileScreenState

private val initialMessages = listOf(
    Message(
        "Kelompok2",
        "Terima Kasih!",
        "8:07 PM"
    ),
    Message(
        "Kelompok2",
        "Semangat!$EMOJI_PINK_HEART",
        "8:06 PM",
        R.drawable.sticker
    ),
    Message(
        "FADILLAH",
        "Setuju! Kita bisa gunakan tools seperti Git untuk berbagi perubahan dan melacak bug.",
        "8:05 PM"
    ),
    Message(
        "FAULAH",
        "Kalau begitu, kita perlu melakukan sesi debugging bersama. Mungkin bisa kita lakukan besok?",
        "8:05 PM"
    ),
    Message(
        "ZAHY",
        "Aku juga menemukan beberapa bug saat testing. Terutama di bagian sistem notifikasi",
        "8:04 PM"
    ),
    Message(
        "DAFFA",
        "Bagus! Aku masih mengerjakan antarmuka pengguna. Ada beberapa bug yang harus diperbaiki.",
        "8:03 PM"
    ),
    Message(
        "CHANDRA DINA",
    "Aku baru saja menyelesaikan fitur login. Sekarang pengguna bisa mendaftar dan masuk",
    "8:03 PM"
),
    Message(
        "DAFFA",
    "Hai semua! Gimana perkembangan proyek kita?$EMOJI_MELTING $EMOJI_CLOUDS. " ,
    "8:03 PM"
)
)

val exampleUiState = ConversationUiState(
    initialMessages = initialMessages,
    channelName = "#composers",
    channelMembers = 42
)

/**
 * Example colleague profile
 */
val colleagueProfile = ProfileScreenState(
    userId = "DINA",
    photo = R.drawable.dina,
    name = "CHANDRA DINA S",
    status = "Away",
    displayName = "chandrut",
    position = "Senior Android Dev at Openlane",
    twitter = "twitter.com/chndradinaa",
    timeZone = "12:25 AM local time (Eastern Daylight Time)",
    commonChannels = "2"
)

val daffaProfile = ProfileScreenState(
    userId = "DAFFA",
    photo = R.drawable.daffa,
    name = "DAFFA YTH",
    status = "Away",
    displayName = "daffa",
    position = "Senior Android Dev at Openlane",
    twitter = "twitter.com/daffayosataris",
    timeZone = "12:25 AM local time (Eastern Daylight Time)",
    commonChannels = "2"

)

/**
 * Example "me" profile.
 */
val meProfile = ProfileScreenState(
    userId = "Kelompok2",
    photo = R.drawable.kelompok,
    name = "KELOMPOK KITA",
    status = "Online",
    displayName = "aliconors",
    position = "Senior Android Dev at Yearin\nGoogle Developer Expert",
    twitter = "twitter.com/aliconors",
    timeZone = "In your timezone",
    commonChannels = null
)

val fadillahProfile = ProfileScreenState(
    userId = "FADILLAH",
    photo = R.drawable.fadillah,
    name = "FADILLAH DWI A",
    status = "Online",
    displayName = "fadillahda",
    position = "Senior Android Dev at Yearin\nGoogle Developer Expert",
    twitter = "twitter.com/fadillahda",
    timeZone = "In your timezone",
    commonChannels = null
)

val faulahProfile = ProfileScreenState(
    userId = "FAULAH",
    photo = R.drawable.faulah,
    name = "KHOIRUL FAULAH N",
    status = "Online",
    displayName = "faulah",
    position = "Senior Android Dev at Yearin\nGoogle Developer Expert",
    twitter = "twitter.com/khoirulfaulah",
    timeZone = "In your timezone",
    commonChannels = null
)

val zahyProfile = ProfileScreenState(
    userId = "ZAHY",
    photo = R.drawable.zahy,
    name = "ZAHY NADHIR",
    status = "Online",
    displayName = "zahy",
    position = "Senior Android Dev at Yearin\nGoogle Developer Expert",
    twitter = "twitter.com/zahynadhir",
    timeZone = "In your timezone",
    commonChannels = null
)

object EMOJIS {
    // EMOJI 15
    const val EMOJI_PINK_HEART = "\uD83E\uDE77"

    // EMOJI 14 🫠
    const val EMOJI_MELTING = "\uD83E\uDEE0"

    // ANDROID 13.1 😶‍🌫️
    const val EMOJI_CLOUDS = "\uD83D\uDE36\u200D\uD83C\uDF2B️"

    // ANDROID 12.0 🦩
    const val EMOJI_FLAMINGO = "\uD83E\uDDA9"

    // ANDROID 12.0  👉
    const val EMOJI_POINTS = " \uD83D\uDC49"
}
