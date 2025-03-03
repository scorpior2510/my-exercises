# Exercise: Traffic Lights with Timing

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 1

## Description
- Objective: Simulate a traffic light system using enums.
- Instructions:
  - Create an enum called TrafficLight with constants RED, YELLOW, and GREEN.
  - Associate each light with a duration in seconds (RED = 60, YELLOW = 5, GREEN = 30).
  - Add a method getNextLight() that returns the next traffic light in sequence (RED -> GREEN -> YELLOW -> RED).
  - Add another method getDuration() that returns the duration of the current light.
  - Create a main method that:
    - Simulates a traffic light cycle for 5 iterations, printing the current light, its duration, and the next light.
- Hint:
  - Enum constants can have methods and fields, which is useful for associating custom data or behaviors with each constant.