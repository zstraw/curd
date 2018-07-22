package com.didi.game.controller;

import com.didi.game.common.Result;
import com.didi.game.domain.Station;
import com.didi.game.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author zy
 */
@RestController
@RequestMapping(value = "zy/3/stations", produces = MediaType.APPLICATION_JSON_VALUE)
public class StationController {

    @Autowired
    StationService stationService;

    @RequestMapping(method = RequestMethod.GET)
    public Result getStation(Integer type) {
        List<Station> stations = stationService.getStations(type);
        return new Result(stations);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Result updateStation(@RequestBody Station station) {
        Boolean result = stationService.update(station);
        return new Result(result);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result insertStation(@RequestBody Station station) {
        Boolean result = stationService.insert(station);
        return new Result(result);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public Result delStation(@PathVariable(value = "id") Integer id) {
        Boolean result = stationService.delete(id);
        return new Result(result);
    }
}
