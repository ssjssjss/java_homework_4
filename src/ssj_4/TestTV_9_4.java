package ssj_4;

public class TestTV_9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV_9_3 tv1=new TV_9_3();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		TV_9_3 tv2=new TV_9_3();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		System.out.println("tv1's channel is "+tv1.channel+" and the volumeLevel is "+tv1.volumeLevel);
		System.out.println("tv2's channel is "+tv2.channel+" and the volumeLevel is "+tv2.volumeLevel);
	}

}
