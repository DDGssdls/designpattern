package cn.edu.designpattern.facade;

/**
 * @Author: DDG
 * @Date: 2020/5/3 17:06
 * @Description:
 */
public class HomeTheaterFacade {

    private DvdPlayer dvdPlayer;

    private Popcorn popcorn;

    private Projector projector;

    private Stereo stereo;

    private Screen screen;

    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.dvdPlayer = DvdPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.stereo = Stereo.getInstance();
        this.screen = Screen.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }
    // 将上面的复杂的过程简化成四步：
    public void ready(){
        dvdPlayer.on();
        popcorn.on();
        projector.on();
        screen.down();
        stereo.on();
        theaterLight.off();
    }
    // 进行播放；
    public void play(){
        dvdPlayer.play();
    }
    // 暂停操作：
    public void parse(){
        dvdPlayer.off();
    }
    // 结束部分：
    public void end(){
        dvdPlayer.off();
        popcorn.off();
        screen.up();
        projector.off();
        stereo.off();
        theaterLight.on();
    }
}
