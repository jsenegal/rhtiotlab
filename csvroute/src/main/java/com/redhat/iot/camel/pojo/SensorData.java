package com.redhat.iot.camel.pojo;

import lombok.Data;

import java.util.*;

@Data
public class SensorData {
    String offset;
    String name;
    Sensor [] sensors = new Sensor[7];
}
