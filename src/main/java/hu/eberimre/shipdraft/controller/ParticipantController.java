package hu.eberimre.shipdraft.controller;

import hu.eberimre.shipdraft.DTO.*;
import hu.eberimre.shipdraft.service.ParticipantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/participant")
public class ParticipantController {
    private final ParticipantService participantService;


    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @GetMapping
    public ResponseEntity<List<ParticipantDataDetails>> getAllParticipants() {
        return new ResponseEntity<>(participantService.getAllParticipants(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ParticipantDataDetails> updateParticipant(
            @RequestBody ParticipantDataDetails participantDataDetails) {
        return new ResponseEntity<>(participantService.updateParticipant(participantDataDetails), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParticipantDataDetails> getParticipantData(@PathVariable Integer id) {
        return new ResponseEntity<>(participantService.getParticipantData(id), HttpStatus.OK);
    }


    @GetMapping("/formData")
    public ResponseEntity<ParticipantFormData> getParticipantFormData() {
        ParticipantFormData formData = new ParticipantFormData(getAccommodationTypeOptions(), getBoatTypeOptions(),
                getPositionTypeOptions());
        return new ResponseEntity<>(formData, HttpStatus.OK);
    }

    @GetMapping("/formData/accomodation")
    public ResponseEntity <List<AccommodationTypeOption>> getParticipantFormAccomodationData() {
        return new ResponseEntity<>(participantService.getAllAccommodationType(), HttpStatus.OK);
    }

    @GetMapping("/formData/boat")
    public ResponseEntity <List<BoatTypeOption>> getParticipantFormBoatData() {
        return new ResponseEntity<>(participantService.getAllBoatTypeOptions(), HttpStatus.OK);
    }

    @GetMapping("/formData/position")
    public ResponseEntity <List<PositionTypeOption>> getParticipantFormPositionData() {
        return new ResponseEntity<>(participantService.getAllPositionTypeOptions(), HttpStatus.OK);
    }

    private List<AccommodationTypeOption> getAccommodationTypeOptions() {
        return participantService.getAllAccommodationType();
    }

    private List<BoatTypeOption> getBoatTypeOptions() {

        return participantService.getAllBoatTypeOptions();
    }

    private List<PositionTypeOption> getPositionTypeOptions() {
        return participantService.getAllPositionTypeOptions();
    }


}
