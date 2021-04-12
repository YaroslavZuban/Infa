import javax.sound.midi.*;
import java.util.Scanner;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
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

                    ShortMessage a = new ShortMessage();
                    a.setMessage(192, 1, 102, 0);
                    MidiEvent noteOn = new MidiEvent(a, 1);
                    track.add(noteOn);

                    ShortMessage b = new ShortMessage();
                    b.setMessage(192, 1, 102, 0);
                    MidiEvent noteOff = new MidiEvent(b, 3);
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
