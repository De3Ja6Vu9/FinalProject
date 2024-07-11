package com.example.Springboot.controller.impl;

import com.example.Springboot.Model.Training;
import com.example.Springboot.controller.dto.TrainingHoursDTO;
import com.example.Springboot.controller.interfaces.ITrainingController;
import com.example.Springboot.service.interfaces.ITrainingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TrainingController implements ITrainingController {
    @Autowired
    ITrainingService trainingService;


    //*********************************************    GET    *********************************************************

    @GetMapping("/training")
    public List<Training> getAllTraining() {
        return trainingService.getAllTraining();
    }

    @GetMapping("/training/{training}")
    public Training getTrainingById(@PathVariable String training) {
        return trainingService.getTrainingById(training);

    }

    @GetMapping("/training/hours")
    public List<Training> getTrainingByHoursLessThan(@RequestParam(defaultValue = "50") Integer hours) {
        return trainingService.getTrainingByHoursLessThan(hours);
    }

    @GetMapping("/training/gym")
    public List<Training> getTrainingByGymAndHours(
            @RequestParam(defaultValue = "R1") String gym,
            @RequestParam Optional<Integer> hours
    ) {
        return trainingService.getTrainingByGymAndHours(gym, hours);
    }

    //****************************************    POST    *************************************************************

    @PostMapping("/training")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveTraining(@RequestBody @Valid Training training) {
        trainingService.saveTraining(training);
    }

    //***********************************     PUT     *****************************************************************

    @PutMapping("/training/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTraining(@PathVariable @Valid String id, @RequestBody @Valid Training training) {
        trainingService.updateTraining(training, id);
    }

    //**************************************     PATCH     ************************************************************

    @PatchMapping("/training/hours/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTrainingHours(@RequestBody @Valid TrainingHoursDTO trainingHoursDTO, @PathVariable @Valid String id) {
        trainingService.updateTrainingHours(trainingHoursDTO.getHours(), id);
    }

    //*********************     DELETE     ********************

    @DeleteMapping("/training/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTraining(@PathVariable String id) {
        trainingService.deleteTraining(id);
    }
}

