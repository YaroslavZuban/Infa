import javax.sound.midi.*;
import java.util.Scanner;

public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();

       /* if (args.length < 2) {
            System.out.println("Не забудьте аргументы для инстумента и ноты");
        } else {*/
        int instrument = 9; //Integer.parseInt(args[0]);
        int note = 15;//Integer.parseInt(args[1]);
        mini.play(instrument, note);
        //}
    }

    public void play(int instrument, int note) {
        Scanner scanner = new Scanner(System.in);
        boolean isPlay = true;
        while (isPlay) {
            System.out.println("Введите что что нужно сделать:");
            System.out.println("l - проиграть еще.\nk - закончить проигрывание");
            String line = scanner.nextLine();
            if ("l".equals(line)) {
                try {
                    Sequencer player = MidiSystem.getSequencer();
                    player.open();
                    Sequence seq = new Sequence(Sequence.PPQ, 4);
                    Track track = seq.createTrack();

                    MidiEvent event = null;

                    ShortMessage first = new ShortMessage();
                    first.setMessage(192, 1, instrument, 0);
                    MidiEvent changeInstrument = new MidiEvent(first, 1);
                    track.add(changeInstrument);

                    ShortMessage a = new ShortMessage();
                    a.setMessage(144, 1, note, 100);
                    MidiEvent noteOn = new MidiEvent(a, 1);
                    track.add(noteOn);

                    ShortMessage b = new ShortMessage();
                    b.setMessage(128, 1, note, 100);
                    MidiEvent noteOff = new MidiEvent(b, 16);
                    track.add(noteOff);
                    player.setSequence(seq);
                    player.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }else{
                isPlay=false;
            }
        }
    }
}
