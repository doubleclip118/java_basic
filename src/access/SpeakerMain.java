package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumnUp();
        speaker.volumnUp();
        speaker.volumnDown();
        speaker.showVolum();
    }
}
