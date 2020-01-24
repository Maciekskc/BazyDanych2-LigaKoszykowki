package DataLayer.DataAccesLayer;

import DataLayer.Components.*;
import DataLayer.Components.Views.MatchResultsEntity;
import DataLayer.Components.Views.PlayersOtherStatEntity;
import DataLayer.Components.Views.PlayersStatEntity;
import org.hibernate.jpa.HibernatePersistenceProvider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;

//interfejs implementacyjny zawierający metody operacji na danych
public class DataAccessImpl implements IDataAccess {

    private  PersistenceProvider persistenceProvider ;
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager ;

    private HashMap hashMap;

    public DataAccessImpl() {
        hashMap = new HashMap();
        if(!loginAsUser()) System.exit(0);
    }

    @Override
    public boolean loginAsUser() {
        try{
            this.persistenceProvider =  new HibernatePersistenceProvider();
            this.entityManagerFactory  = persistenceProvider.createEntityManagerFactory("UserPersistenceUnit",hashMap);
            this.entityManager = entityManagerFactory.createEntityManager();
        }catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean loginAsAdmin() {
        try{
            this.entityManagerFactory  = persistenceProvider.createEntityManagerFactory("AdminPersistenceUnit",hashMap);
            this.entityManager = entityManagerFactory.createEntityManager();
        }catch(Exception e){
            return false;
        }
     return true;
    }

    @Override
    public List<PeopleEntity> getAllPeople() {
        final String SELECT_QUERY ="from PeopleEntity ";
        return entityManager.createQuery(SELECT_QUERY,PeopleEntity.class).getResultList();
    }

    @Override
    public List<PlayersEntity> getAllPlayers() {
        final String SELECT_QUERY ="from PlayersEntity ";
        return entityManager.createQuery(SELECT_QUERY,PlayersEntity.class).getResultList();
    }

    @Override
    public PeopleEntity createSimplePerson() {
        PeopleEntity person = new PeopleEntity();
        Byte x = 104;
        person.setId(x);
        person.setName("ToMnie");
        person.setSurname("Dodano");
        person.setBirthDate(new Time(503000));
        return person;
    }

    @Override
    public void addSimplePerson() {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(createSimplePerson());
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek add simple person*****************************]\n"+e.getMessage());
        }
    }

    @Override
    public PeopleEntity getSimplePerson() {
        PeopleEntity person = createSimplePerson();
        try {
            entityManager.getTransaction().begin();
            person = entityManager.find(PeopleEntity.class, person.getId());
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek get simple person*****************************]\n"+e.getMessage());
        }
        return person;
    }

    @Override
    public void updateSimplePerson() {
        PeopleEntity person = createSimplePerson();
        try {
            entityManager.getTransaction().begin();
            person = entityManager.find(PeopleEntity.class, person.getId());
            person.setName("Błażej");
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek update simple person*****************************]\n"+e.getMessage());
        }
    }

    @Override
    public void removeSimplePerson() {
        PeopleEntity person = createSimplePerson();
        try {
            entityManager.getTransaction().begin();
            person = entityManager.find(PeopleEntity.class, person.getId());
            entityManager.remove(person);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek remove simple person*****************************]\n"+e.getMessage());
        }
    }

    @Override
    public PlayersEntity createSimplePlayer() {
        PlayersEntity player = new PlayersEntity();
        Byte x = 104;
        player.setId(x);
        //player.setPeopleByPeopleId(createSimplePerson());
        player.setPeopleId(x);
        player.setJerseyNr(12);
        player.setTeamsId(1);
        return player;
    }

    @Override
    public void addSimplePlayer() {
        PlayersEntity player = createSimplePlayer();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(player);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek remove simple player*****************************]\n"+e.getMessage());
        }
    }

    @Override
    public PlayersEntity getSimplePlayer() {
        PlayersEntity player = createSimplePlayer();
        try {
            entityManager.getTransaction().begin();
            player = entityManager.find(PlayersEntity.class, player.getId());
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek get simple player*****************************]\n"+e.getMessage());
        }
        return player;
    }

    @Override
    public void updateSimplePlayer() {
        PlayersEntity player = createSimplePlayer();
        try {
            entityManager.getTransaction().begin();
            player = entityManager.find(PlayersEntity.class, player.getId());
            player.setJerseyNr(99);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek update simple player*****************************]\n"+e.getMessage());
        }
    }

    @Override
    public void removeSimplePlayer() {
        PlayersEntity player = createSimplePlayer();
        try {
            entityManager.getTransaction().begin();
            player = entityManager.find(PlayersEntity.class, player.getId());
            entityManager.remove(player);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek remove simple player*****************************]\n"+e.getMessage());
        }
    }

    @Override
    public PeopleEntity getPersonById(Byte id) {
        PeopleEntity person = null;
        try {
            entityManager.getTransaction().begin();
            person = entityManager.find(PeopleEntity.class, id);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek get simple person*****************************]\n"+e.getMessage());
        }
        return person;
    }

    @Override
    public void addThrow() {
        IncidentsEntity incident = new IncidentsEntity();
        incident.setId(220L);
        incident.setTime("12:12");
        incident.setQuater(true);
        incident.setMatchesId(1L);

        ShotsEntity shot = new ShotsEntity();
        short x= 140;
        byte id = 1;
        shot.setId(x);
        shot.setValue(true);
        shot.setHit("1");
        shot.setIncidentsId(220);
        shot.setPlayersId(id);


        try {
            entityManager.getTransaction().begin();
            entityManager.persist(incident);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek dodanie zdarzenia*****************************]\n"+e.getMessage());
        }

        try{
            entityManager.getTransaction().begin();
            entityManager.persist(shot);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek dodanie rzutu*****************************]\n"+e.getMessage());
        }


    }

    @Override
    public void removeThrow() {
        IncidentsEntity incident = new IncidentsEntity();
        ShotsEntity shot = new ShotsEntity();
        long incidentID = 220;
        try{
            entityManager.getTransaction().begin();
            shot = entityManager.find(ShotsEntity.class,(short)140);
            entityManager.remove(shot);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek usuniecie rzutu*****************************]\n"+e.getMessage());
        }

        try {
            entityManager.getTransaction().begin();
            incident = entityManager.find(IncidentsEntity.class,220);
            entityManager.remove(incident);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek usuniecie zdarzenia*****************************]\n"+e.getMessage());
        }
    }

    @Override
    public List<PlayersStatEntity> getPlayersStats() {
        final String SELECT_QUERY ="from PlayersStatEntity";
        return entityManager.createQuery(SELECT_QUERY,PlayersStatEntity.class).getResultList();
    }

    @Override
    public List<PlayersOtherStatEntity> getPlayersOtherStats() {
        final String SELECT_QUERY ="from PlayersOtherStatEntity";
        return entityManager.createQuery(SELECT_QUERY,PlayersOtherStatEntity.class).getResultList();
    }

    @Override
    public List<MatchResultsEntity> getMatchResults() {
        final String SELECT_QUERY ="from MatchResultsEntity ";
        return entityManager.createQuery(SELECT_QUERY,MatchResultsEntity.class).getResultList();
    }
    @Override
    public MatchResultsEntity getMatchById(long id) {
        MatchResultsEntity match = new MatchResultsEntity();
        try {
            entityManager.getTransaction().begin();
            match = entityManager.find(MatchResultsEntity.class,id);
            entityManager.getTransaction().commit();
        }catch(Exception e){
            System.out.println("[************************Wyjątek usuniecie zdarzenia*****************************]\n"+e.getMessage());
        }
        return match;
    }


    @Override
    public TeamsEntity getTeamById(int id) {
        final String SELECT_QUERY ="from TeamsEntity where id = :id ";
        return entityManager.createQuery(SELECT_QUERY,TeamsEntity.class).setParameter("id", (long)id).getSingleResult();
    }
}
