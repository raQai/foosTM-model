package de.kongfoos.foostm.model.team;

import de.kongfoos.foostm.model.player.IPlayer;

public abstract class TeamImpl<P extends IPlayer> implements ITeam<P>{
    
	private long id;
	
	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
    public boolean isSingles() {
        return getType().equals(Type.SINGLES);
    }

    public boolean isDoubles() {
        return getType().equals(Type.DOUBLES);
    }

    public boolean isTeam() {
        return getType().equals(Type.TEAM);
    }
}
