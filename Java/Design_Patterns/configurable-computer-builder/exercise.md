# Exercise: Configurable Computer Builder

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 1

## ChatGpt Prompt
generate an exercise practicing Builder design pattern.
should follow these specifications:
1. should be relatively simple, but not to simple.
2. should take a classic subject which builder is suited for.
3. should have 2-3 different products based on a certain class, with 2-3 different builders.
4. should have director.
5. should highlight that builder is needed to address optional values to avoid an ugly constructor or creating subclasses

## Description

### Exercise: Configurable Computer Builder
Objective: Practice using the Builder Design Pattern by constructing different types of computers with optional configurations.

### Problem Statement:

You're working for a computer manufacturing company that produces different types of computers:
1. Gaming PC – High-end hardware with an optional water-cooling system.
2. Office PC – Balanced configuration, no extra features.
3. Workstation – Powerful for professional use, can include optional GPU acceleration.

Each Computer consists of:
- Mandatory fields: CPU, RAM, Storage
- Optional fields: GPU, Cooling System, Power Supply

Since some configurations have optional components, a Builder pattern is needed to avoid:
- An ugly constructor with too many parameters
- Creating subclasses for each type of computer

A Director will handle pre-defined configurations.

### Instructions:
Implement the Builder pattern to create different computers.
Steps:
1. Create a Computer class with mandatory and optional attributes.
2. Implement three builders:
  - GamingPCBuilder
  - OfficePCBuilder
  - WorkstationPCBuilder
3. Implement a Director class to build pre-configured setups.
4. Demonstrate usage in a main method.

### Hints & Guidance:
- The Computer class should have private constructors and only be instantiated via builders.
- The Director should provide methods like buildGamingPC() to return pre-configured computers.
- Each builder should allow setting optional fields while enforcing required fields.

### Expected Output Example (when running the main method):

Gaming PC Configuration:
CPU: Intel i9, RAM: 32GB, Storage: 1TB SSD, GPU: RTX 4090, Cooling: Water Cooling, PSU: 850W

Office PC Configuration:
CPU: Intel i5, RAM: 16GB, Storage: 512GB SSD, GPU: None, Cooling: Air Cooling, PSU: 500W

Workstation Configuration:
CPU: AMD Ryzen 9, RAM: 64GB, Storage: 2TB NVMe, GPU: RTX 3090, Cooling: Air Cooling, PSU: 1000W
Would you like a pre-written solution for reference, or would you like to attempt it first?

## ChatGpt Solution

[solution by ChatGpt](resources/Solution%20By%20ChatGpt.docx)