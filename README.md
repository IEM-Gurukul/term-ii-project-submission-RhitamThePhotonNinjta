[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Multi-Threaded Hospital Emergency Management
System

## Problem Statement (max 150 words)

Hospital emergency departments often face situations where multiple patients arrive at the same time with different levels of urgency. Without proper organization, critical patients may not receive timely treatment, which can lead to serious consequences.

This project develops a Multi-Threaded Hospital Emergency Management System using Java and Object-Oriented Programming concepts. The system allows users to register patients, assign priority levels (Critical, Serious, Normal), and manage them . Multiple doctors work simultaneously
to treat patients efficiently.

Users can also select their preferred doctor, and appropriate treatment is provided based on the patient’s condition. The system ensures that patients with higher priority are treated first, simulating a real-world emergency handling scenario.

## Target User

 - Hospital emergency department staff

 - Doctors and medical assistants

 - Hospital administrators

 - Students learning Java and OOP concepts

 - Educational institutions for project demonstration

## Core Features

  - Patient registration (name, disease, priority)

  - Doctor selection by user (from available list)

  - Condition-based treatment system (Medicine, First Aid, Surgery)

  - Priority-based decision (critical patients get emergency treatment)

  - Object-Oriented design using classes and objects

  - Inheritance and polymorphism in treatment classes

  - Exception handling for invalid inputs

  - Loop-based system to handle multiple patients


## OOP Concepts Used

- Abstraction:
- Inheritance:
- Polymorphism:
- Exception Handling:
- Collections / Threads:

---

## Proposed Architecture Description

The system is designed using Object-Oriented Programming principles with multiple classes interacting together. The main class controls the program flow and handles user input. The Patient class stores patient details such as name, condition, and priority using encapsulation. The Doctor class is responsible for examining the patient and deciding the appropriate treatment.
The Treatment class acts as a base class, while subclasses like Medicine, FirstAid, and Surgery extend it, demonstrating inheritance and polymorphism. Based on the patient’s condition and priority, the doctor dynamically selects the appropriate treatment method. Exception handling is used to manage invalid inputs and ensure smooth program execution. This architecture provides a simple and clear simulation of a hospital treatment system.

## How to Run

1.Open Command Prompt / Terminal

2.Navigate to the folder where your Java files are saved

    cd path_to_your_folder

3.Make sure all classes are either:

 * In the same file (only one public class), OR
 * In separate files with correct names:
      - Hospital.java
      - Patient.java
      - Doctor.java
      - Treatment.java
      - FirstAid.java
      - Surgery.java
      - Medicine.java

4.Compile the program:

    javac *.java

5.Run the program:

    java Hospital

6.Enter patient details when prompted:

   -  Name: -

   -  Disease (fever/injury/heart): -

   -  Priority (normal/critical): -

   -  Select doctor (1, 2, or 3): -

7.The system will assign a doctor and display the treatment

8.Choose whether to add another patient (yes/no)

9.The program will stop when you enter no

## Git Discipline Notes
Minimum 10 meaningful commits required.
