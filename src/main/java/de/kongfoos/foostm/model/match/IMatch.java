package de.kongfoos.foostm.model.match;

import de.kongfoos.foostm.model.team.TeamImpl;

import javax.validation.constraints.NotNull;

interface IMatch<T extends TeamImpl> {

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
