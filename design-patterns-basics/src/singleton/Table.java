/**
 * 
 */
package singleton;

import java.util.UUID;

public class Table {
	
	private String tableId;
	
	Table(){
		this.tableId = UUID.randomUUID().toString();
	}
	
	public static void main(String[] args){
		
		Music music = new Music();
		Table table = new Table();
		MusicJob musicJob = new MusicJob(music.getMusicId(), table.getTableId());
		
		MusicPlayer.getInstance().playMusic(musicJob);
		MusicPlayer.getInstance().cancelMusic(musicJob.getMusicJobId());
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	
}
