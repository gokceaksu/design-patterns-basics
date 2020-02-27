/**
 * 
 */
package singleton;

import java.util.UUID;

public class Music {
	
	private String musicId;

	Music(){
		this.musicId = UUID.randomUUID().toString();
	}
	
	public String getMusicId() {
		return musicId;
	}
	public void setMusicId(String musicId) {
		this.musicId = musicId;
	}
}
