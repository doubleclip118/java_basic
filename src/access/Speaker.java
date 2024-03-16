package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumnUp(){
        if(volume>=100){
            System.out.println("최대음량입니다 음량을 증가할수없습니다");
        }
        else{
            volume+=10;
            System.out.println("음량을 10증가합니다");
        }
    }

    void volumnDown() {
        volume -= 10;
        System.out.println("음량이 10감소합니다");
    }

    void showVolum(){
        System.out.println("현재음량 : "+volume);
    }
}
