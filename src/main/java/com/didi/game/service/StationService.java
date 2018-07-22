package com.didi.game.service;

import com.didi.game.dao.StationMapper;
import com.didi.game.domain.Station;
import com.didi.game.domain.StationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    @Autowired
    StationMapper stationMapper;

    public List<Station> getStations(Integer type) {
        StationExample example = new StationExample();

        if (type != null && !type.equals(-1)) {
            example.createCriteria().andParkStructEqualTo(type);
        }
        List<Station> stations = stationMapper.selectByExample(example);

        return stations;
    }

    public Boolean update(Station station) {
        if (station != null) {
            stationMapper.updateByPrimaryKey(station);
        }
        return true;
    }

    public Boolean insert(Station station) {
        if (station != null) {
            stationMapper.insert(station);
        }
        return true;
    }

    public Boolean delete(Integer id) {
        if (id != null) {
            stationMapper.deleteByPrimaryKey(id);
        }
        return true;
    }

}
