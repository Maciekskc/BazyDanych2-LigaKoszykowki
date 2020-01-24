package DataLayer.DataAccesLayer;

import DataLayer.Components.PeopleEntity;
import DataLayer.Components.PlayersEntity;
import DataLayer.Components.TeamsEntity;
import DataLayer.Components.Views.MatchResultsEntity;
import DataLayer.Components.Views.PlayersOtherStatEntity;
import DataLayer.Components.Views.PlayersStatEntity;

import java.util.List;

public interface IDataAccess {

    public boolean loginAsUser();
    public boolean loginAsAdmin();

    //select from tables
    public List<PeopleEntity> getAllPeople();
    public List<PlayersEntity> getAllPlayers();
    public TeamsEntity getTeamById(int id);

    //select from views
    public List<PlayersStatEntity> getPlayersStats();
    public List<PlayersOtherStatEntity> getPlayersOtherStats();
    public List<MatchResultsEntity> getMatchResults();

    //insert
    public boolean addPlayerEntity(PlayersEntity player);


    //crud testy :

    //czeka na pomyślne testy 1 i 2
    public void addSimpleMatch();
    public void updateSimpleMatch();
    public void removeSimpleMatch();

    //crud #1 - przetestowane działanie - kontroler - metoda shortTestPerson
    public PeopleEntity createSimplePerson();
    public void addSimplePerson();
    public PeopleEntity getSimplePerson();
    public void updateSimplePerson();
    public void removeSimplePerson();

    //crud #2 - przetestowane działanie - kontroler - metoda shortTestPlayer
    public PlayersEntity createSimplePlayer();
    public void addSimplePlayer();
    public PlayersEntity getSimplePlayer();
    public void updateSimplePlayer();
    public void removeSimplePlayer();

    //pomocniczy getter osoby
    public PeopleEntity getPersonById(Byte id);

    //rzut
    public void addThrow();
    public void removeThrow();

    public MatchResultsEntity getMatchById(long id);
}
