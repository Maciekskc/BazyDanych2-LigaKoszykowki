package DataLayer.DataAccesLayer;

import DataLayer.Components.PeopleEntity;
import DataLayer.Components.PlayersEntity;
import DataLayer.Components.TeamsEntity;
import DataLayer.Components.Views.MatchResultsEntity;
import DataLayer.Components.Views.PlayersOtherStatEntity;
import DataLayer.Components.Views.PlayersStatEntity;

import java.util.List;

//interfejs programistyczny zawierające metody operacji na na zewnętrzej bazie danych
public interface IDataAccess {

    //metody logowania do odpowiedniego panelu
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

    //crud funkcjonalności, metody sprawdzające operacje na poszczególnych tabelach domyślnie tworzonymi obiektami

    //crud #1 - sprawdzone działanie - kontroler - metoda shortTestPerson
    public PeopleEntity createSimplePerson();
    public void addSimplePerson();
    public PeopleEntity getSimplePerson();
    public void updateSimplePerson();
    public void removeSimplePerson();

    //crud #2 - sprawdzone działanie - kontroler - metoda shortTestPlayer
    public PlayersEntity createSimplePlayer();
    public void addSimplePlayer();
    public PlayersEntity getSimplePlayer();
    public void updateSimplePlayer();
    public void removeSimplePlayer();

    //pomocniczy getter osoby
    public PeopleEntity getPersonById(Byte id);

    // #3 - przetestowane działanie - dodawanie/usuwanie zdrzenia z przypisanym rzutem
    public void addThrow();
    public void removeThrow();

    public MatchResultsEntity getMatchById(long id);
}
