package fr.sorbonne.paris.nord.university.tpteamshandlingapi.controller;

import fr.sorbonne.paris.nord.university.tpteamshandlingapi.dto.TeamDto;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.manager.TeamManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {


    private final TeamManager teamManager;

    public TeamController(
            TeamManager teamManager) {
        this.teamManager = teamManager;
    }

    @GetMapping("/hello")
    public String getTeams() {
        return "Hello World";
    }

    @PostMapping
    public TeamDto createTeam(@RequestBody TeamDto teamDto) {
        return teamManager.createTeam(teamDto);
    }

    @GetMapping
    public List<TeamDto> getAllTeam() {
        return teamManager.getAllTeam();
    }

    @GetMapping(path = "/{id}")
    public TeamDto getTeamById(@PathVariable long id) {
        return teamManager.getTeamById(id);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteTeamById(@PathVariable long id) {
        try {
            teamManager.deleteTeamById(id);
            return new ResponseEntity<>("Team with id+ " + id + "has been deleted successfully.", HttpStatus.OK);
        } catch (Exception excp) {
            System.out.println(excp.getMessage());
            return new ResponseEntity<>("Team with " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }
};






