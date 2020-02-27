/**
 * 
 */
package singleton;

public class MusicJob {
	
	
	private String musicJobId;
	private String musicId;
	private String tableId;
	
	
	public MusicJob(String musicId, String tableId){
		
		this.musicJobId = ""; //some id
		this.musicId = musicId;
		this.tableId = tableId;
	}
	
	public String getMusicJobId() {
		return musicJobId;
	}
	public void setMusicJobId(String musicJobId) {
		this.musicJobId = musicJobId;
	}
	public String getMusicId() {
		return musicId;
	}
	public void setMusicId(String musicId) {
		this.musicId = musicId;
	}
	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	
}
