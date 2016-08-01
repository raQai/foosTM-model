package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.team.ITeam;

import javax.validation.constraints.NotNull;

public interface IMatch<T extends ITeam> {

    long getId();

    void setId(long id);

    T getTeam1();

    void setTeam1(@NotNull T team);

    T getTeam2();

    void setTeam2(@NotNull T team);

    MatchStatus getStatus();

    void setStatus(@NotNull MatchStatus status);

    boolean isDraw();

    void setDraw();

    boolean isOpen();

    void setOpen();

    T getWinner();

    void setWinner(@NotNull T team);

}
