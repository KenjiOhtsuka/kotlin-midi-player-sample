/*
 * Kotlin Midi Player Sample
 * Copyright (C) 2019  Kenji Otsuka
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
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.improve_future.midi_sample

import com.improve_future.sound.*
import javax.sound.midi.MidiSystem

object Main {
    @JvmStatic
    fun main(vararg args: String) {
        (MidiSystem.getSynthesizer()) {
            Player {
                channel = channels[0]
                tempo = Tempo.Grave

                arrayOf(
                    Note.C4, Note.D4, Note.E4, Note.F4, Note.G4, Note.A4, Note.B4
                ).forEach { p(it) }

                arrayOf(Chord.C, Chord.G).
                    forEach { p(it) }

                p(Note.C4, Note.E4, Note.G4)
            }

            Player {
                channel = channels[0]
                tempo = Tempo.Prestissimo

                p(Note.C4, Note.E4)
                p(Note.D4, Note.D4 + 3)
                p(Note.E4, Note.E4 + 3)
            }
        }
    }
}