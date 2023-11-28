package fr.sorbonne.paris.nord.university.tpteamshandlingapi.service;

import fr.sorbonne.paris.nord.university.tpteamshandlingapi.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    TeamRepository teamRepository;

    /**
     *
     * @param teamRepository
     */
    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<TeamEntity>getAllTeam(){
        return teamRepository.findAll();
    }

    public Optional<TeamEntity>findById(Long id){
        return teamRepository.findById(id);
    }

    public TeamEntity insert(TeamEntity teamEntity){
        return teamRepository.save(teamEntity);
    }

    public void delete(Long id) {
        Optional<TeamEntity> teamEntity = teamRepository.findById(id);
        if (teamEntity.isPresent()) {
            teamRepository.delete(teamEntity.get());
        } else {
            System.out.println("Team entity not found with Id : " + id);
        }
    }

}
