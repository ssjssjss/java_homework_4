package ssj_4;

public class TV_9_3 {	
		int channel=1;
		int volumeLevel=1;
		boolean on=false;
		TV_9_3(){
		}
		public void turnOn(){
			on=true;
		}
		public void turnOff(){
			on=false;
		}
		void setChannel(int newChannel){
			channel=newChannel;
		}
		void setVolume(int newVolumeLevel){
			volumeLevel=newVolumeLevel;
		}
		public void channelUp(){
			if(channel<120&&on)
				channel++;
		}
		public void channelDown(){
			if(channel>1&&on)
				channel--;
		}
		public void volumeUp(){
			if(volumeLevel<7&&on)
				volumeLevel++;
		}
		public void volumeDown(){
			if(volumeLevel>1&&on)
				volumeLevel--;
		}
	}


