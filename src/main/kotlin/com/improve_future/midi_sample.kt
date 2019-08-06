package com.improve_future

import com.improve_future.sound.*
import javax.sound.midi.MidiSystem

object midi_sample {
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