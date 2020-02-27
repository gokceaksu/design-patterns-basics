/**
 * 
 */
package singleton;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	
	
	private List<MusicJob> musicJobList = new ArrayList<>();
	
	private MusicPlayer(){
	}
	
	private static class MusicPlayerHelper{
		private static final MusicPlayer theMusicPlayer = new MusicPlayer();
	}
	
	/** no need for synchronization, lazy initialization */
	public static MusicPlayer getInstance(){
		return MusicPlayerHelper.theMusicPlayer;
	}
	
	
	public void playMusic(MusicJob music){
		musicJobList.add(music);
	}
	
	public void cancelMusic(String musicJobId){
		
		if(!musicJobList.isEmpty()){
			musicJobList.removeIf(s->s.getMusicJobId().equals(musicJobId));
		}
	}
}
